package com.mastertheboss.hibernate;

//import com.mastertheboss.domain.Employee;
//import com.mastertheboss.domain.Department;

import com.mastertheboss.hibernate.ships.ShipsTest;
import com.mastertheboss.util.HibernateUtil;
import org.hibernate.Session;

public class HibernateTest {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.setDefaultReadOnly( true ); // may be not need

        session.beginTransaction();

//        new ShipsTest(session).invoke();
        new ShipsTest(session).exisises_02_1();

//        new ComputerTest(session).invoke();
//        new ComputerTest(session).test();

        session.getTransaction().commit();

        session.close();
    }


}