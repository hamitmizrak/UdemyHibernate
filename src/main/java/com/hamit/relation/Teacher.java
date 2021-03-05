package com.hamit.relation;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// 1
@Entity
@Table(name = "teacherTable")
public class Teacher implements Serializable {
	private static final long serialVersionUID = 3271939750431299112L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacherId")
	private long teacherId;

	@Column(name = "teacherName")
	private String teacherName;

	@Column(name = "teacherSurname")
	private String teacherSurname;

	// composition
	@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Student> studentList;

	// parametresiz constructor
	public Teacher() {
		this.teacherId = 0;
	}

	// parametreli constructor
	public Teacher(String teacherName, String teacherSurname) {
		this.teacherName = teacherName;
		this.teacherSurname = teacherSurname;
	}

	// getter and setter
	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSurname() {
		return teacherSurname;
	}

	public void setTeacherSurname(String teacherSurname) {
		this.teacherSurname = teacherSurname;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

}
