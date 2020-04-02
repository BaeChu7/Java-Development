/*
작성자 : 최희은
작성일 : 2020-03-27
내   용 : 디자인 패틴)싱글턴 패턴 예시
특이사항 : 한번의 new로 같은 객체에 어디서든지 접근 가능하도록 개발
*/
public class Singleton {
	private static Singleton singleton;
	public static final Singleton get1() { // final 키워드를 붙임으로써 멀티스레드 환경에서 여러 객체가 생성되지 않게 구현 가능
		if (singleton == null) {
			singleton = new Singleton();
			return singleton;
		}
		else
		{
			return singleton;
		}
	}
}
