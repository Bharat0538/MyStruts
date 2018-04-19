package com.cluster;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class TestBean {

		private List<Student> studentList;

		public List<Student> getStudentList() {
			return studentList;
		}

		public void setStudentList(List<Student> studentList) {
			this.studentList = studentList;
		}

		 // Initialize  student list.
		@PostConstruct
		public void init() {

			Student stu1 = new Student("Suresh", "Java and Database", "JULY");
			Student stu2 = new Student("Ramesh", "Java and Servlet", "JULY");
			Student stu3 = new Student("Deepak", "Servlet and JSP", "AUGUST");
			Student stu4 = new Student("Anand", "JSF and Hibernate", "AUGUST");
			Student stu5 = new Student("Vijay", "JSF and JPA", "SEPTMEBER");
			Student stu6 = new Student("Kumar", "Java and Database", "SEPTEMBER");
			Student stu7 = new Student("Vinay", "Java and Database", "OCTOBER");
			Student stu8 = new Student("Raj", "Java and Servlet", "OCTOBER");
			Student stu9 = new Student("Vikram", "JSF and Hibernate", "OCTOBER");
			Student stu10 = new Student("Manju", "Java and Servlet", "OCTOBER");
			

			studentList = new ArrayList<Student>();
			studentList.add(stu1);
			studentList.add(stu2);
			studentList.add(stu3);
			studentList.add(stu4);
			studentList.add(stu5);
			studentList.add(stu6);
			studentList.add(stu7);
			studentList.add(stu8);
			studentList.add(stu9);
			studentList.add(stu10);
			
		}
}
