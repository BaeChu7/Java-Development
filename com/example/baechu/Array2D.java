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
�ۼ��� : ������
�ۼ��� : 2020-04-05
�� �� : 6 X 6 2���� �迭���� �𷡽ð� ��� �������� �� ����� ���� ���� ū �� ���ϱ�
Ư�̻��� :
*/
	public static int findMaxValue(int[][] arr) {
		int sum = 0;
		ArrayList<Integer> sumarr = new ArrayList<Integer>();
		
		for (int cnt = 0 ; cnt < 4 ; cnt++) {
			for (int i = cnt ; i < cnt + 3 ; i++ ) {
				for (int j = cnt ; j < cnt + 3 ; j++ ) {
					sum	+= arr[i][j];
					sumarr.add(sum);
				}
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
