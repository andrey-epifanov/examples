package com.mastertheboss.hibernate.ships;

import com.mastertheboss.domain.ships.Outcomes;
import com.mastertheboss.util.UtilString;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 09.05.2015.
 */
public class ShipsTest {
    private Session session;

    public ShipsTest(Session session) {
        this.session = session;
    }

    public void invoke() {
//        Ships ship1 = new Ships("MyShip");
//        Ships ship2 = new Ships("California", "Tennessee", 1921);
//        session.save(ship1);
//        session.save(ship2);

        Ship ship1 = (Ship)session.load(Ship.class, "California");
        System.out.println("Ships 1. Name:" + ship1.getName());
        System.out.println("Ships 1. ClassValue:" + ship1.getClassValue());
        System.out.println("Ships 1. Launched:" + ship1.getLaunched());

        System.out.println("Ship list: ");
        List<Ship> ships_list = session.createQuery("FROM Ships").list();
        for(Ship ship:ships_list){
            System.out.println("Ship: " + ship.toString());
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
        Ship ship1 = (Ship)session.load(Ship.class, "California");
        System.out.println("Ships 1. Name:" + ship1.getName());
        System.out.println("Ships 1. ClassValue:" + ship1.getClassValue());
        System.out.println("Ships 1. Launched:" + ship1.getLaunched());

        Ship expected = new Ship();
        expected.setName("California");
        expected.setClassValue("Big");
        expected.setLaunched(120000L);

        // Usages
        ShipAction shipAction = new ShipAction(ship1);
        shipAction.verify(expected);

        // Usages for one field
        shipAction.verifyClass(expected.getClassValue());
    }

}
