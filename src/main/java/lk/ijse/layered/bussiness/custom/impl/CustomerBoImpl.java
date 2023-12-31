package lk.ijse.layered.bussiness.custom.impl;

import lk.ijse.layered.bussiness.custom.CustomerBo;
import lk.ijse.layered.dao.custom.CustomerDao;
import lk.ijse.layered.dao.custom.impl.CustomerDaoImpl;
import lk.ijse.layered.dto.CustomerDto;
import lk.ijse.layered.entity.Customer;

public class CustomerBoImpl implements CustomerBo {
    @Override
    public boolean saveCustomer(CustomerDto dto) throws Exception {
         String id=dto.getId();
         String name=dto.getName();
         String address=dto.getAddress();
         String tel= dto.getTel();

         var customer=new Customer(id,name,address,tel);

         CustomerDao customerDao=new CustomerDaoImpl();
         boolean isSaved=customerDao.save(customer);
         return isSaved;
    }
}
