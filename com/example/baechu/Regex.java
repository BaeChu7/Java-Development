package com.example.baechu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
�ۼ��� : ������
�ۼ��� : 2020-04-09
��   �� : ����ǥ���� ����(���ӵǰ� �ߺ��� ���� �� �ܾ �����Ͽ� ǥ���Ѵ�. �̶� ��ҹ��ڴ� �������� �ʴ´�.)
��   �� : I love Love to To tO code -> I love to code
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
            
            // �´� �������� Ȯ��
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}