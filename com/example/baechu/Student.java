package com.example.baechu;
/*
�ۼ��� : ������
�ۼ��� : 2020-03-30
��   �� : Comparator�� �̿��� ����� ���� ������ ���� �л� ��ü
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
