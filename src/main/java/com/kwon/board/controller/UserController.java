package com.kwon.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.kwon.board.dto.UserDto;
import com.kwon.board.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	
	@PostMapping ("/user/join")
	public String okJoin(UserDto userDto) {
		userService.join(userDto);
		return "mainboard";
	}
	
}
