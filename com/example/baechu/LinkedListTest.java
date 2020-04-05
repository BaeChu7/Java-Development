package com.example.baechu;

import java.util.LinkedList;
import java.util.Scanner;
/*
�ۼ��� : ������
�ۼ��� : 2020-04-02
��   �� : LinkedList ����
Ư�̻��� : LinkedList�� �ε��� ������� ��ҵ��� �����ϴ� ArrayList�ʹ� �ٸ���
		������ �ִ� ��ҵ鿡 ���� ������ ������ �����Ƿ� Insert�� Update�� ����
		+ ArrayList��  ��Ƽ������ ȯ�濡�� ���ÿ� ������ ������ �����ϸ�
		+ Vector�� �񵿱� ������� �� �����忡�� �������̸� �ٸ� �����尡 ���� �Ұ�
		2020.04.03) cmd â���� ������ ����
		2020.04.05) LinkedList Insert, Delete ����
*/

//ex
//5
//12 0 1 78 12
//2
//Insert
//5 23
//Delete
//0

public class LinkedListTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int firstint = scan.nextInt();

		LinkedList<Integer> lst = new LinkedList<Integer>();

		while (true) {
			lst.add(i, scan.nextInt());

			if (lst.size() == firstint) {
				break; // �����ٷ� �� �Ѿ. space �������� ���� 5���� �ԷµǸ� �˾Ƽ� ������ �Է��� �� �ֵ��� ���� �ʿ�. key �̺�Ʈ �ʿ�.
			}
			i++;
		}

		int cnt = scan.nextInt();

		for (int a = 0; a < cnt; a++) {
			String action = scan.next();

			if (action.equals("Insert")) {
				int index = scan.nextInt();
				int value = scan.nextInt();
				lst.add(index, value);
			} else { // "Delete"
				int index = scan.nextInt();
				lst.remove(index);
			}
		}

		for (int j = 0; j < lst.size(); j++) {
			System.out.print(lst.get(j) + " ");
		}

	}
}