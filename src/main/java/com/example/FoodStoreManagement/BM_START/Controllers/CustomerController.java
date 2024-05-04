package com.example.FoodStoreManagement.BM_START.Controllers;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.CustomerDto;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.CustomerInfoDto;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.CustomerLoginRequest;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.ResponseDto;
import com.example.FoodStoreManagement.BM_API.Mappers.ICustomerMapper;
import com.example.FoodStoreManagement.BM_BIZ_SERVICES_IMPL.CustomerServiceImpl;
import com.example.FoodStoreManagement.BM_COMMON_DAL.Entity.CustomerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin(origins = "http://localhost:5555")
@RequestMapping(path = "/api/v1/Customer")
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerServiceImpl customerService;

    @Autowired
    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDto customerDto) {
        try {
            customerService.addCustomer(customerDto);
            return ResponseEntity.ok(new ResponseDto(
                    List.of("Adding data for customer"),
                    HttpStatus.CREATED.value(),
                    customerDto
            ));
        } catch (RuntimeException e) {
            logger.error(e.getMessage(), e);
            return ResponseEntity.ok(new ResponseDto(
                    List.of("Can not add data"),
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    null
            ));
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginCustomer(@RequestBody CustomerLoginRequest customerLoginRequest) {
        int a = 0;
        String phone = customerLoginRequest.getUsername();
        String password = customerLoginRequest.getPassword();

        Optional<CustomerEntity> customerEntity = customerService.loginAccount(phone, password);

        if (customerEntity.isPresent()) {
            CustomerDto customerDto = ICustomerMapper.INSTANCE.toFromCustomerEntity(customerEntity.get());
            return ResponseEntity.ok(customerDto);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }


    @PostMapping("/createInfo")
    public ResponseEntity<?> saveCustomerInfo(@RequestBody CustomerInfoDto customerInfoDto) {
        try {
            customerService.addCustomerInfo(customerInfoDto);
            return ResponseEntity.ok(new ResponseDto(
                    List.of("Adding data for customer"),
                    HttpStatus.CREATED.value(),
                    customerInfoDto
            ));
        } catch (RuntimeException e) {
            logger.error(e.getMessage(), e);
            return ResponseEntity.ok(new ResponseDto(
                    List.of("Can not add data"),
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    null
            ));
        }
    }

}
