package org.sparta.springlv2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "loan")
@NoArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;

    @Column(name = "book_id", nullable = false)
    private Long bookId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "return_status", nullable = false)
    private boolean returnStatus;

    @Column(name = "loan_date", nullable = false)
    private String loanDate;

    @Column(name = "return_date", nullable = false)
    private String returnDate;
}
