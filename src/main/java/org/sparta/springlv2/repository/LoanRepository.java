package org.sparta.springlv2.repository;

import org.sparta.springlv2.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    boolean existsByUserIdAndReturnStatusIsFalse(Long userId);
    boolean existsByBookIdAndReturnStatusIsFalse(Long bookId);
    Optional<Loan> findByUserIdAndBookIdAndReturnStatusIsFalse(Long userId, Long bookId);
}
