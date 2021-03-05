package com.hamit.relation;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// N
@Entity
@Table(name = "studentTable")
public class Student implements Serializable {
	private static final long serialVersionUID = -132041221211865943L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentId")
	private long studentId;

	@Column(name = "studentName")
	private String studentName;

	@Column(name = "studentSurname")
	private String studentSurname;

	// composition
	@ManyToOne
	@JoinColumn(name = "teacherId")
	private Teacher teacher;

	// parametresiz constructor
	public Student() {
		this.studentId = 0;
	}

	// parametreli constructor
	public Student(String studentName, String studentSurname) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}

	// getter and setter
	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return studentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
