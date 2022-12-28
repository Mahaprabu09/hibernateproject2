package com.project.hibernate1;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.project.config.HibernateUtil;
import com.project.entity.song;


public class App 
{
	public static void main( String[] args ) {
		 Session session=HibernateUtil.makeSession();
		 System.out.println("got a session "+session);
		 song s=new song();
		 s.setId(1);
		 s.setSongName("no one is perfect");
		 s.setSinger("vijay antony");
		 Transaction tr = session.beginTransaction();
		 session.save(s); tr.commit(); session.close();
		 System.out.println("Object is saved using hibernate"); }
    }
