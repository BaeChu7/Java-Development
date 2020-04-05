package com.example.baechu;
import java.util.*;

/*
�ۼ��� : ������
�ۼ��� : 2020-04-05
��   �� : �迭 �п� �غ���
*/
public class ArraySplit {
	/*
	 * �ϳ��� �迭 �ΰ��� �迭�� �����ϱ�
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
	 * List ��� �հ�
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