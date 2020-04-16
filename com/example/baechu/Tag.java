package com.example.baechu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 작성자 : 최희은
 * 작성일 : 2020-04-16
 * 내 용 : Tag를 기준으로 문장 나누기
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
			// ([^<]+) : start와 end 태크 사이에 있는 모든 문자, <는 있을 수 없다. (group(2))
			// </\\1> : \1의 의미는 group(1)의 text와 동일하다는 것을 의미.
			Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
			Matcher m = r.matcher(line);

			while (m.find()) { // line안에 패턴에 맞는 값 한개씩 찾아내기
				// ex) <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
				// 이렇게 있으면 <h1><h1>Sanjay has no watch</h1></h1>와 <par>So wait for a while</par>
				// 두개 값이 찾아지는 것.
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
