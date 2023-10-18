package lk.ijse.layered.bussiness;

import lk.ijse.layered.Sample;
import lk.ijse.layered.bussiness.custom.impl.CustomerBoImpl;
import lk.ijse.layered.bussiness.custom.impl.ItemBoImpl;
import lk.ijse.layered.entity.Customer;

public class BoFactory {
    public static <T extends SuperBo>T getBo(BoType type){
        switch (type) {
            case CUSTOMER:
                return (T)new CustomerBoImpl();
            case ITEM:
                return (T)new ItemBoImpl();
            case SAMPLE:
                return (T) new Sample();
            default:
                return null;
        }
    }

}
