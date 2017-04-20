package com.mastertheboss.hibernate.computers;

import com.mastertheboss.domain.computers.Pс;
import com.mastertheboss.domain.computers.TestOne;
import org.hibernate.Session;

/**
 * Created by Андрей on 09.05.2015.
 */
public class ComputerTest {
    private Session session;

    public ComputerTest(Session session) {
        this.session = session;
    }

    public void invoke() {
        Pс pc1 = (Pс)session.load(Pс.class, "1232");
        System.out.println("Lesson 1. Computers");
        System.out.println("Computers. Pc 1232 = " + pc1.toString() );
    }

    public void test() {
        TestOne testOne = (TestOne)session.load(TestOne.class, 1);
        System.out.println(testOne.toString());
    }
}
