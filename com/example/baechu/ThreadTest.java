package com.example.baechu;

/*
작성자 : 최희은
작성일 : 2020-04-03
내   용 : 멀티스레드 우선순위 체크
*/
public class ThreadTest extends Thread {
	public ThreadTest(String name) {
		setName(name); // Thread 안에 있는 메소드 -> Thread 명 지정하기
	}

	@Override
	public void run() { // Thread 안에 있는 메소드 재정의 -> Thread 실제 실행하기
		for (long i = 0; i < 2000000000; i++) {

		}
		System.out.println(getName()); // Thread 안에 있는 메소드 -> Thread 명 가져오기
	}
}
