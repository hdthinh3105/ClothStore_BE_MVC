package com.example.FoodStoreManagement.BM_API.Dtos.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseSearchDto<T> {
    private int currentPage;
    private int recordOfPage;
    private long totalRecords;
    private boolean sortAsc = true;
    private String sortBy;
    private int pagingRange;
    private T result;
}

