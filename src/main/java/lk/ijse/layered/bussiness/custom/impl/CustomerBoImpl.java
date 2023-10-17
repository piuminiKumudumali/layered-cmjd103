package lk.ijse.layered.bussiness.custom.impl;

import lk.ijse.layered.bussiness.custom.CustomerBo;
import lk.ijse.layered.dao.CustomerDao;
import lk.ijse.layered.dto.CustomerDto;

public class CustomerBoImpl implements CustomerBo {
    @Override
    public boolean saveCustomer(CustomerDto dto) throws Exception {
         String id=dto.getId();
         String name=dto.getName();
         String address=dto.getAddress();
         String tel= dto.getTel();

         CustomerDao customerDao=new CustomerDao();
         boolean isSaved=customerDao.save(id, name,address,tel);
    }
}
