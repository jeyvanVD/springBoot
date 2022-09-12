package com.example.accessingdatamongodb;

import java.util.Date;

import org.springframework.data.annotation.Id;


public class Student {

	@Id
	public String id;

	public Integer studentID;
	public String firstName;
	public String lastName;
	public String gender;
	public Date dob;

	public Student() {}

	public Student(Integer studentID, String firstName, String lastName, String gender, Date dob) {
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return String.format(
				"Student[id=%s, studentID=%f, firstName='%s', lastName='%s', gender='%s', DOB=%tB]",
				id, studentID, firstName, lastName, gender, dob);
	}

}

