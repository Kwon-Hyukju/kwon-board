package com.kwon.board.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="test")
@SequenceGenerator(
		name = "user_seq_generator",
		sequenceName = "user_seq",
		initialValue = 1,
		allocationSize = 1
)
public class User {
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE,
			generator = "user_seq_generator")
	@Column(name = "USER_ID")
	private Long id;
	
	private String userName;
	private String userId;
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<Board> board = new ArrayList<Board>();
	
}
