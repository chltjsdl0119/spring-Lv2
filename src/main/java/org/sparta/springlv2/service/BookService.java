package org.sparta.springlv2.service;

import org.sparta.springlv2.dto.BookRequestDto;
import org.sparta.springlv2.dto.BookResponseDto;
import org.sparta.springlv2.entity.Book;
import org.sparta.springlv2.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookResponseDto createBook(BookRequestDto bookRequestDto) {
        Book book = new Book(bookRequestDto);
        bookRepository.save(book);
        BookResponseDto bookResponseDto = new BookResponseDto(book);
        return bookResponseDto;
    }
}
