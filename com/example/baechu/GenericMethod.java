package com.example.baechu;

import java.io.IOException;
import java.lang.reflect.Method;

/*
 * �ۼ��� : ������
 * �ۼ��� : 2020-05-24
 * ��   �� : Generic Method ����
 */

class Printer
{
   public <T> void printArray(T[] arr) { // ��� Ÿ���̶�� ���ٴ� "�迭 ��" ��� Ÿ��! []
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