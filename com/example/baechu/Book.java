package com.example.baechu;

/*
 * �ۼ��� : ������
 * �ۼ��� : 2020-04-20
 * �� �� : Book �߻�Ŭ����
 */
public abstract class Book { // �߻�޼��尡 �ּ� �Ѱ� �̻� ����ִ� Ŭ����
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}
