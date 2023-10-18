package lk.ijse.layered.dao.custom.impl;

import lk.ijse.layered.dao.custom.CustomerDao;
import lk.ijse.layered.db.DbConnection;
import lk.ijse.layered.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public boolean save(Customer customer) throws Exception {
        Connection connection= DbConnection.getInstance().getConnection();
        String sql="INSERT INTO customer VALUES(?,?,?,?)";

        PreparedStatement pstm=connection.prepareStatement(sql);

        pstm.setString(1, customer.getId());
        pstm.setString(2, customer.getName());
        pstm.setString(3, customer.getAddress());
        pstm.setString(4, customer.getTel());

        int affectedRows= pstm.executeUpdate();
        return affectedRows>0;
    }
}
