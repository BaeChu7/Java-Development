package com.example.baechu;
/*
�ۼ��� : ������
�ۼ��� : 2020-03-27
��   �� : ������ ��ƾ)�̱��� ���� ���� Test
Ư�̻��� :
*/
public class SingletonTest {

	public static void main(String[] args) {
		Singleton sing1 = Singleton.get1();
		Singleton sing2 = Singleton.get1();
		
		if (sing1 == sing2) {
			System.out.print("����");
		}
	}
}
