package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class agencyDto {
    private String id;
    private String name;
    private Date createdDate;
    private Date updatedDate;
    private String phone;
    private String address;
    private String code;
    private String companyId;
}
