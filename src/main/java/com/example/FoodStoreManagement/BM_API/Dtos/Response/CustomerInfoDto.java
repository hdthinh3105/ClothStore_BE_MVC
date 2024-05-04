package com.example.FoodStoreManagement.BM_API.Dtos.Response;
import com.example.FoodStoreManagement.BM_API.Dtos.BussinessLogic.CreateRandomID;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CustomerInfoDto {

    private String id;
    private String eid;
    private String fullname;
    private String phone;
    private String email;
    private String address;

    public CustomerInfoDto() {
        this.id = CreateRandomID.generatingUID();
        this.eid = CreateRandomID.generateRandomId();
    }
}
