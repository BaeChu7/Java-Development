package com.example.baechu;

import java.io.IOException;
import java.lang.reflect.Method;

/*
 * 작성자 : 최희은
 * 작성일 : 2020-05-24
 * 내   용 : Generic Method 구현
 */

class Printer
{
   public <T> void printArray(T[] arr) { // 모든 타입이라기 보다는 "배열 중" 모든 타입! []
	   for(T item : arr){
	        System.out.println(item);
	   }
   }
 
}

// <T> Box<T> boxing(T t)

public class GenericMethod {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}