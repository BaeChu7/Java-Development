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
 * �ۼ��� : ������ �ۼ��� : 2020-04-05 �� �� : 6 X 6 2���� �迭���� �𷡽ð� ��� �������� �� ����� ���� ���� ū ��
 * ���ϱ� Ư�̻��� : 2020-04-07) ���� �� indexoutofbounds ���� ó��
 */
public class Array2D {
	public static int findMaxValue(int[][] arr) {
		ArrayList<Integer> sumarr = new ArrayList<Integer>();
		int[][] valarr;
		
		
		
		
		
		

		Collections.sort(sumarr, Collections.reverseOrder());

		return sumarr.get(0);
	}

	/*
	 * 3 x 3 2���� �迭�� �� ��� ��
	 */
	public static int sum(int[][] arr) {
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += arr[i][j];
			}
		}

		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem; // arr[��][��]
			}
		}

		scanner.close();

		System.out.println(findMaxValue(arr));
	}
}
