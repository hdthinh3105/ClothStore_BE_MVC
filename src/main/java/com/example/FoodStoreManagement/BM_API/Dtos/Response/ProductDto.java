package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import com.example.FoodStoreManagement.BM_COMMON.enums.specificationProductEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@Data
public class ProductDto {
    private String id;
    private String code;
    private String name;
    private Double price;
    private String status;
    private String description;
    private String image;
    @Enumerated(EnumType.STRING)
    private specificationProductEnum specification;
    private CateloryDto cateloryDto;
    private CompanyDto companyDto;
    List<ColorsDto>colors;
    List<SizesDto>sizes;
}
