package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class monthlyMerchandiseWarehouseDto {
    private String id;
    private String agencyid;
    private String merchandiseId;
    private Float quanlity;
    private Double total;
}
