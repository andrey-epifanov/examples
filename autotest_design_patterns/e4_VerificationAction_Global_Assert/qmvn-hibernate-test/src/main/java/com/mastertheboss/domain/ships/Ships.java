package com.mastertheboss.domain.ships;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Андрей on 01.05.2015.
 */
@Entity
@Table
public class Ships {

    @Id
//    @GeneratedValue
    private String name;
    private String classValue;
    private short launched;

    public Ships() {
        super();
    }

    public Ships(String name) {
        this.name = name;
    }

    public Ships(String name, String classValue, short launched) {
        this.name = name;
        this.classValue = classValue;
        this.launched = launched;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassValue() {
        return classValue;
    }

    public void setClassValue(String classValue) {
        this.classValue = classValue;
    }

    public long getLaunched() {
        return launched;
    }

    public void setLaunched(short launched) {
        this.launched = launched;
    }

    @Override
    public String toString() {
        return "Ships{" +
                "name='" + name + '\'' +
                ", classValue='" + classValue + '\'' +
                ", launched=" + launched +
                '}';
    }
}