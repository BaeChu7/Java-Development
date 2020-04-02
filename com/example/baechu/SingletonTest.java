package com.example.baechu;
/*
작성자 : 최희은
작성일 : 2020-03-27
내   용 : 디자인 패틴)싱글턴 패턴 예시 Test
특이사항 :
*/
public class SingletonTest {

	public static void main(String[] args) {
		Singleton sing1 = Singleton.get1();
		Singleton sing2 = Singleton.get1();
		
		if (sing1 == sing2) {
			System.out.print("같다");
		}
	}
}
