package com.example.FoodStoreManagement.BM_COMMON_DAL.Entity;

import com.example.FoodStoreManagement.BM_COMMON.enums.CustomerGender;
import com.example.FoodStoreManagement.BM_COMMON.enums.customerRanking;
import jakarta.persistence.*;
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
@Table(name = "customer")
public class CustomerEntity {

    @Id
    private String id;

    @Column(name = "eCustomer_ID")
    private String eid;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "date_created")
    private Date date_created;

    @Column(name = "date_updated")
    private Date date_updated;

    @Column(name = "ranking")
    @Enumerated(EnumType.STRING)
    private customerRanking ranking;

    @Column(name = "password")
    private String password;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private CustomerGender gender;
}
