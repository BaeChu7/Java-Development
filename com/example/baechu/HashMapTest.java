package com.example.baechu;
/*
작성자 : 최희은
작성일 : 2020-04-05
내   용 : HashMap을 이용한 문자열 두개 비교 구현
특이사항 : 두 개의 문자열을 받아 대소문자 구분 없이 문자 하나당 갯수가 완벽히 일치하면 Anagrams, 다르면 Not Anagrams 출력
*/

public class HashMapTest {

	/*
	 * 두 개의 문자열 안에 들어있는 모든 문자에 대해 각각 문자열에 해당 문자가 몇개 들어있는지 비교 후
	 * 모두 같으면 true, 하나라도 다르면 false 출력
	 */
	static boolean isAnagram(String a, String b) {
		String astr = a.toLowerCase(); // 대소문자를 구문하지 않기 위한 조치
		String bstr = b.toLowerCase();

		java.util.Iterator<Character> it = charMap(astr + bstr).keySet().iterator();

		while (it.hasNext()) {
			char key = it.next(); // Map key

			if (charMap(astr).get(key) != charMap(bstr).get(key)) {
				return false;
			}
		}

		return true;
	}

	/*
	 * 문자열을 입력받아 문자 하나당 갯수 구하기
	 * key : 문자
	 * value : 문자의 갯수
	 */
	static java.util.Map<Character, Integer> charMap(String str) {
		java.util.Map<Character, Integer> map = new java.util.HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);

			if (!map.containsKey(letter)) {
				map.put(letter, 1);
			} else {
				Integer frequency = map.get(letter);
				map.put(letter, frequency + 1);
			}
		}

		return map;
	}

	public static void main(String[] args) {
		String a = "abab";
		String b = "aB";

		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams"); // 람다식
	}
}
