package com.example.FoodStoreManagement.BM_API.Dtos.Response;
import com.example.FoodStoreManagement.BM_API.Dtos.BussinessLogic.CreateRandomID;
import com.example.FoodStoreManagement.BM_API.Dtos.BussinessLogic.HandleDate;
import com.example.FoodStoreManagement.BM_COMMON.enums.CustomerGender;
import com.example.FoodStoreManagement.BM_COMMON.enums.customerRanking;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

//@NoArgsConstructor
@Data
@AllArgsConstructor
public class CustomerDto {
    private String id;
    private String eid;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private Date birthday;
    private Date date_created;
    private Date date_updated;
    @Enumerated(EnumType.STRING)
    private customerRanking ranking;
    @Enumerated(EnumType.STRING)
    private CustomerGender gender;
    private String password;



    private Date getDateNowToDateCreated(){
        return HandleDate.getDatetimeNowFromSystem();
    }

    private Date getDateWhenUpdate() {
       return HandleDate.getDatetimeNowFromSystem();
    }

    private void checkIDObject(String id){
        if(this.id == id){
            this.date_updated = getDateWhenUpdate();
        }
        else{
            this.date_updated = null;
        }
    }

    public CustomerDto(){
        this.id = CreateRandomID.generatingUID();
        this.eid = CreateRandomID.generateRandomId();
        this.date_created = getDateNowToDateCreated();
    }

}
