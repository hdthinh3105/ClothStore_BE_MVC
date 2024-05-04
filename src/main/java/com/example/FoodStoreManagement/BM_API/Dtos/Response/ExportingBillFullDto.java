package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class ExportingBillFullDto {
    ExportingBillDto exportingBillDto;
    List<ExportingBillTransactionDto> exportingBillTransactionDtos;
}
