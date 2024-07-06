package org.sparta.springlv2.dto;

import lombok.Getter;
import org.sparta.springlv2.entity.Book;
import org.sparta.springlv2.entity.User;

@Getter
public class LoanRecordResponseDto {
    private String username;
    private String phNum;
    private String bookTitle;
    private String author;

    public LoanRecordResponseDto(User user, Book book) {
        this.username = user.getUsername();
        this.phNum = user.getPhNum();
        this.bookTitle = book.getTitle();
        this.author = book.getAuthor();
    }
}
