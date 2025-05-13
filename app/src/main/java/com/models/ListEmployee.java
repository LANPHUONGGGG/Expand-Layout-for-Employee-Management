package com.models;

import java.util.ArrayList;
import java.util.List;

public class ListEmployee {
    private List<Employee> employeeList;

    public ListEmployee() {
        employeeList = new ArrayList<>();
        generate_sample_dataset(); // Gọi tạo dữ liệu mẫu ngay khi khởi tạo
    }

    public List<Employee> getEmployee() {
        return employeeList;
    }

    private void generate_sample_dataset() {
        Employee e1 = new Employee();
        e1.setName("John");
        e1.setEmail("john@gmail.com");
        e1.setUsername("john");
        e1.setPassword("123");
        employeeList.add(e1);

        Employee e2 = new Employee();
        e2.setName("Peter");
        e2.setEmail("peter@gmail.com");
        e2.setUsername("peter");
        e2.setPassword("456");
        employeeList.add(e2);

        Employee e3 = new Employee();
        e3.setName("Lili");
        e3.setEmail("lili@gmail.com");
        e3.setUsername("lili");
        e3.setPassword("789");
        employeeList.add(e3);
    }
}
