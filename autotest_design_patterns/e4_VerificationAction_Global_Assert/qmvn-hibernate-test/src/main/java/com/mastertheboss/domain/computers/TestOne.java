package com.mastertheboss.domain.computers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Андрей on 01.05.2015.
 */
@Entity
@Table
public class TestOne {

    @Id
    private int code;

    public TestOne() {
        super();
    }
    public TestOne(int code) {
        super();
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "TestOne{" +
                "code=" + code +
                '}';
    }
}