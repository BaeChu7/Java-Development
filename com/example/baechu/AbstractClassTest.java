package com.example.baechu;

import java.util.*;

abstract class Book1 {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}

class MyBook1 extends Book1 { // ��ӹ��� Ŭ���� ���� �޼���� �����Ӱ� ��� ����!!
	
	void setTitle(String s) { // abstract�� ����ȰŴ� ������ �����ؾ���
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