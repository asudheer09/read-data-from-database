package com.infosys.employee.dao;

public class DaoTest {
    public static void main(String[] args) {
        Dao dao=new DaoImpl();
        /*Employee employee= new Employee();
        employee.setSalary(45000);
        employee.setEmpName("Gandhi");
        employee.setEmpId(19499);
        dao.addEmployee(employee);*/
        dao.getAllEmployees();
        dao.removeEmployee(1947);
    }
}
