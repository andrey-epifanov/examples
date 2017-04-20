package hibernateverification;

import com.mastertheboss.domain.ships.Ships;
import com.mastertheboss.hibernate.ships.ShipAction;
import com.mastertheboss.util.HibernateUtil;
import org.hibernate.Session;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


/**
 * Created by Андрей on 09.05.2015.
 */
public class ShipsTest {

    private Session session;

    @BeforeMethod
    private void beforeMethod() {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }

    @Test
    public void simpleVerification01() {
        List<Ships> ships = session.createQuery(" FROM Ships").list();
        Ships ships1 = ships.get(0);

        System.out.println("Ships 1. Name:" + ships1.getName());
        System.out.println("Ships 1. ClassValue:" + ships1.getClassValue());
        System.out.println("Ships 1. Launched:" + ships1.getLaunched());

        Ships expected = new Ships();
        expected.setName("California");
        expected.setClassValue("Big");
        expected.setLaunched((short)120000L);

        // Usages
        ShipAction shipAction = new ShipAction(ships1);

        // Usages for one field
        shipAction.verifyClass("Tennessee");
        shipAction.verifyClass(expected.getClassValue());
    }

    @Test
    public void simpleVerification02() {
        List<Ships> ships = session.createQuery(" FROM Ships").list();
        Ships ships1 = ships.get(0);

        System.out.println("Ships 1. Name:" + ships1.getName());
        System.out.println("Ships 1. ClassValue:" + ships1.getClassValue());
        System.out.println("Ships 1. Launched:" + ships1.getLaunched());

        Ships expected = new Ships();
        expected.setName("California");
        expected.setClassValue("Big");
        expected.setLaunched((short)120000L);

        // Usages
        ShipAction shipAction = new ShipAction(ships1);
        shipAction.verify(expected);

        // Usages for one field
        shipAction.verifyClass(expected.getClassValue());

        shipAction.verifyLaunched(1921L);
    }

    @AfterMethod
    public void afterClass() {
        session.getTransaction().commit();
        session.close();
    }
}
