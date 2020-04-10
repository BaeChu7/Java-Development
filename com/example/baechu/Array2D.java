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
 * �ۼ��� : ������
 * �ۼ��� : 2020-04-05
 * �� �� : 6 X 6 2���� �迭���� �𷡽ð� ��� �������� �� ����� ���� ���� ū �� ���ϱ�
 * Ư�̻��� :
 *  2020-04-07) ���� �� indexoutofbounds ���� ó��
 *  2020-04-10) ������ 3 X 3 �迭�� �� ���ϱ�
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
				arr[i][j] = arrItem; // arr[��][��]
			}
		}

		scanner.close();

		System.out.println(findMaxValue(arr));
	}
}
