package com.example.baechu;
/*
작성자 : 최희은
작성일 : 2020-03-25
내   용 : 하노이의 탑 구현
특이사항 : 3개의 원판을 기둥 A에서 기둥 C로 이동시키는 법

	 * 하노이의 탑 조건
	 * 1. 한번에 한개의 원판만 옮길 수 있다.
	 * 2. 더 큰 원판이 위에 있을 수 없다.
*/
public class Hanoi2 {
	static int i = 3;

	public static void main(String[] args) {
		movedisk(i, 'A', 'B', 'C');
	}

	/**
	 * @param top  : 원판(가장 맨 위의 원판이 1 밑으로 갈수록 1씩 들어나는 원판)
	 * @param from : 시작 기둥
	 * @param mid  : 시작과 목적지를 제외한 경유 기둥
	 * @param to   : 목적지 기둥
	 * 메소드 설명:
	 * 내가 A에서 C기둥으로 옮기려고 하는 원판을 top이라고 한다면 top-1 의 원판들을 A에서 먼저 B로 옮기고
	 * top 원판을 A에서 C로 그 다음 B에 있던 나머지 원판들을 C로 이동시켜주어야 한다.
	 * 이것을 재귀로 표현 가능
	 */
	public static void movedisk(int top, char from, char mid, char to) {
		if (top == 1) {
			System.out.println("원판 " + top + "가 " + from + "에서" + to + "로 이동합니다.");
		} else {
			movedisk(top - 1, from, to, mid);
			System.out.println("원판 " + top + "가 " + from + "에서" + to + "로 이동합니다.");
			movedisk(top - 1, mid, from, to);
		}
	}
}