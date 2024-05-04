package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import com.example.FoodStoreManagement.BM_API.Dtos.BussinessLogic.CreateRandomID;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExportingBillTransactionDto {
    private String id;
    private ExportingBillDto bill;
    private ProductDto product;
    private int quantity;
    private Double amount;

    public ExportingBillTransactionDto(){
        this.id = CreateRandomID.generatingUID();
    }
}
