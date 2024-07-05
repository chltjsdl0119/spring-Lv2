package org.sparta.springlv2.controller;

import org.sparta.springlv2.dto.BookRequestDto;
import org.sparta.springlv2.dto.BookResponseDto;
import org.sparta.springlv2.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public BookResponseDto createBook(@RequestBody BookRequestDto bookRequestDto) {
        return bookService.createBook(bookRequestDto);
    }

    @GetMapping("/book/{bookId}")
    public BookResponseDto getBook(@PathVariable Long bookId) {
        return bookService.getBook(bookId);
    }
}
