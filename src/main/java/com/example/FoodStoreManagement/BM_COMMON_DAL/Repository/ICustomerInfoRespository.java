package com.example.FoodStoreManagement.BM_COMMON_DAL.Repository;

import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.CustomerInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerInfoRespository extends JpaRepository<CustomerInfoEntity, String> {

}
