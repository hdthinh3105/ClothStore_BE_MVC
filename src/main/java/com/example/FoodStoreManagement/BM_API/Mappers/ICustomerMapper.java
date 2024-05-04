package com.example.FoodStoreManagement.BM_API.Mappers;

import com.example.FoodStoreManagement.BM_API.Dtos.Response.CustomerDto;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.CustomerInfoDto;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.CustomerEntity;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.CustomerInfoEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ICustomerMapper {
    ICustomerMapper INSTANCE = Mappers.getMapper(ICustomerMapper.class);

    @Mapping(target = "ranking", source = "ranking")
    CustomerEntity toFromCustomerDto(CustomerDto customerDto);

    @Mapping(target = "ranking", source = "ranking")
    CustomerDto toFromCustomerEntity(CustomerEntity customerEntity);

    CustomerInfoEntity toFromCustomerInfoDto(CustomerInfoDto customerInfoDto);

}

