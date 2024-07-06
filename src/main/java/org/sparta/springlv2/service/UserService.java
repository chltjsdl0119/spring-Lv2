package org.sparta.springlv2.service;

import org.sparta.springlv2.dto.LoanRecordResponseDto;
import org.sparta.springlv2.dto.UserRequestDto;
import org.sparta.springlv2.dto.UserResponseDto;
import org.sparta.springlv2.entity.Book;
import org.sparta.springlv2.entity.Loan;
import org.sparta.springlv2.entity.User;
import org.sparta.springlv2.repository.BookRepository;
import org.sparta.springlv2.repository.LoanRepository;
import org.sparta.springlv2.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final LoanRepository loanRepository;
    private final BookRepository bookRepository;

    public UserService(UserRepository userRepository, LoanRepository loanRepository, BookRepository bookRepository) {
        this.userRepository = userRepository;
        this.loanRepository = loanRepository;
        this.bookRepository = bookRepository;
    }

    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = new User(userRequestDto);
        userRepository.save(user);
        UserResponseDto userResponseDto = new UserResponseDto(user);
        return userResponseDto;
    }

    public LoanRecordResponseDto getRecord(Long userId) {
        User user = userRepository.findByUserId(userId).orElseThrow(() ->
                new IllegalArgumentException("User not found!"));
        Loan loan = loanRepository.findByUserIdAndReturnStatusIsFalse(userId).orElseThrow(() ->
                new IllegalArgumentException("Loan not found!"));
        Book book = bookRepository.findByBookId(loan.getBookId()).orElseThrow(() ->
                new IllegalArgumentException("Book not found!"));
        return new LoanRecordResponseDto(user, book);
    }
}
