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
@Table(name = "catelory")
public class CateloryEntity {
    @Id
    private String id;
    @Column(name = "Code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "comment")
    private String commnet;

}
