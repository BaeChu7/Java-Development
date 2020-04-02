package com.example.baechu;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
�ۼ��� : ������
�ۼ��� : 2020-03-30
��   �� : Comparator�� �̿��� ����� ���� ����
*/
public class ComparatorTest {
	/*
	 * compare() �޼��� �ۼ���
	 * ù ��° �Ķ���ͷ� �Ѿ�� ��ü < �� ��° �Ķ���ͷ� �Ѿ�� ��ü: ���� ����
	 * ù ��° �Ķ���ͷ� �Ѿ�� ��ü == �� ��° �Ķ���ͷ� �Ѿ�� ��ü: 0 ����
	 * ù ��° �Ķ���ͷ� �Ѿ�� ��ü > �� ��° �Ķ���ͷ� �Ѿ�� ��ü: ��� ����
	 * ���� �Ǵ� 0�̸� ��ü�� �ڸ��� �״�� �����Ǹ�, ����� ��쿡�� �� ��ü�� �ڸ��� ����ȴ�.
	 * ��, Integer.compare(x, y)(�������� ����)�� ������ �����̴�.
	 * return (x < y) ? -1 : ((x == y) ? 0 : 1);
	 * �������� ������ ��� �� �Ķ������ ��ġ�� �ٲ��ش�. Integer.compare(y, x)(�������� ����)
	 */
	static void SetStudent() {
		ArrayList<Student> sList = new ArrayList<Student>();

		Student s1 = new Student("��", 10, "�ּ�1");
		Student s2 = new Student("��", 13, "�ּ�2");
		Student s3 = new Student("��", 11, "�ּ�3");

		// �迭 ���Ľ� Arrays.sort, List ���Ľ� Collections.sort
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);

		// �⺻���� Comprarable �̰�, �̴� �⺻���� ���ı��
		// Comparator�� ���� ���ϴ� ���Ĺ���� ���� ����
		Collections.sort(sList, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int age1 = s1.getAge();
				int age2 = s2.getAge();

				return (age1 < age2) ? 1 : ((s1 == s2 ? 0 : -1)); // �������� ����
			}

		});

		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i).getName());
		}
	}

	// string ���ڸ� ���� �������� �����ϱ� (��, ����Ҷ� �Է¹��� ���ڿ� ���� �״�� ���)
	static void ArraySort() {
		String[] str = { "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000" };

		Arrays.sort(str, 0, str.length, new Comparator<String>() { // ���� ��� �迭 ���� ����

			@Override
			public int compare(String s1, String s2) {
				BigDecimal b1 = new BigDecimal(s1);
				BigDecimal b2 = new BigDecimal(s2);

				// return b1.compareTo(b2); // ��������
				return b2.compareTo(b1); // ��������
			}

		});

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

	public static void main(String[] args) {
		SetStudent();
		ArraySort();
	}
}
