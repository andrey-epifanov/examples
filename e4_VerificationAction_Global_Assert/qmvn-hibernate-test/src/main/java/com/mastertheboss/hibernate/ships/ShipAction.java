package com.mastertheboss.hibernate.ships;

import com.mastertheboss.domain.ships.Ships;
import org.testng.Assert;

/**
 * Created by aepifanov on 13.09.2016.
 */
public class ShipAction {

    private final Ships actualShips;

    public ShipAction(Ships actual) {
        this.actualShips = actual;
    }

    public void verifyName(String expectedName) {
        Assert.assertEquals(expectedName, actualShips.getName(), "Name is incorrect.");
    }

    public void verifyClass(String expectedClass) {
        Assert.assertEquals(expectedClass, actualShips.getClassValue(), "Class is incorrect.");
    }

    public void verifyLaunched(long expectedLaunched) {
        Assert.assertEquals(expectedLaunched, actualShips.getLaunched(), "Launched is incorrect.");
    }

    public void verify(Ships expected) {
        verifyName(expected.getName());
        verifyClass(expected.getClassValue());
        verifyLaunched(expected.getLaunched());
    }
}
