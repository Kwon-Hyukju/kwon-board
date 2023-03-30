package com.kwon.board.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@SequenceGenerator(
		name = "board_seq_generator",
		sequenceName = "board_seq",
		initialValue = 1,
		allocationSize = 1
)
public class Board {
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE,
			generator = "board_seq_generator")
	private Long id;	// 메세지번호
	private String writer; // 작성자
	private String title; // 제목
	private String contents; // 글
	private LocalDate createMessage; // 작성일자
	
	@ManyToOne
	@JoinColumn(name = "USERS_ID")
	private User user;
}
