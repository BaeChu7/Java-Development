package com.example.baechu;
/*
�ۼ��� : ������
�ۼ��� : 2020-03-25
��   �� : �ϳ����� ž ����
Ư�̻��� : 3���� ������ ��� A���� ��� C�� �̵���Ű�� ��

	 * �ϳ����� ž ����
	 * 1. �ѹ��� �Ѱ��� ���Ǹ� �ű� �� �ִ�.
	 * 2. �� ū ������ ���� ���� �� ����.
*/
public class Hanoi2 {
	static int i = 3;

	public static void main(String[] args) {
		movedisk(i, 'A', 'B', 'C');
	}

	/**
	 * @param top  : ����(���� �� ���� ������ 1 ������ ������ 1�� ���� ����)
	 * @param from : ���� ���
	 * @param mid  : ���۰� �������� ������ ���� ���
	 * @param to   : ������ ���
	 * �޼ҵ� ����:
	 * ���� A���� C������� �ű���� �ϴ� ������ top�̶�� �Ѵٸ� top-1 �� ���ǵ��� A���� ���� B�� �ű��
	 * top ������ A���� C�� �� ���� B�� �ִ� ������ ���ǵ��� C�� �̵������־�� �Ѵ�.
	 * �̰��� ��ͷ� ǥ�� ����
	 */
	public static void movedisk(int top, char from, char mid, char to) {
		if (top == 1) {
			System.out.println("���� " + top + "�� " + from + "����" + to + "�� �̵��մϴ�.");
		} else {
			movedisk(top - 1, from, to, mid);
			System.out.println("���� " + top + "�� " + from + "����" + to + "�� �̵��մϴ�.");
			movedisk(top - 1, mid, from, to);
		}
	}
}