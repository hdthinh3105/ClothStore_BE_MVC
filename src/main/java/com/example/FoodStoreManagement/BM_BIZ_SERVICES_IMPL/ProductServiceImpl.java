package com.example.FoodStoreManagement.BM_BIZ_SERVICES_IMPL;

import com.example.FoodStoreManagement.BM_API.Dtos.BussinessLogic.CreateRandomID;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.*;
import com.example.FoodStoreManagement.BM_API.Mappers.IColorsMapper;
import com.example.FoodStoreManagement.BM_API.Mappers.IProductMapper;
import com.example.FoodStoreManagement.BM_API.Mappers.ISizesMapper;
import com.example.FoodStoreManagement.BM_COMMON.enums.specificationProductEnum;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ColorsEntity;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.ProductEntity;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.SizesEntity;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Repository.IProductRepository;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Repository.IColorsRepository;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Repository.ISizesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl {
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
    private final IProductRepository productRepository;

    private final IColorsRepository colorsRepository;

    private final ISizesRepository sizesRepository;

    @Autowired
    public ProductServiceImpl(IProductRepository productRepository, IColorsRepository colorsRepository, ISizesRepository sizesRepository) {

        this.productRepository = productRepository;
        this.colorsRepository = colorsRepository;
        this.sizesRepository = sizesRepository;
    }

    public ProductSearchDto getAllProduct() {
        try {
            List<ProductEntity> productEntityList = productRepository.findAll();
            List<ProductDto> productDtoList = IProductMapper.INSTANCE.toFoodDtoListFromEntityList(productEntityList);

            ProductSearchDto result = new ProductSearchDto();
            result.setResult(productDtoList);
            return result;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    public ProductSearchDto getAllProductUseBaseSearch() {
        try {
            int i = 0;
            // lay ds food
            List<ProductEntity> productEntityList = productRepository.findAll();
            // chuyen sang dto
            List<ProductDto> products = IProductMapper.INSTANCE.toFoodDtoListFromEntityList(productEntityList);
            // lay tat ca option trong co so du lieu
            List<String> productIDs = products.stream().map(ProductDto::getId).collect(Collectors.toList());

            List<ColorsEntity>colorsEntities = colorsRepository.findAllSizesByProductIds(productIDs);
            List<ColorsDto>colorDtos = IColorsMapper.INSTANCE.toColorListFromEntityList(colorsEntities);

            List<SizesEntity>sizesEntities = sizesRepository.findAllColorsbyProductIds(productIDs);
            List<SizesDto>sizesDtos = ISizesMapper.INSTANCE.toSizesDtoListFromEntityList(sizesEntities);

            for(ProductDto product : products){
                List<ColorsDto> colorsList = colorDtos.stream().filter(obj -> obj.getProductDto().getId().equals(product.getId())).collect(Collectors.toList());
                colorsList.forEach(color -> color.setProductDto(null));
                List<SizesDto> sizesList = sizesDtos.stream().filter(obj -> obj.getProductDto().getId().equals(product.getId())).collect(Collectors.toList());
                sizesList.forEach(size -> size.setProductDto(null));

                product.setSizes(sizesList);
                product.setColors(colorsList);
            }


            ProductSearchDto result = new ProductSearchDto();
            result.setResult(products);
            return result;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    public ProductDto getProductById(String id) {
        try {
            ProductEntity productEntity = productRepository.findById(id).get();

            ProductDto result = IProductMapper.INSTANCE.toFoodDtoFromEntity(productEntity);
            return result;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    public void insertRandomData() {
        int amount = 100;
        List<String> colors = List.of("White", "Black", "Pink", "Blue", "Brown", "Yellow");
        List<String> sizes = List.of("S", "M", "L", "XL", "XXL", "XXXL");
        List<String> names = List.of("DC X BR LEATHER BIKER JACKET", "DC X BR LEATHER BOMBER JACKET", "DC X BR FELT VARSITY JACKET", "DC X BR MATE T-SHIRT - CREAM",
                "DC X BR WASH LOGO T-SHIRT", "DC X BR LOGO JERSEY SHIRT", "DC X BR NYLON VARSITY JACKET", "DC X BR LEOPARD ALL PRINT SHIRT");
        List<String> description = List.of("Nhập khẩu Việt Nam", "Nhập khẩu từ USA", "Nhập khẩu từ Canada");
        /*List<String> colorChose = new ArrayList<>();
        List<String> sizeChose = new ArrayList<>();
        for (int j = 0; j < colors.size(); j++) {
            int r = rd.nextInt(2);
            if (r == 0) colorChose.add(colors.get(j));
        }
        for (int j = 0; j < sizes.size(); j++) {
            int r = rd.nextInt(2);
            if (r == 0) sizeChose.add(sizes.get(j));
        }*/
        Random rd = new Random();
        List<ProductDto> productDtos = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            ProductDto productDto = new ProductDto();
            productDto.setId(CreateRandomID.generatingUID());
            productDto.setName(names.get(rd.nextInt(4)) + i);
            productDto.setImage("assets/food_" + rd.nextInt(10) + ".jpg");
            productDto.setPrice(rd.nextDouble() * 600000 + 100000);
            productDto.setDescription(description.get(rd.nextInt(3)));
            productDto.setSpecification(specificationProductEnum.NORMAL);
            CompanyDto companyDto = new CompanyDto();
            companyDto.setId("CO00" + rd.nextInt(5));
            productDto.setCode("Product" + i);
            productDto.setCompanyDto(companyDto);
            productDtos.add(productDto);
        }

        List<ProductEntity> rs = IProductMapper.INSTANCE.toFoodEntityListFromDtoList(productDtos);
        productRepository.saveAll(rs);

        List<String> ids = productDtos.stream().map(ProductDto::getId).collect(Collectors.toList());
        List<SizesDto> sizesDtos= new ArrayList<>();
        List<ColorsDto> colorsDtos= new ArrayList<>();
        for (String id : ids) {

            List<String> colorChose = new ArrayList<>();
            List<String> sizeChose = new ArrayList<>();
            for (int j = 0; j < colors.size(); j++) {
                int r = rd.nextInt(2);
                if (r == 0) colorChose.add(colors.get(j));
            }
            for (int j = 0; j < sizes.size(); j++) {
                int r = rd.nextInt(2);
                if (r == 0) sizeChose.add(sizes.get(j));
            }


            for(String color : colorChose){
                ColorsDto colorDto = new ColorsDto();
                colorDto.setId(CreateRandomID.generatingUID());
                ProductDto productDto = new ProductDto();
                productDto.setId(id);
                colorDto.setProductDto(productDto);
                colorDto.setName(color);
                colorDto.setAddition(rd.nextDouble() * 200000 + 50000);
                colorDto.setImage("assets/food_"+ rd.nextInt(16) +".jpg");
                colorsDtos.add(colorDto);
            }

            for(String size : sizeChose){
                SizesDto sizesDto = new SizesDto();
                sizesDto.setId(CreateRandomID.generatingUID());
                ProductDto productDto = new ProductDto();
                productDto.setId(id);
                sizesDto.setProductDto(productDto);
                sizesDto.setName(size);
                sizesDto.setAddition(rd.nextDouble() * 200000 + 50000);
                sizesDtos.add(sizesDto);
            }
        }

       List<ColorsEntity>rs1= IColorsMapper.INSTANCE.toColorListFromDtoList(colorsDtos);
        List<SizesEntity>rs2= ISizesMapper.INSTANCE.toSizesEntityListFromDtoList(sizesDtos);

        colorsRepository.saveAll(rs1);
        sizesRepository.saveAll(rs2);

    }
}
