package org.enset.inversion_of_control.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("== Dao Implementation 1 ==");
        double data = 1111;
        return data;
    }
}
