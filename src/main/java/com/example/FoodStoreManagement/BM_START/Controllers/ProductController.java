package com.example.FoodStoreManagement.BM_START.Controllers;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.ResponseDto;
import com.example.FoodStoreManagement.BM_BIZ_SERVICES_IMPL.ProductServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:5555")
@RequestMapping(path = "/api/v1/Food")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    //Get all foods
    @PostMapping("/findAlltemp")
    private ResponseEntity<?> getAllProduct(HttpServletRequest request) {
        try {

            var result = productService.getAllProduct();
            return ResponseEntity.ok(new ResponseDto(
                    List.of("Successful for find!"),
                    HttpStatus.OK.value(),
                    result
            ));

        } catch (RuntimeException e) {
            logger.error(e.getMessage(), e);
            return ResponseEntity.ok(new ResponseDto(
                    List.of(e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    null
            ));
        }
    }

    @PostMapping("/findAll")
    private ResponseEntity<?> seach2(HttpServletRequest request) {
        int i = 0;
        try {

            var result = productService.getAllProductUseBaseSearch();
            return ResponseEntity.ok(new ResponseDto(
                    List.of("Successful for find!"),
                    HttpStatus.OK.value(),
                    result
            ));

        } catch (RuntimeException e) {
            logger.error(e.getMessage(), e);
            return ResponseEntity.ok(new ResponseDto(
                    List.of(e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    null
            ));
        }
    }

    //Get food by id
    @GetMapping("{id}")
    private ResponseEntity<?> seachProductById(@PathVariable String id){
        String status = "Successful for find by id = %s".formatted(id);
        try{
            var result = productService.getProductById(id);
            return ResponseEntity.ok(new ResponseDto(
                    List.of(status),
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    result
            ));
        }catch (RuntimeException e){
            return ResponseEntity.ok(new ResponseDto(
                    List.of("NOT FOUND"),
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    null
            ));
        }
    }

    @PostMapping("insertData2Test")
    private ResponseEntity<?> RandomInsert(){
        try{
            productService.insertRandomData();

            return ResponseEntity.ok(new ResponseDto(
                    List.of("ok"),
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    null
            ));
        }catch (RuntimeException e) {
            logger.error(e.getMessage(), e);
            return ResponseEntity.ok(new ResponseDto(
                    List.of(e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    null
            ));
        }
    }

}
