package com.example.baechu;

/*
�ۼ��� : ������
�ۼ��� : 2020-04-03
��   �� : join() �޼ҵ� �뵵 Ȯ��
*/
class SumThread extends Thread {
	private long sum = 1;

	public long getSum() {
		return sum;
	}

	public void run() { // run() �޼ҵ�� �������̵� �� ��
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
	}
}
