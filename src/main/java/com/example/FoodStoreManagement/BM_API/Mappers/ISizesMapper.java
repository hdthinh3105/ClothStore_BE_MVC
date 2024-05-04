package com.example.FoodStoreManagement.BM_API.Mappers;

import com.example.FoodStoreManagement.BM_API.Dtos.Response.SizesDto;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.SizesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface ISizesMapper {

    ISizesMapper INSTANCE = Mappers.getMapper(ISizesMapper.class);

    @Mapping(target = "productDto.id", source = "productId")
    SizesDto toSizeDtoFromEntity(SizesEntity size);

    List<SizesDto> toSizesDtoListFromEntityList(List<SizesEntity> sizesEntities);

    @Mapping(target = "productId", source = "productDto.id")
    SizesEntity toSizeEntityFromDto(SizesDto size);

    List<SizesEntity> toSizesEntityListFromDtoList(List<SizesDto> sizesEntities);


}
