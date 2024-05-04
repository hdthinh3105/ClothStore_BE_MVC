package com.example.FoodStoreManagement.BM_API.Dtos.Response;

import com.example.FoodStoreManagement.BM_COMMON.enums.BillStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class importingBillDto {
    private String id;
    private Date dateImport;
    private Date createdDate;
    private Double total;
    @Enumerated(EnumType.STRING)
    private BillStatus status;
    private String customerId;
    private String agencyId;
}
