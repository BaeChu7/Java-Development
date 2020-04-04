package com.example.baechu;

import java.util.LinkedList;
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

public class LinkedListTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int firstint = scan.nextInt();
//		scan.nextLine(); // nextInt() 시 바로 다음 String a = scan.nextLine()이 오면 엔터가 a에 저장되기 때문에 오류.
//		                 // 따라서 scan.nextLine() 한번 더 쳐줘서 엔터를 먹어버려야 한다.
//		String secondstr = scan.nextLine();
//		String[] arr = secondstr.split(" ");

		LinkedList<Integer> lst = new LinkedList<Integer>();
		
		while (true) {
			lst.add(i, scan.nextInt());

			if (lst.size() == firstint) {
				break; // 다음줄로 안 넘어감. space 구분으로 정수 5개가 입력되면 알아서 다음줄 입력할 수 있도록 수정 필요. key 이벤트 필요?
			}
			i++;
		}
		
		int cnt = scan.nextInt();
		
		for (int a = 0 ; a < cnt * 2 ; a++) {
			String transaction = scan.nextLine();
		//	String transaction = scan.nextLine();
		}
		
		System.out.println(lst.get(2));

	}
}