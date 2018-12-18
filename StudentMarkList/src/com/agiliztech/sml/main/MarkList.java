package com.agiliztech.sml.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.agiliztech.sml.model.Student;
import com.agiliztech.sml.service.StudentService;

public class MarkList {
	
	public static void main(String[] args) {
		
		String[][] studentInfo = {
				{"102", "Thomas", "15", "90", "60", "70", "80", "100"},
				{"103", "Pawan", "15", "100", "90", "60", "90", "80"},
				{"104", "Karan", "15", "60", "50", "70", "90", "50"},
				{"105", "Divya", "15", "80", "70", "60", "50", "90"},
		};
		
		List<Student> studentList = new ArrayList<>();
		
	
		StudentService studentService = new StudentService();
		
		Student student = new Student(101,"Anand");
		student.age = 15;
		student.sub1 = 90;
		student.sub2 = 60;
		student.sub3 = 70;
		student.sub4 = 80;
		student.sub5 = 90;	

		studentService.computeTotal(student);
		studentService.computePercent(student);
		
		studentList.add(student);
		
/*		
		
		studentService.computeTotal(student);
		studentService.computePercent(student);
		
		System.out.println(
				"Total: " + student.total + 
				"\nPercentage: " + student.percent +
				"\nGrade: " + student.getGrade()
				);		
*/
		
		// ----------------------------------------------------
		
		for (int i = 0; i< studentInfo.length; i++) {		
			
			String[] record = studentInfo[i];
			
			int rollNo = Integer.parseInt(record[0]);
			String name = record[1];
			int age = Integer.parseInt(record[2]);
			
			int m1 = Integer.parseInt(record[3]);
			int m2 = Integer.parseInt(record[4]);
			int m3 = Integer.parseInt(record[5]);
			int m4 = Integer.parseInt(record[6]);
			int m5 = Integer.parseInt(record[7]);			
			
			
			Student stud = new Student(rollNo, name);
			
			stud.age = age;
			stud.sub1 = m1;
			stud.sub2 = m2;
			stud.sub3 = m3;
			stud.sub4 = m4;
			stud.sub5 = m5;
			
			studentService.computeTotal(stud);
			studentService.computePercent(stud);
			
			studentList.add(stud);			
		}
		
		Collections.sort(studentList);
		
//		for(int i = 0; i < studentList.size(); i++) {
//			System.out.println(studentList.get(i).toString());			
//		}
		
		for(Student stud:studentList) {
			System.out.println(stud.toString());			
		}
		
		
	}

}
