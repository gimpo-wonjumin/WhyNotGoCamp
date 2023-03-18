package com.spring.web.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(exclude= {"uuid","pwd","email","phone","name","nickname","address"})

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

	private int unum;
	private int age;
	private String uuid;
	private String pwd;
	private String gender;
	private String phone;
	private String email;
	private String name;
	private String  nickname;
	private String address;
}