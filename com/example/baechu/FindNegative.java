package com.example.baechu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 작성자 : 최희은
 * 작성일 : 2020-04-12
 * 내 용 : SubArray에서 각 수를 sum한 것 중 음의 값을 갖는 SubArray의 갯수
 */
public class FindNegative {
	public static int subArraySum(Integer[] sarr) {
		int sum = 0;

		for (int i = 0; i < sarr.length; i++)
			sum += sarr[i];

		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		Integer[] arr = new Integer[a];
		for (int i = 0; i < a; i++) {
			arr[i] = scan.nextInt();
		}

		ArrayList<Integer[]> arr2 = new ArrayList<Integer[]>();

		// 배열 안에서 연속된 수의 SubArray 구하기
		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j <= a; j++) {
				arr2.add(Arrays.copyOfRange(arr, i, j));
			}
		}

		int cnt = 0;

		for (int i = 0; i < arr2.size(); i++) {
			if (subArraySum(arr2.get(i)) < 0) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
