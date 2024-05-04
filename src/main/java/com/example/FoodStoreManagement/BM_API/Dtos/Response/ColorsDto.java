package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ColorsDto {
    private String id;
    private String name;
    private Double addition;
    private String image;
    private ProductDto productDto;
}
