package com.example.baechu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * �ۼ��� : ������
 * �ۼ��� : 2020-04-12
 * �� �� : SubArray���� �� ���� sum�� �� �� ���� ���� ���� SubArray�� ����
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

		// �迭 �ȿ��� ���ӵ� ���� SubArray ���ϱ�
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
