package lk.ijse.layered.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto {
    String id;
    String name;
    String address;
    String tel;

}
