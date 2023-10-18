package lk.ijse.layered.bussiness.custom;

import lk.ijse.layered.bussiness.SuperBo;
import lk.ijse.layered.dto.CustomerDto;

public interface CustomerBo extends SuperBo {
    boolean saveCustomer(CustomerDto dto)throws Exception;
}
