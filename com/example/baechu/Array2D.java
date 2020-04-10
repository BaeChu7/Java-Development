package com.example.baechu;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 9 2 -4 -4 0
//0 0 0 -2 0 0
//0 0 -1 -2 -4 0
/*
 * 작성자 : 최희은
 * 작성일 : 2020-04-05
 * 내 용 : 6 X 6 2차원 배열에서 모래시계 모양 기준으로 각 요소의 합이 가장 큰 값 구하기
 * 특이사항 :
 *  2020-04-07) 검증 및 indexoutofbounds 오류 처리
 *  2020-04-10) 가능한 3 X 3 배열의 합 구하기
 */
public class Array2D {
	public static int findMaxValue(int[][] arr) {
		ArrayList<Integer> sumarr = new ArrayList<Integer>();
		
		for (int i = 0 ; i < 4 ; i++) {
			for (int j = 0 ; j < 4 ; j++) {
				int sum = 0;
				
				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
						+ arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2]
					    + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
				
				sumarr.add(sum);
			}
		}
		
		Collections.sort(sumarr, Collections.reverseOrder());

		return sumarr.get(0);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem; // arr[행][열]
			}
		}

		scanner.close();

		System.out.println(findMaxValue(arr));
	}
}
