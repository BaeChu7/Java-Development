package com.example.baechu;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 작성자 : 최희은
 * 작성일 : 2020-04-13
 * 내 용 : ArrayList안에 String배열 찾기
 */
public class FindArrayListVal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstline = scan.nextInt();
		scan.nextLine(); // 다음 nextLine이 들어갈 때는 enter를 한번 먹어줘야 한다.
				         // scan.nextInt() 다음 scan.nextLine() 시 scan.nextInt()에 enter가 저장되기 때문에

		// firstline의 수만큼 ArrayList가 만들어져야 하므로 이와 같이 구현
		ArrayList<String[]> arr = new ArrayList<String[]>();

		for (int i = 0; i < firstline; i++) {
			arr.add(scan.nextLine().split(" "));
		}

		int secondint = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < secondint; i++) {
			String[] strarr = scan.nextLine().split(" ");
			
			int a = Integer.parseInt(strarr[0]);
			int b = Integer.parseInt(strarr[1]);

			try {
				System.out.println(arr.get(a - 1)[b]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
	}
	
/*
Input value
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Output value
74
52
37
ERROR!
ERROR!
*/
}
