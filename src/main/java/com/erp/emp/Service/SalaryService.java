package com.erp.emp.Service;

import com.erp.emp.DAO.EmployeeRepository;
import com.erp.emp.DAO.SalaryRepository;
import com.erp.emp.Entity.Employee_Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {

    @Autowired
    private SalaryRepository salaryRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee_Salary> getSalaryHistory(Integer employeeId, Integer month, Integer year) {
        //Employee employee = employeeRepository.findById(employeeId).get();
        return salaryRepository.findEmployee_SalariesByEmployeeIdAndMonthAndYear(employeeId, month, year);
    }

    public List<Employee_Salary> getSalary(Integer employeeId) {
        return salaryRepository.findAllById(employeeId);
    }
}

