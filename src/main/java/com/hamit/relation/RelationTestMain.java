package com.hamit.relation;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class RelationTestMain {

	public static void main(String[] args) {

		// create
		// Teacher teacher = new Teacher("Hamit ", "Mızrak");
		// teacher.setStudentList(new ArrayList<Student>());
		//
		// Student student = new Student("Talha", "Şekeroğlu");
		// student.setTeacher(teacher);
		// teacher.getStudentList().add(student);
		//
		// Student student2 = new Student("Zeynep", "Şekeroğlu");
		// student2.setTeacher(teacher);
		// teacher.getStudentList().add(student2);
		//
		// Student student3 = new Student("Habibe", "Şekeroğlu");
		// student3.setTeacher(teacher);
		// teacher.getStudentList().add(student3);
		// // -------------------------------------------------------------//
		//
		// Teacher teacher2 = new Teacher("Hulusi ", "Mızrak");
		// teacher2.setStudentList(new ArrayList<Student>());
		//
		// Student student4 = new Student("İbrahim", "Işık");
		// student4.setTeacher(teacher2);
		// teacher2.getStudentList().add(student4);
		//
		// Student student5 = new Student("Arefe", "Şekeroğlu");
		// student5.setTeacher(teacher2);
		// teacher2.getStudentList().add(student5);
		//
		// Student student6 = new Student("Furkan", "Işık");
		// student6.setTeacher(teacher2);
		// teacher2.getStudentList().add(student6);
		//
		// // -------------------------------------------------------------//
		//
		// Session session = HibernateUtils.getSessionfactory().openSession();
		// session.getTransaction().begin();
		// session.persist(teacher);
		// session.persist(teacher2);
		// session.getTransaction().commit();

		// find
		Session session = HibernateUtils.getSessionfactory().openSession();
		long id = 2;
		Teacher teacher = session.find(Teacher.class, id);
		System.out.println("Öğretmen" + "\n" + teacher.getTeacherId() + "\t" + teacher.getTeacherName() + "\t"
				+ teacher.getTeacherSurname() + "\nÖğrenciler");

		for (Student student : teacher.getStudentList()) {
			System.out.println(
					student.getStudentId() + "\t" + student.getStudentName() + "\t" + student.getStudentSurname());
		}
	}

}
