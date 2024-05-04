package com.example.FoodStoreManagement.BM_COMMON_DAL.Repository;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.SizesEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
@Repository
public interface ISizesRepository extends JpaRepository<SizesEntity, String>{
    @Query("SELECT s FROM SizesEntity s WHERE s.productId in :productIDs ")
    List<SizesEntity> findAllColorsbyProductIds(@Param("productIDs")  List<String>productIDs);
}
