package lk.ijse.layered.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lk.ijse.layered.bussiness.custom.CustomerBo;
import lk.ijse.layered.bussiness.custom.impl.CustomerBoImpl;
import lk.ijse.layered.dto.CustomerDto;

public class CustomerFormController {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTel;

    @FXML
    void btnSaveOnAction(ActionEvent event) throws Exception {
        String id=txtId.getText();
        String name=txtName.getText();
        String address=txtAddress.getText();
        String tel=txtTel.getText();

        var dto=new CustomerDto(id,name,address,tel);

        CustomerBo bo=new CustomerBoImpl();
        boolean isSaved=bo.saveCustomer(dto);

    }

}
