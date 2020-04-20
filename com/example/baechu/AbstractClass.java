package com.example.baechu;

import java.util.*;

/*
 * 작성자 : 최희은
 * 작성일 : 2020-04-20
 * 내 용 : 참조)Book 추상클래스
 */
public class AbstractClass {

	// Book book = new Book(); 추상클래스는 인스턴스 생성이 불가능하다. 오로지 부모클래스의 역할만
//	public class MyBook extends Book { // class 내부의 class를 main 메소드가 호출하기 때문에 public static class
//								       // 원래는 클래스는 나눠야함!!!
//		String title;
//
//		public void setTitle(String title) {
//			this.title = title;
//		}
//
//		public String getTitle() {
//			return title;
//		}
//	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();

	}
}