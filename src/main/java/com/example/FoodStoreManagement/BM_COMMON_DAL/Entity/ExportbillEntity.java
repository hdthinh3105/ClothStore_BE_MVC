package com.example.FoodStoreManagement.BM_COMMON_DAL.Entity;

import com.example.FoodStoreManagement.BM_COMMON.enums.BillStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exporting_bill")
public class ExportbillEntity {

    @Id
    private String id;

    @Column(name = "date_Export")
    private Date dateExport;

    @Column(name = "date_Created")
    private Date dateCreated;

    @Column(name = "total")
    private Double total;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private BillStatus status;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "agency_id")
    private String agencyId;

}
