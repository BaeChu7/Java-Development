package com.example.baechu;

import java.util.*;

/*
 * �ۼ��� : ������
 * �ۼ��� : 2020-04-20
 * �� �� : ����)Book �߻�Ŭ����
 */
public class AbstractClass {

	// Book book = new Book(); �߻�Ŭ������ �ν��Ͻ� ������ �Ұ����ϴ�. ������ �θ�Ŭ������ ���Ҹ�
//	public class MyBook extends Book { // class ������ class�� main �޼ҵ尡 ȣ���ϱ� ������ public static class
//								       // ������ Ŭ������ ��������!!!
//		String title;
//
//		public void setTitle(String title) {
//			this.title = title;
//		}
//
//		public String getTitle() {
//			return title;
//		}
//	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();

	}
}