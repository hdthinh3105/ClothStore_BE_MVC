package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class monthlyFoodWarehouseDto {
    private String id;
    private String agencyId;
    private String foodId;
    private Float quanlity;
    private Double total;
}
