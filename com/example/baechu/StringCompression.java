package com.example.baechu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
�ۼ��� : ������
�ۼ��� : 2020-03-20
��   �� : ���ڿ� ���� K����ŭ ���ӵ� ���� �ִ��� ����
*/

public class StringCompression {
	public static String compressWord(String word, int K) {
		int cnt = 1;

		if (compressCnt(word, K) < K || word.length() == 1) {
			return word;
		}

		StringBuffer sb = new StringBuffer(word);

		for (int i = 0; i < word.length() - 1; i++) {
			char charAtSt = word.charAt(i);
			char charAtEd = word.charAt(i + 1);

			if (charAtSt == charAtEd) {
				cnt++;

				if (cnt == K) {
					sb.delete(i + 2 - K, i + 2);
					break;

				}
			} else {
				cnt = 1;
			}
		}

		return compressWord(sb.toString(), K);
	}

	public static int compressCnt(String word, int K) {
		int cnt = 1;

		StringBuffer sb = new StringBuffer(word);

		for (int i = 0; i < word.length() - 1; i++) {
			char charAtSt = word.charAt(i);
			char charAtEd = word.charAt(i + 1);

			if (charAtSt == charAtEd) {
				cnt++;

				if (cnt == K) {
					sb.delete(i + 2 - K, i + 2);
					break;
				}
			} else {
				cnt = 1;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		System.out.print(compressWord("cccccccccca", 10));
	}

}