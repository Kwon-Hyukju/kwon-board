package com.kwon.board.service;


import org.springframework.stereotype.Service;

import com.kwon.board.domain.User;
import com.kwon.board.dto.UserDto;
import com.kwon.board.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	// 회원가입
	public Long join(UserDto userDto) {
		User user = new User();
		user.setUserName(userDto.getUserName());
		user.setUserId(userDto.getUserId());
		user.setPassword(userDto.getPassword());
		userRepository.save(user);
		return user.getId();
	}
	
}
