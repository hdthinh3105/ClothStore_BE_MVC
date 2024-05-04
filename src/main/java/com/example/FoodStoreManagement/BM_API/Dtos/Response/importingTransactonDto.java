package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class importingTransactonDto {
    private String id;
    private String billID;
    private String merchandiseID;
    private Float quantity;
    private Double amount;
}
