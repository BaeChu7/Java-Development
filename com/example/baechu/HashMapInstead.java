package com.example.baechu;

import java.util.Scanner;

/*
작성자 : 최희은
작성일 : 2020-04-05
내   용 : HashMap을 이용하지 않고 문자열 두개 비교 구현
특이사항 : 두 개의 문자열을 받아 대소문자 구분 없이 문자 하나당 갯수가 완벽히 일치하면 Anagrams, 다르면 Not Anagrams 출력
2020-04-17) Another Question Start 추가
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
		java.util.HashSet<String> set = new java.util.HashSet<String>(); // Set은 List와 다르게 자동적으로 중복을 제거해준다.

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