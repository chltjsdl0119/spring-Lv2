package org.sparta.springlv2.dto;

import lombok.Getter;
import org.sparta.springlv2.entity.Book;

import java.time.LocalDateTime;

@Getter
public class BookResponseDto {
    private String title;
    private String author;
    private String language;
    private String publisher;
    private LocalDateTime createdAt;

    public BookResponseDto(Book book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.language = book.getLanguage();
        this.publisher = book.getPublisher();
        this.createdAt = book.getCreatedAt();
    }
}
