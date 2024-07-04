package org.sparta.springlv2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "user")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "res_num", nullable = false)
    private String resNum;

    @Column(name = "ph_num", nullable = false)
    private String phNum;

    @Column(name = "address", nullable = false)
    private String address;
}
