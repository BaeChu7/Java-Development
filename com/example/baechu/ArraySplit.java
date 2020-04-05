package com.example.baechu;
import java.util.*;

/*
작성자 : 최희은
작성일 : 2020-04-05
내   용 : 배열 분열 해보기
*/
public class ArraySplit {
	/*
	 * 하나의 배열 두개의 배열로 분할하기
	 */
	public static int splitIntoTwo(List<Integer> arr) {
		List<Integer> leftarr = new ArrayList<Integer>();
		List<Integer> rightarr = new ArrayList<Integer>(arr);

		int cnt = 0;
		int leftSum = 0;
		int rightSum = 0;
		int totalSum = sumArr(arr);

		for (int i = 0; i < arr.size() - 1; i++) {
			leftarr.add(arr.get(i));
			leftSum += leftarr.get(i);

			rightarr.remove(0);
			rightSum = totalSum - leftSum;

			if (leftSum > rightSum) {
				cnt++;
			}
		}

		return cnt;
	}

	/*
	 * List 요소 합계
	 */
	public static int sumArr(List<Integer> array) {
		int sum = 0;

		for (int i = 0; i < array.size(); i++) {
			sum += array.get(i);
		}

		return sum;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(-3);
		arr.add(-2);
		arr.add(10);
		arr.add(20);
		arr.add(-30);
		System.out.print(splitIntoTwo(arr));
	}
}