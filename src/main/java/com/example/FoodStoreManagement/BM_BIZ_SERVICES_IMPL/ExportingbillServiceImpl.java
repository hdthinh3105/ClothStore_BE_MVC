package com.example.FoodStoreManagement.BM_BIZ_SERVICES_IMPL;

import com.example.FoodStoreManagement.BM_API.Dtos.Response.ExportingBillFullDto;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.ExportingBillTransactionDto;
import com.example.FoodStoreManagement.BM_API.Mappers.IExportingbillMapper;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ExportbillEntity;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ExportingBillTransactionEntity;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Repository.IExportingTransactionRepository;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Repository.IExportingbillRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExportingbillServiceImpl {
    private Logger logger = LoggerFactory.getLogger(ExportingbillServiceImpl.class);

    private IExportingbillRepository iExportingbillRepository;
    private IExportingTransactionRepository iExportingTransactionRepository;

    @Autowired
    public ExportingbillServiceImpl(IExportingbillRepository iExportingbillRepository, IExportingTransactionRepository iExportingTransactionRepository) {
        this.iExportingbillRepository = iExportingbillRepository;
        this.iExportingTransactionRepository = iExportingTransactionRepository;
    }

    @Transactional
    public void createExportingbill(ExportingBillFullDto exportingBillFullDto) {
        try {
            int a = 0;
            // thêm vào thông tin chung của đơn hàng
            ExportbillEntity exportbillEntity = IExportingbillMapper.INSTANCE.toFromExportingbillDto(exportingBillFullDto.getExportingBillDto());
            iExportingbillRepository.save(exportbillEntity);
            // thêm vào chi tiet don hang

            for (ExportingBillTransactionDto detail : exportingBillFullDto.getExportingBillTransactionDtos()) {
                detail.setBill(exportingBillFullDto.getExportingBillDto());
            }

            List<ExportingBillTransactionEntity> exportingBillTransactionEntity = IExportingbillMapper.INSTANCE.toListFromExportingbillTransactionDto(exportingBillFullDto.getExportingBillTransactionDtos());
            System.out.print(exportingBillTransactionEntity);
            for (ExportingBillTransactionEntity detail : exportingBillTransactionEntity) {
                iExportingTransactionRepository.save(detail);
            }

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

}
