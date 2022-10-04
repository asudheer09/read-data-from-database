package com.infosys.employee.dao;

import java.util.ArrayList;

public interface Dao {
    public abstract void addEmployee(Employee employee);
    public abstract void removeEmployee(int id);
    public abstract void getAllEmployees();
}
