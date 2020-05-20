package com.example.baechu;

import java.util.*;
import java.io.*;

/*
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

uncle sam=99912222
Not found
harry=12299933
*/
/*
 * 작성자 : 최희은
 * 작성일 : 2020-05-20
 * 내   용 : 자바 Map 구현
 */
public class MapTest {

	public MapTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();

		HashMap<String , Integer> map = new HashMap<String , Integer>();
		
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			
			map.put(name, phone);
		}

		while (in.hasNext()) {
			String s = in.nextLine();
			
			if(map.containsKey(s)){
				System.out.println(s + "=" + map.get(s));
			}
			else {
				System.out.println("Not found");
			}
		}
	}
}
