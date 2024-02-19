package org.enset.inversion_of_control.dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao{

    @Override
    public double getData() {
        System.out.println("== Dao Implementation 2 ==");
        double data = 2222;
        return data;
    }
}
