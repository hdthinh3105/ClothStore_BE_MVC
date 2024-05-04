package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import com.example.FoodStoreManagement.BM_COMMON.enums.typeMerchandise;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class merchandiseDto {
    private String id;
    private String Code;
    private String name;
    private Double price;
    private String image;
    @Enumerated(EnumType.STRING)
    private typeMerchandise type;
    private int disable;
    private String companyId;

}
