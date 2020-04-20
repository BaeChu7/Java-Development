package com.example.baechu;

/*
 * 작성자 : 최희은
 * 작성일 : 2020-04-20
 * 내 용 : Book 추상클래스
 */
public abstract class Book { // 추상메서드가 최소 한개 이상 들어있는 클래스
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}
