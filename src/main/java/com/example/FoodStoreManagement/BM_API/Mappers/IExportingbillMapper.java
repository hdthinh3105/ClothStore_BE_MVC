package com.example.FoodStoreManagement.BM_API.Mappers;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.ExportingBillDto;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.ExportingBillTransactionDto;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ExportbillEntity;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ExportingBillTransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IExportingbillMapper {
    IExportingbillMapper INSTANCE = Mappers.getMapper(IExportingbillMapper.class);

    @Mapping(target = "status", source = "status")
    @Mapping(target = "customerId", source = "customerDto.id")
    @Mapping(target = "agencyId", source = "agencyDto.id")


    // cái chỗ này là entity
    ExportbillEntity toFromExportingbillDto(ExportingBillDto exportingBillDto);

    @Mapping(target = "productID", source = "product.id")
    @Mapping(target = "billID", source = "bill.id")
    ExportingBillTransactionEntity toFromExportingbillTransactionDto(ExportingBillTransactionDto exportingTransactionDto);

    List<ExportingBillTransactionEntity> toListFromExportingbillTransactionDto(List<ExportingBillTransactionDto> exportingTransactionDto);

}
