package com.example.baechu;
import java.util.*;

/*
{}()
({()})
{}(
[]

true
true
false
true
*/
/*
 * 작성자 : 최희은
 * 작성일 : 2020-05-18
 * 내   용 : stack 기술
 */
public class Stack1 {
	
    public static void main(String []argh)
	{
//		Scanner sc = new Scanner(System.in);
//		
//		while (sc.hasNext()) {
//			String input = sc.next();
//		    while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
//		    System.out.println(input.isEmpty());
//		}
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
		     String input=sc.next();
		     
		     Stack<Character> stacky =  new Stack<Character>();
		     for (int i = 0; i < input.length(); i++) {
		        if (!stacky.isEmpty()) {
		            switch(input.charAt(i)) {
		                case '}' : if (stacky.peek() == '{') {
		                    stacky.pop();
		                } break;
		                case ']' : if (stacky.peek() == '[') {
		                    stacky.pop();
		                } break;
		                case ')' : if (stacky.peek() == '(') {
		                    stacky.pop();
		                } break;
		                default: stacky.push(input.charAt(i));
		          }
		        } else {
		            stacky.push(input.charAt(i));
		        } 
		     }
		     System.out.println(stacky.isEmpty());
		  }
		
	}
    
}