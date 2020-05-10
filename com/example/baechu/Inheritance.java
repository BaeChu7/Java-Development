package com.example.baechu;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
 * 작성자 : 최희은
 * 작성일 : 2020-04-23
 * 내 용 : 상위클래스에 대한 정보
 */
class Arithmetic{
	

}

class Adder extends Arithmetic{
	public int add(int a, int b) {
		
		return a + b;
	}
}

public class Inheritance{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName()); // 상위클래스명 가져오기
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}