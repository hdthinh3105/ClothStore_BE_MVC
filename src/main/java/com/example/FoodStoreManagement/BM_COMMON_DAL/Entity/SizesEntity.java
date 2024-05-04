package com.example.FoodStoreManagement.BM_COMMON_DAL.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sizes")
public class SizesEntity {
    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "idProduct")
    private String productId;

    @Column(name = "addition")
    private Double addition;

}
