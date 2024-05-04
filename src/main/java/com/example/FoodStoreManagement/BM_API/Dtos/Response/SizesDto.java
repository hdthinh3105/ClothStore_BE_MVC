package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SizesDto {
    private String id;
    private String name;
    private Double addition;
    private ProductDto productDto;
}
