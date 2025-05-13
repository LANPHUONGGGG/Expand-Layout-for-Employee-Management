package com.connectors;

import com.models.Employee;
import com.models.ListEmployee;

import java.util.List;

public class EmployeeConnector {

    private List<Employee> employeeList;

    public EmployeeConnector() {
        // Khởi tạo danh sách nhân viên mẫu
        ListEmployee listEmployee = new ListEmployee();
        this.employeeList = listEmployee.getEmployee();
    }

    public Employee login(String usr, String pwd) {
        for (Employee emp : employeeList) {
            if (emp.getUsername().equalsIgnoreCase(usr) && emp.getPassword().equals(pwd)) {
                return emp; // Đăng nhập thành công
            }
        }
        return null; // Đăng nhập thất bại
    }
}
