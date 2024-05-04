package com.example.FoodStoreManagement.BM_COMMON_DAL.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "company")
public class CompanyEntity {
    @Id
    private String id;

    @Column(name = "Company_ID")
    private String company;

    @Column(name = "name")
    private String name;

    @Column(name = "creade_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "code")
    private String code;





}
