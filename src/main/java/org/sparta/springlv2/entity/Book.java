package org.sparta.springlv2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.sparta.springlv2.dto.BookRequestDto;

import java.time.LocalDate;

@Entity
@Getter
@Table(name = "book")
@NoArgsConstructor
public class Book extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "language", nullable = false)
    private String language;

    @Column(name = "publisher", nullable = false)
    private String publisher;
}
