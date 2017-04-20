package hibernateWihout;

import com.mastertheboss.domain.ships.Ships;
import com.mastertheboss.util.HibernateUtil;
import org.hibernate.Session;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

//import com.mastertheboss.hibernate.ships.Ships;


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
        Ships actualShips1 = ships.get(0);

        System.out.println("Ships 1. Name:" + actualShips1.getName());
        System.out.println("Ships 1. ClassValue:" + actualShips1.getClassValue());
        System.out.println("Ships 1. Launched:" + actualShips1.getLaunched());

        Ships expected = new Ships();
        expected.setName("California");
        expected.setClassValue("Big");
        expected.setLaunched((short)120000L);

        // Usages for one field
        Assert.assertEquals("Tennessee", actualShips1.getClassValue(), "Class is incorrect.");
        Assert.assertEquals(expected.getClassValue(), actualShips1.getClassValue(), "Class is incorrect.");
    }

    @Test
    public void simpleVerification02() {
        List<Ships> ships = session.createQuery(" FROM Ships").list();
        Ships actualShips1 = ships.get(0);

        System.out.println("Ships 1. Name:" + actualShips1.getName());
        System.out.println("Ships 1. ClassValue:" + actualShips1.getClassValue());
        System.out.println("Ships 1. Launched:" + actualShips1.getLaunched());

        Ships expected = new Ships();
        expected.setName("California");
        expected.setClassValue("Big");
        expected.setLaunched((short)120000L);

        // Usages
        Assert.assertEquals(expected.getName(), actualShips1.getName(), "Name is incorrect.");
        Assert.assertEquals("Tennessee", actualShips1.getClassValue(), "Class is incorrect.");
        Assert.assertEquals(expected.getClassValue(), actualShips1.getClassValue(), "Class is incorrect.");
        Assert.assertEquals(expected.getLaunched(), actualShips1.getLaunched(), "Launched is incorrect.");
    }

    @AfterMethod
    public void afterClass() {
        session.getTransaction().commit();
        session.close();
    }
}
