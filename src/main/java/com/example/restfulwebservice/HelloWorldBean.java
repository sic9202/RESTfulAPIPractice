package com.example.restfulwebservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // getter, setter 자동 생성
@AllArgsConstructor // 생성자 자동 생성
public class HelloWorldBean {
	private String message;
	
}
