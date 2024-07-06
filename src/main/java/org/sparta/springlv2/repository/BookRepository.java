package org.sparta.springlv2.repository;

import org.sparta.springlv2.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByBookId(Long bookId);
    List<Book> findFirstByBookId(Long bookId);
    List<Book> findAllByOrderByCreatedAt();
}
