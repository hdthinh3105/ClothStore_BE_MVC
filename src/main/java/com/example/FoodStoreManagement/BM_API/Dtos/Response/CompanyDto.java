package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CompanyDto {
    private String id;
    private String companyid;
    private String name;
    private Date createDate;
    private Date updateDate;
    private String phone;
    private String address;
    private String code;
}
