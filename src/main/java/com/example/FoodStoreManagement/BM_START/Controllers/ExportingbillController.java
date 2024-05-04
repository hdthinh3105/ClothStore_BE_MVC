package com.example.FoodStoreManagement.BM_START.Controllers;

import com.example.FoodStoreManagement.BM_API.Dtos.Response.ExportingBillFullDto;
import com.example.FoodStoreManagement.BM_API.Dtos.Response.ResponseDto;
import com.example.FoodStoreManagement.BM_BIZ_SERVICES_IMPL.CustomerServiceImpl;
import com.example.FoodStoreManagement.BM_BIZ_SERVICES_IMPL.ExportingbillServiceImpl;
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

@RestController
@RequestMapping(path = "/api/v1/Exportingbill")
public class ExportingbillController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private ExportingbillServiceImpl exportingbillService;

    @Autowired
    public ExportingbillController(ExportingbillServiceImpl exportingbillService) {
        this.exportingbillService = exportingbillService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createBill(@RequestBody ExportingBillFullDto exportingBillFullDto){

        try{
            int a=0;
            exportingbillService.createExportingbill(exportingBillFullDto);
            return ResponseEntity.ok(new ResponseDto(
                    List.of("create bill success"),
                    HttpStatus.CREATED.value(),
                    exportingBillFullDto
            ));
        }
        catch (RuntimeException e){
            logger.error(e.getMessage(), e);
            return ResponseEntity.ok(new ResponseDto(
                    List.of("Can not created bill"),
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    null
            ));
        }
    }

}
