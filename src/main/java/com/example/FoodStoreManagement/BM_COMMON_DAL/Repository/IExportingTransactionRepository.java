package com.example.FoodStoreManagement.BM_COMMON_DAL.Repository;

import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ExportingBillTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExportingTransactionRepository extends JpaRepository<ExportingBillTransactionEntity,String> {
}
