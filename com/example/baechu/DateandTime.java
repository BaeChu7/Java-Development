package com.example.baechu;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
/*
작성자 : 최희은
작성일 : 2020-04-05
내   용 : 
특이사항 : 특정 날짜의 요일 찾기
*/
public class DateandTime {
    public static String findDay(int month, int day, int year) {
        String s = "";

        try {
                Calendar cal = Calendar.getInstance(); // 현재날짜
                cal.set(Calendar.YEAR, year);
                cal.set(Calendar.MONTH, month);
                cal.set(Calendar.DATE, day);

                int daynum = cal.get(Calendar.DAY_OF_WEEK); // calendar가 가르키는(의미하는) 특정 날짜가 무슨 요일인지 알기 위해 쓰인다.

                switch(daynum){
                    case 1:
                        s = "SUNDAY";
                        break ;
                    case 2:
                        s = "MONDAY";
                        break ;
                    case 3:
                        s = "TUESDAY";
                        break ;
                    case 4:
                        s = "WEDNESDAY";
                        break ;
                    case 5:
                        s = "THUSDAY";
                        break ;
                    case 6:
                        s = "FRIDAY";
                        break ;
                    case 7:
                        s = "SATURDAY";
                        break ;
                }
                
		    }
		    catch(Exception ex){
		        ex.printStackTrace();
		    }

        return s;

    }
    
    public static void main(String[] args) {
    	System.out.print(findDay(8, 5, 2015));
	}
}
