package com.example.baechu;

/*
작성자 : 최희은
작성일 : 2020-04-03
내   용 : join() 메소드 용도 확인
*/
class SumThread extends Thread {
	private long sum = 1;

	public long getSum() {
		return sum;
	}

	public void run() { // run() 메소드는 오버라이드 한 것
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
	}
}
