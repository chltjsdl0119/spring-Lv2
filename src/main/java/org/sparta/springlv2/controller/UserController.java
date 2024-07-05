package org.sparta.springlv2.controller;

import org.sparta.springlv2.dto.UserRequestDto;
import org.sparta.springlv2.dto.UserResponseDto;
import org.sparta.springlv2.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public UserResponseDto createUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }
}
