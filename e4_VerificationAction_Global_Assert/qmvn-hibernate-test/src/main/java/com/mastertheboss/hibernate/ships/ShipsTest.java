package com.mastertheboss.hibernate.ships;

import com.mastertheboss.domain.ships.Outcomes;
import com.mastertheboss.domain.ships.Ships;
import com.mastertheboss.util.UtilString;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

//import com.mastertheboss.domain.ships.Ships;
//import com.mastertheboss.domain.ships.ShipAction;

/**
 * Created by Андрей on 09.05.2015.
 */
public class ShipsTest {
    private Session session;

    public ShipsTest(Session session) {
        this.session = session;
    }

    public void invoke() {
//        Ships ships1 = new Ships("MyShip");
//        Ships ship2 = new Ships("California", "Tennessee", 1921);
//        session.save(ships1);
//        session.save(ship2);

        Ships ships1 = (Ships)session.load(Ships.class, "California");
        System.out.println("Ships 1. Name:" + ships1.getName());
        System.out.println("Ships 1. ClassValue:" + ships1.getClassValue());
        System.out.println("Ships 1. Launched:" + ships1.getLaunched());

        System.out.println("Ships list: ");
        List<Ships> ships_list = session.createQuery("FROM Ships").list();
        for(Ships ships :ships_list){
            System.out.println("Ships: " + ships.toString());
        }
    }

    // Done
    public void exisises_02_1() {
        System.out.println("Outcomes list: ");
        List<Outcomes> outcomes_list = session.createQuery(" FROM Outcomes").list();
        List<Outcomes> out_result = new ArrayList<Outcomes>();
        for(Outcomes outcome:outcomes_list){
            if (outcome.getShip().toString().replaceFirst(" ", "FSpace").contains(" ")){
                out_result.add(outcome);
            }
        }
        for(Outcomes outcome:out_result){
//            System.out.println("Outcomes: " + outcome.toString());
            String shipName = outcome.getShip().toString();
            int firstSpace = shipName.indexOf(" ") + 1;
            int secondSpace = shipName.replaceFirst(" ", "1").indexOf(" ");

            String starString = UtilString.getIncrementedString("*", (secondSpace - firstSpace));

//            System.out.println("Outcomes. " + firstSpace + " ; " + secondSpace);
            System.out.println("Outcomes. " + "Outcomes{ship='" +
                    "" + shipName + "'" +
                    " ; shipResalt = '" +
                    shipName.substring(0, firstSpace) +
                    starString +
                    shipName.substring(secondSpace, shipName.length()) + "'"
            );
        }
        System.out.println("");
    }

    public void exisises_My() {
        Ships ships1 = (Ships)session.load(Ships.class, "California");
        System.out.println("Ships 1. Name:" + ships1.getName());
        System.out.println("Ships 1. ClassValue:" + ships1.getClassValue());
        System.out.println("Ships 1. Launched:" + ships1.getLaunched());

        Ships expected = new Ships();
        expected.setName("California");
        expected.setClassValue("Big");
        expected.setLaunched((short)12000);

        // Usages
        ShipAction shipAction = new ShipAction(ships1);
        shipAction.verify(expected);

        // Usages for one field
        shipAction.verifyClass(expected.getClassValue());
    }

}
