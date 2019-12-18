package com.testhttprequestproject.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	/**
	 * 姓名
	 */
	@Value("${name:123}")
	private String name;

	/**
	 * 年龄
	 */
	@Value("${age:20}")
	private String age;



	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}

