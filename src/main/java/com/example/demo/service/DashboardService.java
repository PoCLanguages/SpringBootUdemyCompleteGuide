package com.example.demo.service;

import com.example.demo.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DashboardService {

    List<CompanyRevenue> getTodayRevenueDash();
    List<EmployeeInformation> getAllEmployee();
    List<OrderCollectionStatus> getOrderCollection();
    List<OrderReceived> getAllOrderReceived();
    List<ProductCategory> getBestCategory();

    EmployeeInformation addEmployee(EmployeeInformation employeeInformation);

    EmployeeInformation updateEmployee (EmployeeInformation employeeInformation);

    void deleteEmployee(EmployeeInformation employeeInformation);

    EmployeeInformation getEmployee(final String pk);
}
