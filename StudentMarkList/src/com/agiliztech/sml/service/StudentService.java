package com.agiliztech.sml.service;

import com.agiliztech.sml.model.Student;

public class StudentService {
	
	public void computeTotal(Student student)
	{
		student.total = student.sub1 + student.sub2 + student.sub3 + student.sub4 + student.sub5;
	}
	
	public void computePercent(Student student) {
		student.percent = (student.total/500) * 100;
		
		String grade = "";
		if(student.percent>=80)
        {
            grade = "A";
        }
        else if(student.percent>=70)
        {
           grade = "B";
        } 
        else if(student.percent>=60)
        {
           grade = "C";
        }
        else
        {
            grade = "Fail";
        }
		student.setGrade(grade);
	}
	
	
}
