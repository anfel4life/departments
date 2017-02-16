package com.pedanov.departments;

import com.pedanov.departments.dao.DepartmentDao;
import com.pedanov.departments.dao.EmployeeDao;

public class DepartmentApplication {
    private DepartmentDao departmentDao = new DepartmentDao();
    private EmployeeDao employeeDao = new EmployeeDao();

    public void run() throws InterruptedException {
        while (true) {
            //read from console and process commands
            System.out.println("Write something");
            Thread.sleep(5000);
        }
    }
}
