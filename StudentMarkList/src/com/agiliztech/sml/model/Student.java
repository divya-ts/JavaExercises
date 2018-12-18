package com.agiliztech.sml.model;

public class Student implements Comparable <Student> {
	public int rollno;
	public String name;
	public int age;
	public float sub1, sub2, sub3, sub4, sub5, total, percent;
	private String grade;
	
	public Student(int rollno, String name) {
		this.name = name;
		this.rollno = rollno;
	}
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		String str = 
				rollno + "\t"+  
				name  + "\t"+
				sub1  + "\t"+
				sub2  + "\t"+
				sub3  + "\t"+
				sub4  + "\t"+
				sub5  + "\t"+
				total + "\t"+
				percent  + "\t"+
				grade;
		
		return str;
	}

	@Override
	public int compareTo(Student st) {
		return name.compareTo(st.name);
				
	}
} 
