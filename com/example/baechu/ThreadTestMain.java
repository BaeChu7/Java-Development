package com.example.baechu;

/*
작성자 : 최희은
작성일 : 2020-04-03
내   용 : 멀티스레드 우선순위 체크 Main
특이사항 : 우선순위가 높을수록 실행 시간을 많이 가져감
*/
public class ThreadTestMain {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			Thread thread = new ThreadTest("thread" + i);

			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY); // 기본값은 5 이며, 상수로 지정 가능하다.
			}

			thread.start(); // 스레드가 running 할 수 있도록 실행 공간을 할당까지만 한다.
		}

		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			sumThread.join(); // join() 메서드는 sumThread 메서드의 run() 메서드가 모두 끝날때까지 기다린다는 의미
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("sum: " + sumThread.getSum());
	}
}
