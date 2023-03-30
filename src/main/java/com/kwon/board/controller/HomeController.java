package com.kwon.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	// 회원가입 페이지로 이동
	@GetMapping("/user")
	public String user() {
		return "user";
	}
}
