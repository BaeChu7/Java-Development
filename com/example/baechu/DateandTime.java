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
�ۼ��� : ������
�ۼ��� : 2020-04-05
��   �� : 
Ư�̻��� : Ư�� ��¥�� ���� ã��
*/
public class DateandTime {
    public static String findDay(int month, int day, int year) {
        String s = "";

        try {
                Calendar cal = Calendar.getInstance(); // ���糯¥
                cal.set(Calendar.YEAR, year);
                cal.set(Calendar.MONTH, month);
                cal.set(Calendar.DATE, day);

                int daynum = cal.get(Calendar.DAY_OF_WEEK); // calendar�� ����Ű��(�ǹ��ϴ�) Ư�� ��¥�� ���� �������� �˱� ���� ���δ�.

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
