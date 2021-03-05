package com.hamit.relation;

import java.util.ArrayList;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class RelationTestMain {

	public static void main(String[] args) {

		Teacher teacher = new Teacher("Hamit ", "Mızrak");
		teacher.setStudentList(new ArrayList<Student>());

		Student student = new Student("Talha", "Şekeroğlu");
		student.setTeacher(teacher);
		teacher.getStudentList().add(student);

		Student student2 = new Student("Zeynep", "Şekeroğlu");
		student2.setTeacher(teacher);
		teacher.getStudentList().add(student2);

		Student student3 = new Student("Habibe", "Şekeroğlu");
		student3.setTeacher(teacher);
		teacher.getStudentList().add(student3);

		Session session = HibernateUtils.getSessionfactory().openSession();
		session.getTransaction().begin();
		session.persist(teacher);
		session.getTransaction().commit();

	}

}
