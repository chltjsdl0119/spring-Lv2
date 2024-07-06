package org.sparta.springlv2.service;

import org.sparta.springlv2.entity.Book;
import org.sparta.springlv2.entity.Loan;
import org.sparta.springlv2.entity.User;
import org.sparta.springlv2.repository.BookRepository;
import org.sparta.springlv2.repository.LoanRepository;
import org.sparta.springlv2.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class LoanService {

    private LoanRepository loanRepository;
    private UserRepository userRepository;
    private BookRepository bookRepository;

    public LoanService(LoanRepository loanRepository, UserRepository userRepository, BookRepository bookRepository) {
        this.loanRepository = loanRepository;
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }

    @Transactional
    public String loanBook(Long userId, Long bookId) {
        Optional<User> userOptional = userRepository.findByUserId(userId);
        if (userOptional.isEmpty()) {
            return "User not found!";
        }

        Optional<Book> bookOptional = bookRepository.findByBookId(bookId);
        if (bookOptional.isEmpty()) {
            return "Book not found!";
        }

        if (loanRepository.existsByUserIdAndReturnStatusIsFalse(userId)) {
            return "User has already borrowed a book!";
        }

        if (loanRepository.existsByBookIdAndReturnStatusIsFalse(bookId)) {
            return "Book has already been borrowed!";
        }

        User user = userOptional.get();
        Book book = bookOptional.get();

        Loan loan = new Loan(user, book);
        loan.setReturnStatus(false);

        loanRepository.save(loan);
        return "Loan created successfully!";
    }

    @Transactional
    public String returnBook(Long userId, Long bookId) {
        Optional<User> userOptional = userRepository.findByUserId(userId);
        if (userOptional.isEmpty()) {
            return "User not found!";
        }

        Optional<Book> bookOptional = bookRepository.findByBookId(bookId);
        if (bookOptional.isEmpty()) {
            return "Book not found!";
        }

        Optional<Loan> loanOptional = loanRepository.findByUserIdAndBookIdAndReturnStatusIsFalse(userId, bookId);
        if (loanOptional.isEmpty()) {
            return "Loan not found!";
        }

        Loan loan = loanOptional.get();
        loan.setReturnStatus(true);

        loanRepository.save(loan);
        return "Book returned successfully!";
    }
}
