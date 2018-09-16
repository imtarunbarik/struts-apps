package org.app.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @Author: Tarun Barik
 * @ProjectName: Struts2HBApp
 * @PackageName: org.app.utility
 * @FileName: HibernatePlug.java 
 *
 */
public class HibernatePlug {

	private static SessionFactory factory = getSessionFactory();

	public static synchronized SessionFactory getSessionFactory() {
		try {

			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");

			SessionFactory sessionFactory = cfg.buildSessionFactory();
			System.out.println(" ----------   Factory Object Created  ------------");
			return sessionFactory;

		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}// getSessionFactory()

	public static SessionFactory getFactory() {
		return factory;
	}// getFactory()

}// class