package com.example.baechu;
import java.util.*;
public class SubList {
/*
�ۼ��� : ������
�ۼ��� : 2020-04-05
��   �� : ���� �ϳ��� �迭�� �Է¹޾�
               �迭 �ȿ� ���� ������ŭ �κ� �迭�� ���� �� �� ���� ���� ��ҵ� �� ���� ū �� ã��
Ư�̻��� :
*/
	public static int segment(int x, List<Integer> arr) {
		// Write your code here
		List<Integer> minimalLst = new ArrayList<Integer>();

		for (int i = 0; i < arr.size(); i++) {

			if (i + x > arr.size())
				break;

			int min = Collections.min(arr.subList(i, i + x)); // ex)subList(1, 3) : arr.get(1), arr.get(2) �� ���
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