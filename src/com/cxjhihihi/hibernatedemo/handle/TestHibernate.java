package com.cxjhihihi.hibernatedemo.handle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cxjhihihi.hibernatedemo.domain.User;

/**
 * @author hzcaixinjia
 */
public class TestHibernate {
    public static void main(String args[]) {
        User user = new User();
        user.setId(1);
        user.setName("cxjhihihi");
        user.setPassword("cxjhihihipass");
        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        sf.close();

    }
}
