package com.example.baechu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
작성자 : 최희은
작성일 : 
내   용 : Test
*/
public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

          java.util.HashSet<String> st = new java.util.HashSet<String>();
        
        for (int i = 0; i < t; i++) {
            st.add(pair_left[i] + ',' + pair_right[i]);
            System.out.println(st.size());
        }
        

   }
}