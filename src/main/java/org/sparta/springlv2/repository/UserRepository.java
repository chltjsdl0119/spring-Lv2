package org.sparta.springlv2.repository;

import org.sparta.springlv2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
