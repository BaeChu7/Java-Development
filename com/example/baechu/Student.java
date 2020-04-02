package com.example.baechu;
/*
작성자 : 최희은
작성일 : 2020-03-30
내   용 : Comparator를 이용한 사용자 지정 정렬을 위한 학생 객체
*/

public class Student {
	// C# ---> public String name {get; set;}
	private String name;
	private int age;
	private String address;

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
