package com.example.baechu;

import java.util.*;

abstract class Book1 {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}

class MyBook1 extends Book1 { // 상속받은 클래스 안의 메서드는 자유롭게 사용 가능!!
	
	void setTitle(String s) { // abstract로 선언된거는 무조건 구현해야함
		title = s;
	}
}

public class AbstractClassTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook1 new_novel = new MyBook1();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();

	}
}