package com.example.baechu;

/*
�ۼ��� : ������
�ۼ��� : 2020-04-03
��   �� : ��Ƽ������ �켱���� üũ
*/
public class ThreadTest extends Thread {
	public ThreadTest(String name) {
		setName(name); // Thread �ȿ� �ִ� �޼ҵ� -> Thread �� �����ϱ�
	}

	@Override
	public void run() { // Thread �ȿ� �ִ� �޼ҵ� ������ -> Thread ���� �����ϱ�
		for (long i = 0; i < 2000000000; i++) {

		}
		System.out.println(getName()); // Thread �ȿ� �ִ� �޼ҵ� -> Thread �� ��������
	}
}
