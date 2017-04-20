package com.mastertheboss.hibernate.ships;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Андрей on 01.05.2015.
 */
@Entity
@Table
public class Ship {

    @Id
    private String name;
    private String classValue;
    private long launched;

    public Ship() {
        super();
    }

    public Ship(String name) {
        this.name = name;
    }

    public Ship(String name, String classValue) {
        this(name);
        this.classValue = classValue;
    }

    public Ship(String name, long launched) {
        this(name);
        this.launched = launched;
    }

    public Ship(String name, String classValue, long launched) {
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

    public void setLaunched(long launched) {
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

//@OneToMany(mappedBy="department",cascade=CascadeType.PERSIST)
//private List<Employee> employees = new ArrayList<Employee>();

//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public List<Employee> getEmployees() {
//        return employees;
//    }
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }
//}