package com.example.baechu;

/*
�ۼ��� : ������
�ۼ��� : 2020-04-03
��   �� : ��Ƽ������ �켱���� üũ Main
Ư�̻��� : �켱������ �������� ���� �ð��� ���� ������
*/
public class ThreadTestMain {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			Thread thread = new ThreadTest("thread" + i);

			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY); // �⺻���� 5 �̸�, ����� ���� �����ϴ�.
			}

			thread.start(); // �����尡 running �� �� �ֵ��� ���� ������ �Ҵ������ �Ѵ�.
		}
	}
}
