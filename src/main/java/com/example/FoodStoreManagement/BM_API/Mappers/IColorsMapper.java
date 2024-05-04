package com.example.FoodStoreManagement.BM_API.Mappers;

import com.example.FoodStoreManagement.BM_API.Dtos.Response.ColorsDto;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ColorsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface IColorsMapper {

    IColorsMapper INSTANCE = Mappers.getMapper(IColorsMapper.class);

    @Mapping(target = "productDto.id", source = "productId")
    ColorsDto toColorDtoFromEntity(ColorsEntity size);

    List<ColorsDto> toColorListFromEntityList(List<ColorsEntity> sizesEntities);


    @Mapping(target = "productId", source = "productDto.id")
    ColorsEntity toColorEntityFromDto(ColorsDto size);

    List<ColorsEntity> toColorListFromDtoList(List<ColorsDto> sizesEntities);

}
