package com.net.springbootrestfulapicrud.Department.model;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);

}
