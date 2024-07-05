package org.sparta.springlv2.dto;

import jakarta.persistence.Column;
import lombok.Getter;

@Getter
public class UserRequestDto {
    private String username;
    private String sex;
    private String resNum;
    private String phNum;
    private String address;
}
