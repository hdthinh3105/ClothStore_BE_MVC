package com.example.FoodStoreManagement.BM_COMMON_DAL.Repository;


import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IProductRepository extends JpaRepository<ProductEntity, String> {
    @Query("SELECT f FROM ProductEntity f WHERE f.id = :id ")
    List<ProductEntity> findAllFoodById(@Param("id") String id);
}
