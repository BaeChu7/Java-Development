package com.example.baechu;
/*
�ۼ��� : ������
�ۼ��� : 2020-04-05
��   �� : HashMap�� �̿��� ���ڿ� �ΰ� �� ����
Ư�̻��� : �� ���� ���ڿ��� �޾� ��ҹ��� ���� ���� ���� �ϳ��� ������ �Ϻ��� ��ġ�ϸ� Anagrams, �ٸ��� Not Anagrams ���
*/

public class HashMapTest {

	/*
	 * �� ���� ���ڿ� �ȿ� ����ִ� ��� ���ڿ� ���� ���� ���ڿ��� �ش� ���ڰ� � ����ִ��� �� ��
	 * ��� ������ true, �ϳ��� �ٸ��� false ���
	 */
	static boolean isAnagram(String a, String b) {
		String astr = a.toLowerCase(); // ��ҹ��ڸ� �������� �ʱ� ���� ��ġ
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
	 * ���ڿ��� �Է¹޾� ���� �ϳ��� ���� ���ϱ�
	 * key : ����
	 * value : ������ ����
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
		System.out.println((ret) ? "Anagrams" : "Not Anagrams"); // ���ٽ�
	}
}
