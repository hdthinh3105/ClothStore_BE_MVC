package com.example.FoodStoreManagement.BM_BIZ_SERVICES_IMPL;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.CustomerDto;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.CustomerInfoDto;
import com.example.FoodStoreManagement.BM_API.Mappers.ICustomerMapper;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.CustomerEntity;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.CustomerInfoEntity;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Repository.ICustomerInfoRespository;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Repository.ICustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private final ICustomerRepository customerRepository;

    private final ICustomerInfoRespository customerInfoRespository;


    @Autowired
    public CustomerServiceImpl(ICustomerRepository customerRepository, ICustomerInfoRespository customerInfoRespository){
        this.customerRepository = customerRepository;
        this.customerInfoRespository = customerInfoRespository;
    }


    public void addCustomer(CustomerDto customerDto){
      try {
          CustomerEntity customerEntity = ICustomerMapper.INSTANCE.toFromCustomerDto(customerDto);
          //System.out.println(customerDto);
          //System.out.println(customerEntity);
          customerRepository.save(customerEntity);
      }catch (Exception e){
          logger.error(e.getMessage(), e);
          throw e;
      }

    }

    //Check username account of customer
    public Optional<CustomerEntity> loginAccount(String phone, String password){
        try{
            return customerRepository.findOneByUsernameAndPassword(phone, password);
        }
        catch (Exception e){
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    //Create Customer Information when Order Shopping
    public void addCustomerInfo(CustomerInfoDto customerInfoDto){
        try {
            CustomerInfoEntity customerInfoEntity = ICustomerMapper.INSTANCE.toFromCustomerInfoDto(customerInfoDto);
            //System.out.println(customerDto);
            //System.out.println(customerEntity);
            customerInfoRespository.save(customerInfoEntity);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            throw e;
        }

    }

}
