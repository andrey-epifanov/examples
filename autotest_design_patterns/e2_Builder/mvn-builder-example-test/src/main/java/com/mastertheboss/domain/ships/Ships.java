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
    private long launched;

    public Ships() {
        super();
    }

    public Ships(String name) {
        this.name = name;
    }

    public Ships(String name, String classValue, long launched) {
        this.name = name;
        this.classValue = classValue;
        this.launched = launched;
    }

//    @OneToMany(mappedBy="department",cascade=CascadeType.PERSIST)
//    private List<Ships> employees = new ArrayList<Ships>(); // no - should be changed

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