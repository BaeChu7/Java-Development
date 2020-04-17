package com.example.baechu;
/*
작성자 : 최희은
작성일 : 2020-04-17
내   용 : 멀티클래스와 인터페이스
*/

import java.util.*;

interface AdvancedArithmetic{
  int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
	
	public int divisor_sum(int n){
		int sum = 0;
		
		for (int i = 1 ; i <= n ; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
}

class MultiClassNInterface{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

