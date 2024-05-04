package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import com.example.FoodStoreManagement.BM_API.Dtos.BussinessLogic.CreateRandomID;
import com.example.FoodStoreManagement.BM_API.Dtos.BussinessLogic.HandleDate;
import com.example.FoodStoreManagement.BM_COMMON.enums.BillStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ExportingBillDto {

    private String id;
    private Date dateExport;
    private Date dateCreated;
    private Double total;
    @Enumerated(EnumType.STRING)
    private BillStatus status;
    private CustomerDto customerDto;
    private agencyDto agencyDto;

    public ExportingBillDto() {
        this.id = CreateRandomID.generatingUID();
        this.dateCreated = HandleDate.getDatetimeNowFromSystem();
    }
}
