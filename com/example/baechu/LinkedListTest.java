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
*/

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
//		scan.nextLine(); // nextInt() �� �ٷ� ���� String a = scan.nextLine()�� ���� ���Ͱ� a�� ����Ǳ� ������ ����.
//		                 // ���� scan.nextLine() �ѹ� �� ���༭ ���͸� �Ծ������ �Ѵ�.
//		String secondstr = scan.nextLine();
//		String[] arr = secondstr.split(" ");

		LinkedList<Integer> lst = new LinkedList<Integer>();
		
		while (true) {
			lst.add(i, scan.nextInt());

			if (lst.size() == firstint) {
				break; // �����ٷ� �� �Ѿ. space �������� ���� 5���� �ԷµǸ� �˾Ƽ� ������ �Է��� �� �ֵ��� ���� �ʿ�. key �̺�Ʈ �ʿ�?
			}
			i++;
		}
		
		int cnt = scan.nextInt();
		
		for (int a = 0 ; a < cnt * 2 ; a++) {
			String transaction = scan.nextLine();
		//	String transaction = scan.nextLine();
		}
		
		System.out.println(lst.get(2));

	}
}