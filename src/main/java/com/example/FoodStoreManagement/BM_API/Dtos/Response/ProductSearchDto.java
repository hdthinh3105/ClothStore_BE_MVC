package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import com.example.FoodStoreManagement.BM_API.Dtos.request.BaseSearchDto;
import lombok.Data;

import java.util.List;

@Data
public class ProductSearchDto extends BaseSearchDto<List<ProductDto>> {
    String idCompany;
    String status;
}
