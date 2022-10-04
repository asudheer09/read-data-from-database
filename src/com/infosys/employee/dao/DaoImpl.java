package com.infosys.employee.dao;

import java.sql.*;
import java.util.ArrayList;

public class DaoImpl implements Dao {
    @Override
    public void addEmployee(Employee employee) {
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate("insert into employee values(" +
                                                                        employee.getEmpId() + "," +
                                                                        "'"+employee.getEmpName()+"'" + "," +
                                                                        employee.getSalary() + ")");
            System.out.println(i + " records updated successfully");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeEmployee(int id) {
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate("delete from employee where emp_id="+id);
            System.out.println(i + " records deleted successfully");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sudheer", "root", "Hithika#19");
        return con;
    }

    @Override
    public void getAllEmployees() {
        ArrayList<Employee> empList = new ArrayList<Employee>();
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setEmpId(rs.getInt(1));
                employee.setEmpName(rs.getString(2));
                employee.setSalary(rs.getInt(3));
                empList.add(employee);
            }

            for (Employee e : empList) {
                System.out.println(e);
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
