package com.mastertheboss.hibernate.ships;

//import junit.framework.Assert;

/**
 * Created by aepifanov on 13.09.2016.
 */
public class ShipAction {

    private final Ship actualShip;

    public ShipAction(Ship actual) {
        this.actualShip = actual;
    }

    public void verifyName(String expectedName) {
//        Assert.assertEquals(expectedName, actualShip.getName(), "Name is incorrect.");
    }

    public void verifyClass(String expectedClass) {
//        Assert.assertEquals(expectedClass, actualShip.getClassValue(), "Class is incorrect.");
    }

    public void verifyLaunched(long expectedLaunched) {
//        Assert.assertEquals("Launched is incorrect.", expectedLaunched, actualShip.getLaunched());
    }

    public void verify(Ship expected) {
        verifyName(expected.getName());
        verifyClass(expected.getClassValue());
        verifyLaunched(expected.getLaunched());
    }
}
