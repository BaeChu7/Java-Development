package com.example.baechu;

import java.util.Scanner;

/*
�ۼ��� : ������
�ۼ��� : 2019-04-19
��   �� : ArrayList �ȿ� �ִ� ��ҵ� �� String�� ����ϱ�
*/
import java.util.*;

public class InstanceOf {

	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		
		while (it.hasNext()) {
			Object element = it.next();

			if (element instanceof String) // element�� String ���̸� true �׷��� ������ false ��ȯ

				break;
		}

		return it;
	}

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}

		mylist.add("###");
		
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		Iterator it = func(mylist); // func���� ���ڱ��� �̹� üũ�ϰ� break������ �������� �����ؼ� üũ�ϴ� ���̱� ������ �� ���� �׸���� üũ
		
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}
	}
}
