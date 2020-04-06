package com.example.baechu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Casher {
/*
 * �ۼ��� : ������
 * �ۼ��� : 2020-04-05
 * �� �� : ���ǵ��� ���ݰ� �� ������ ����� �Ҷ� �������� ���� ���� �ް� ���� ���� ����ϱ�
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 3100, 2 }, { 7700, 1 }, { 3100, 2 } }; // ������ ��, ���� ���� �̷���� 2���� �迭
		int[][] arr2 = { { 33, 4 } }; // �������� ����
		System.out.println(discount(makeList(arr), makeList(arr2)));

	}

	/*
	 * ���� ���� ���ι޴� ������� ���ε� ���� ���
	 */
	private static int discount(List<Integer> list, List<Integer> list2) {
		boolean[] arr = new boolean[1];
		int sum = 0;
		int i = 0;
		try {
			for (i = 0; i < list.size(); i++) {
				sum += Math.round((list.get(i) * (1 - (double) list2.get(i) / 100)));
			}
		} catch (Exception e) { // ���������� �������� �ݾ��� ������ �� ������ ���� �ݾ� �״�� sum�� �շ�
			for (; i < list.size(); i++) {
				sum += (list.get(i));
			}
		}
		return sum;
	}

	/*
	 * 2���� �迭�� �޾� �ȿ� �ִ� ������ŭ �ݾ� ����Ʈ�� �ֱ�
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
		// ���� ������ ���� �������� ���� ���� �ݾ��� ���� ���� ���� �������� �޾ƾ� �ϹǷ�
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}
}
