package com.mastertheboss.domain.ships;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Андрей on 11.05.2015.
 */
@Entity
@Table
public class Outcomes {

    @Id
    private String ship;
    private String battle;
    private String result;

    public Outcomes(){ super(); }
    public Outcomes(String ship){
        super();
        this.ship = ship;
    }

    public String getShip() {
        return ship;
    }

    public String getBattle() {
        return battle;
    }

    public String getResult() {
        return result;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public void setBattle(String battle) {
        this.battle = battle;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Outcomes{" +
                "ship='" + ship + '\'' +
                ", battle='" + battle + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
