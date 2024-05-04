package com.example.FoodStoreManagement.BM_COMMON_DAL.Repository;

import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ICustomerRepository extends JpaRepository<CustomerEntity, String> {
    @Query("SELECT c FROM CustomerEntity c WHERE c.phone = :phone AND c.password = :password")
    Optional<CustomerEntity> findOneByUsernameAndPassword(@Param("phone") String phone,@Param("password") String password);
}
