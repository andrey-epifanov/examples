package com.mastertheboss.domain.computers;

import org.hibernate.type.BigDecimalType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Андрей on 01.05.2015.
 */
@Entity
@Table
public class Pс {

//    code int NOT NULL ,
//    model varchar (50) NOT NULL ,
//    speed smallint NOT NULL ,
//    ram smallint NOT NULL ,
//    hd real NOT NULL ,
//    cd varchar (10) NOT NULL ,
//    price decimal(12,2) NULL

    @Id
    private int code;
    private String model;
    private short speed; // or Short
    private short ram;
    private double hd;
    private String cd;
    private BigDecimalType price; // decimal(12,2) NULL


//    @GeneratedValue
//    private String name;
//    private String classValue;
//    private long launched;

    public Pс() {
        super();
    }
    public Pс(String model) {
        this.model = model;
    }

//    @OneToMany(mappedBy="department",cascade=CascadeType.PERSIST)
//    private List<Ships> employees = new ArrayList<Ships>(); // no - should be changed


    public int getCode() {
        return code;
    }

    public String getModel() {
        return model;
    }

    public short getSpeed() {
        return speed;
    }

    public short getRam() {
        return ram;
    }

    public double getHd() {
        return hd;
    }

    public String getCd() {
        return cd;
    }

    public BigDecimalType getPrice() {
        return price;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public void setRam(short ram) {
        this.ram = ram;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public void setPrice(BigDecimalType price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pс{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", ram=" + ram +
                ", hd=" + hd +
                ", cd='" + cd + '\'' +
                ", price=" + price +
                '}';
    }
}