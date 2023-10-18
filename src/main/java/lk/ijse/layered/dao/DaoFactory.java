package lk.ijse.layered.dao;

import lk.ijse.layered.dao.custom.impl.CustomerDaoImpl;

import static lk.ijse.layered.bussiness.BoType.CUSTOMER;

public class DaoFactory {

    public static <T>T getDao(DaoType type){
        switch (type){
            case CUSTOMER:
                return (T) new CustomerDaoImpl();
        }
    }
}
