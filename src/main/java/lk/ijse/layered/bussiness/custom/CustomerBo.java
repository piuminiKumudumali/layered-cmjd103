package lk.ijse.layered.bussiness.custom;

import lk.ijse.layered.dto.CustomerDto;

public interface CustomerBo {
    boolean saveCustomer(CustomerDto dto)throws Exception;
}
