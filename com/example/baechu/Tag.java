package com.example.baechu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * �ۼ��� : ������
 * �ۼ��� : 2020-04-16
 * �� �� : Tag�� �������� ���� ������
 */
//4
//<h1>Nayeem loves counseling</h1>
//<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
//<Amee>safat codes like a ninja</amee>
//<SA premium>Imtiaz has a secret crush</SA premium>
public class Tag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		while (testCases > 0) {
			String line = in.nextLine();

			boolean matchFound = false;

			// <(.+)> : start tag (group(1))
			// ([^<]+) : start�� end ��ũ ���̿� �ִ� ��� ����, <�� ���� �� ����. (group(2))
			// </\\1> : \1�� �ǹ̴� group(1)�� text�� �����ϴٴ� ���� �ǹ�.
			Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
			Matcher m = r.matcher(line);

			while (m.find()) { // line�ȿ� ���Ͽ� �´� �� �Ѱ��� ã�Ƴ���
				// ex) <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
				// �̷��� ������ <h1><h1>Sanjay has no watch</h1></h1>�� <par>So wait for a while</par>
				// �ΰ� ���� ã������ ��.
				System.out.println(m.group(2));
				matchFound = true;
			}
			if (!matchFound) {
				System.out.println("None");
			}

			testCases--;
		}
	}
}
