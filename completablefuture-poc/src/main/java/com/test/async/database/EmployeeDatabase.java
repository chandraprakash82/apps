package com.test.async.database;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.async.dto.Employee;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> fetchEmployees() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            ClassLoader classLoader = EmployeeDatabase.class.getClassLoader();
            URL resource = classLoader.getResource("employees.json");

           /* if (resource == null) {
                throw new IllegalArgumentException("file is not found!");
            } else {
                return new File(resource.getFile());
            }*/
            return mapper
                    .readValue(new File(resource.getFile()), new TypeReference<List<Employee>>() {
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
