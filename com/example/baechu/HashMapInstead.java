package com.example.baechu;

import java.util.Scanner;

/*
�ۼ��� : ������
�ۼ��� : 2020-04-05
��   �� : HashMap�� �̿����� �ʰ� ���ڿ� �ΰ� �� ����
Ư�̻��� : �� ���� ���ڿ��� �޾� ��ҹ��� ���� ���� ���� �ϳ��� ������ �Ϻ��� ��ġ�ϸ� Anagrams, �ٸ��� Not Anagrams ���
2020-04-17) Another Question Start �߰�
*/
public class HashMapInstead {
	static boolean isAnagram(String a, String b) {
		boolean answer = true;
		int acnt = 0;
		int bcnt = 0;
		int finalcnt = 0;

		java.util.Iterator<String> it = distinctstring(a + b).iterator();

		while (it.hasNext()) {
			char equalstr = it.next().charAt(0);

			acnt = charCnt(a, equalstr);
			bcnt = charCnt(b, equalstr);

			if (acnt != bcnt) {
				finalcnt++;
			}
		}

		if (finalcnt > 0) {
			answer = false;
		}

		return answer;
	}

	static java.util.HashSet<String> distinctstring(String distinctLst) {
		java.util.HashSet<String> set = new java.util.HashSet<String>(); // Set�� List�� �ٸ��� �ڵ������� �ߺ��� �������ش�.

		String[] tokens = distinctLst.toLowerCase().split("");
		for (int i = 0; i < tokens.length; i++) {
			set.add(tokens[i]);
		}

		return set;
	}

	static int charCnt(String str, char cr) {
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == cr) {
				cnt++;
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		String a = "Hello";
		String b = "hello";

		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		
		// Another Question Start
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		java.util.HashSet<String> st = new java.util.HashSet<String>();

		for (int i = 0; i < t; i++) {
			st.add(pair_left[i] + ',' + pair_right[i]);
            System.out.println(st.size());
		}
	}
}