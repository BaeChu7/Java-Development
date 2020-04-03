package com.example.baechu;

import java.util.Scanner;
/*
작성자 : 최희은
작성일 : 2020-04-02
내   용 : LinkedList 구현
특이사항 : LinkedList는 인덱스 기반으로 요소들을 관리하는 ArrayList와는 다르게
		인접해 있는 요소들에 대한 정보를 가지고 있으므로 Insert와 Update에 용이
		+ ArrayList는  멀티스레드 환경에서 동시에 스레드 실행이 가능하며
		+ Vector는 비동기 방식으로 한 스레드에서 접근중이면 다른 스레드가 접근 불가
		2020.04.03) cmd 창으로 데이터 구현
*/

//5
//12 0 1 78 12
//2
//Insert
//5 23
//Delete
//0

public class LinkedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstint = scan.nextInt();
		String secondstr = scan.nextLine();
		String[] arr = new String[firstint];
		
		

	}
}