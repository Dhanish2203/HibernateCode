package com.demo;

import java.util.Calendar;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Enter id=");
		int id=sc.nextInt();
		System.out.println("Enter emp name=");
		String name=sc.next();
		System.out.println("Date(dd-mm-yyyy)");
		String dojs=sc.next();
		Calendar doj=CalendarUtil.getCalendarFromString(dojs);
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setDateOfJoining(doj);
		new EmployeeDAO().addEmployee(emp);
		System.out.println("ADDED");
		sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			HibernateUtil.closeSessionFactory();
		}
	}

}
