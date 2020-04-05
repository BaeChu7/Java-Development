package com.example.baechu;
import java.util.*;
public class SubList {
/*
작성자 : 최희은
작성일 : 2020-04-05
내   용 : 정수 하나와 배열을 입력받아
               배열 안에 정수 갯수만큼 부분 배열을 놓고 그 중 가장 작은 요소들 중 가장 큰 값 찾기
특이사항 :
*/
	public static int segment(int x, List<Integer> arr) {
		// Write your code here
		List<Integer> minimalLst = new ArrayList<Integer>();

		for (int i = 0; i < arr.size(); i++) {

			if (i + x > arr.size())
				break;

			int min = Collections.min(arr.subList(i, i + x)); // ex)subList(1, 3) : arr.get(1), arr.get(2) 만 출력
			minimalLst.add(min);
		}

		return Collections.max(minimalLst);
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);

		System.out.print(segment(2, arr));
	}
}