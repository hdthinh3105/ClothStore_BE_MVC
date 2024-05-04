package com.example.FoodStoreManagement.BM_COMMON_DAL.Repository;

import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ColorsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IColorsRepository extends JpaRepository <ColorsEntity, String>{
    @Query("SELECT c FROM ColorsEntity c WHERE c.productId in :ids  ")
    List<ColorsEntity> findAllSizesByProductIds(@Param("ids") List<String> ids);
}
