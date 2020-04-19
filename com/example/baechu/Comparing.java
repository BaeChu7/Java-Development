package com.example.baechu;

import java.util.*;
/*
 * 작성자 : 최희은
 * 작성일 : 2020-04-19
 * 내 용 : 두 개의 기준대로 정렬하기
 */
class Student1{
	private int id;
	private String fname;
	private double cgpa;
	
	public Student1(int id, String fname, double cgpa) {
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Comparing
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student1> studentList = new ArrayList<Student1>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student1 st = new Student1(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList,  Comparator.comparing(Student1 :: getCgpa).reversed().thenComparing(Student1 :: getFname).thenComparing(Student1 :: getId));

		for (Student1 st : studentList) {
			System.out.println(st.getFname());
		}
	}
}


