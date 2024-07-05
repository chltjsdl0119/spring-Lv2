package org.sparta.springlv2.service;

import org.sparta.springlv2.dto.UserRequestDto;
import org.sparta.springlv2.dto.UserResponseDto;
import org.sparta.springlv2.entity.User;
import org.sparta.springlv2.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = new User(userRequestDto);
        userRepository.save(user);
        UserResponseDto userResponseDto = new UserResponseDto(user);
        return userResponseDto;
    }
}
