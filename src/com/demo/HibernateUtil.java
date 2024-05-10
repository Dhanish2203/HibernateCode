package com.demo;

import org.hibernate.SessionFactory; 
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	private static StandardServiceRegistry registry;
	static {
		try {
			registry=new StandardServiceRegistryBuilder().configure().build();
			sessionFactory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
		}catch(Throwable th) {
			System.err.println("Initial SessionFactory creation failed"+th);
			if(registry!=null) {
				StandardServiceRegistryBuilder.destroy(registry);
			}
			throw new ExceptionInInitializerError(th);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
		
	}
	
	public static void closeSessionFactory() {
		if(registry!=null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

}
