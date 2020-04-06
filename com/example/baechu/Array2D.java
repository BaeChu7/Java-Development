package com.example.baechu;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Array2D {
/*
작성자 : 최희은
작성일 : 2020-04-05
내 용 : 6 X 6 2차원 배열에서 모래시계 모양 기준으로 각 요소의 합이 가장 큰 값 구하기
특이사항 :
*/
	public static int findMaxValue(int[][] arr) {
		
		ArrayList<Integer> sumarr = new ArrayList<Integer>();
		
		for (int cnt = 0 ; cnt < 16 ; cnt++) {
			for (int i = 0 ; i < 3 ; i++ ) {
				for (int j = 0 ; j < 3 ; j++ ) {
					arr[][]
				}
			}
		}
		
		return max;
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
