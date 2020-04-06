package com.example.baechu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Casher {
/*
 * 작성자 : 최희은
 * 작성일 : 2020-04-05
 * 내 용 : 물건들의 가격과 그 물건을 사려고 할때 할인율을 가장 많이 받게 나온 가격 출력하기
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 3100, 2 }, { 7700, 1 }, { 3100, 2 } }; // 물건의 값, 수량 으로 이루어진 2차열 배열
		int[][] arr2 = { { 33, 4 } }; // 할인율과 갯수
		System.out.println(discount(makeList(arr), makeList(arr2)));

	}

	/*
	 * 가장 높게 할인받는 방법으로 할인된 가격 출력
	 */
	private static int discount(List<Integer> list, List<Integer> list2) {
		boolean[] arr = new boolean[1];
		int sum = 0;
		int i = 0;
		try {
			for (i = 0; i < list.size(); i++) {
				sum += Math.round((list.get(i) * (1 - (double) list2.get(i) / 100)));
			}
		} catch (Exception e) { // 할인쿠폰의 갯수보다 금액의 갯수가 더 작으면 현재 금액 그대로 sum에 합류
			for (; i < list.size(); i++) {
				sum += (list.get(i));
			}
		}
		return sum;
	}

	/*
	 * 2차열 배열을 받아 안에 있는 수량만큼 금액 리스트에 넣기
	 * ex)
	 * arr = { { 3100, 2 }, { 7700, 1 }, { 3100, 2 } }
	 * 3100 2
	 * 7700 1
	 * 3100 2
	 * arr[0][1] = 2, arr[1][1] = 1, arr[2][1] = 2
	 * arr[0][0] = 3100, arr[1][0] = 7700, arr[2][0] = 3100
	 */
	private static List<Integer> makeList(int[][] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i][1]; j++) {
				list.add(arr[i][0]);
			}
		}
		// 가장 할인을 많이 받으려면 가장 높은 금액을 먼저 가장 높은 할인율로 받아야 하므로
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}
}
