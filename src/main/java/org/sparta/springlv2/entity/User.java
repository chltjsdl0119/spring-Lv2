package org.sparta.springlv2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.sparta.springlv2.dto.UserRequestDto;

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

    @Column(name = "res_num", nullable = false, unique = true)
    private String resNum;

    @Column(name = "ph_num", nullable = false, unique = true)
    private String phNum;

    @Column(name = "address", nullable = false)
    private String address;

    public User(UserRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.sex = requestDto.getSex();
        this.resNum = requestDto.getResNum();
        this.phNum = requestDto.getPhNum();
        this.address = requestDto.getAddress();
    }
}
