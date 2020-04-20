package com.example.baechu;
import java.util.*;


public class Solution{
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook1 new_novel=new MyBook1();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}