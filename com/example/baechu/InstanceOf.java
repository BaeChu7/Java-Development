package com.example.baechu;

import java.util.Scanner;

/*
작성자 : 최희은
작성일 : 2019-04-19
내   용 : ArrayList 안에 있는 요소들 중 String만 출력하기
*/
import java.util.*;

public class InstanceOf {

	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		
		while (it.hasNext()) {
			Object element = it.next();

			if (element instanceof String) // element가 String 형이면 true 그렇지 않으면 false 반환

				break;
		}

		return it;
	}

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}

		mylist.add("###");
		
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		Iterator it = func(mylist); // func에서 숫자까지 이미 체크하고 break문으로 빠져나와 연결해서 체크하는 것이기 때문에 그 다음 항목부터 체크
		
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}
	}
}
