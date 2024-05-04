package com.example.FoodStoreManagement.BM_API.Mappers;

import com.example.FoodStoreManagement.BM_API.Dtos.Response.ProductDto;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import java.util.List;


@Mapper
public interface IProductMapper {

    IProductMapper INSTANCE = Mappers.getMapper(IProductMapper.class);

    ProductDto toFoodDtoFromEntity(ProductEntity product);

    @Mapping(target = "category_id", source = "cateloryDto.id")
    @Mapping(target = "company_id", source = "companyDto.id")
    List<ProductDto> toFoodDtoListFromEntityList(List<ProductEntity> productEntityList);


    //    @Mapping(target = "cateloryDto.id",source = "category_id")
//    @Mapping(target = "companyDto.id",source = "company_id")
    @Mapping(target = "categoryID", source = "cateloryDto.id")
    @Mapping(target = "companyID", source = "companyDto.id")
    ProductEntity toFoodEntityFromDto(ProductDto product);

    List<ProductEntity> toFoodEntityListFromDtoList(List<ProductDto> productEntityList);

}
