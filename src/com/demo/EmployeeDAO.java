package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDAO {
	public void addEmployee(Employee emp) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tran=session.getTransaction();
		tran.begin();
		session.save(emp);
		tran.commit();
		session.close();
	}

}
