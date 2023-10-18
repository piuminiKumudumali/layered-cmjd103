package lk.ijse.layered.dao.custom;

import lk.ijse.layered.entity.Customer;

public interface CustomerDao {
    boolean save(Customer customer)throws Exception;
}
