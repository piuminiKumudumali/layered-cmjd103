package lk.ijse.layered.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.layered.bussiness.BoFactory;
import lk.ijse.layered.bussiness.BoType;
import lk.ijse.layered.bussiness.custom.CustomerBo;
import lk.ijse.layered.bussiness.custom.ItemBo;
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
    void btnSaveOnAction(ActionEvent event) {
        String id=txtId.getText();
        String name=txtName.getText();
        String address=txtAddress.getText();
        String tel=txtTel.getText();

        var dto=new CustomerDto(id,name,address,tel);

        CustomerBo bo= BoFactory.getBo(BoType.CUSTOMER);
        ItemBo itemBo=BoFactory.getBo(BoType.ITEM);
        try {
            boolean isSaved=bo.saveCustomer(dto);
            if(isSaved){
                new Alert(Alert.AlertType.CONFIRMATION,"Customer Saved!").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }

    }

}
