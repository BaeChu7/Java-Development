package com.example.baechu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
작성자 : 최희은
작성일 : 2020-04-09
내   용 : 정규표현식 구현(연속되고 중복된 문장 및 단어를 제거하여 표현한다. 이때 대소문자는 구분하지 않는다.)
예   시 : I love Love to To tO code -> I love to code
*/
public class Regex {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // 맞는 조건인지 확인
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}