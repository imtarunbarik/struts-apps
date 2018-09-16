package org.app.dao;

import java.util.List;

import org.app.model.Mybean;
import org.app.utility.HibernatePlug;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @Author: Tarun Barik
 * @ProjectName: Struts2HBApp
 * @PackageName: org.app.dao
 * @FileName: MyOperations.java 
 *
 */
public class MyOperations {
	// properties
	SessionFactory factory = HibernatePlug.getFactory();
	Session session = factory.openSession();
	Mybean p;
	List recList = null;

	/***
	 * This method is for to retrieve the records from db.
	 * 
	 * @return
	 */
	public List retrieveRecords() {
		recList = (List<Mybean>) session.createQuery("from Mybean b").list();
		System.out.println("got size" + recList.size());
		return recList;
	}// retrieveRecords()

	public List retrieveRecord(String val) {
		recList = (List<Mybean>) session.createQuery("from Mybean b where b.no=" + val).list();
		System.out.println("got size" + recList.size());
		return recList;
	}// retrieveRecord(-)

	public void insertRecord(Mybean p) {
		Transaction tx = session.beginTransaction();
		session.save(p);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
	}// insertRecord(-)

	public void upRecord(Mybean p) {
		Transaction tx = session.beginTransaction();
		Query qry = session.createQuery("update Mybean b set b.nam=?, b.ct=? where b.no=" + p.getNo());
		qry.setParameter(0, p.getNam());
		qry.setParameter(1, p.getCt());
		qry.executeUpdate();
		System.out.println("Object updated successfully...");
		tx.commit();
	}// upRecord(-)

	public void deleteRecord(String cv[]) {
		Transaction tx = session.beginTransaction();
		for (int i = 0; i < cv.length; i++) {
			Query qry = session.createQuery("delete from Mybean b where b.no=" + cv[i]);
			qry.executeUpdate();
		}
		System.out.println("Object(s) deleted successfully..");
		tx.commit();
	}// deleteRecord(-)

}// class