package com.example.FoodStoreManagement.BM_API.Dtos.BussinessLogic;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class HandleDate {

    public static Date getDatetimeNowFromSystem(){
        LocalDate getDateNow = LocalDate.now();
        Date d = Date.from(getDateNow.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return d;
    }
}
