package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CateloryDto {
    private String id;
    private String code;
    private String name;
    private String comment;

}
