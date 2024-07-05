package org.sparta.springlv2.dto;

import lombok.Getter;
import org.sparta.springlv2.entity.User;

@Getter
public class UserResponseDto {
    private String username;
    private String sex;
    private String phNum;
    private String address;

    public UserResponseDto(User user) {
        this.username = user.getUsername();
        this.sex = user.getSex();
        this.phNum = user.getPhNum();
        this.address = user.getAddress();
    }
}
