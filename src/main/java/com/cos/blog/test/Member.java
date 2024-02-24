package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @Getter : get 메서드 자동 생성
 * @Setter : set 메서드 자동 생성
 * @Data : get, set 메서드 자동 생성
 * @NoArgsConstructor : 파라미터가 없는 기본 생성자를 자동으로 생성
 * @AllArgsConstructor : 클래스의 모든 필드에 대한 생성자를 자동으로 생성
 * @RequiredArgsConstructor : 클래스의 필수(non-null 및 final) 필드에 대한 생성자를 자동으로 생성
 */

@Data
@NoArgsConstructor
public class Member {

	private int id;
	private String username;
	private String password;
	private String email;


	@Builder
	public Member(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	

}
