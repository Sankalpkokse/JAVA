package com.JDBC_Practice.Spring_JDBC_Demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class employeeRepo {

    JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Employee e){
        String sql = "insert into Employee (id, name, department) values (?,?,?)";
        template.update(sql,e.getId(),e.getName(),e.getDepartment());
        System.out.println("Employee information saved successfully...");
    }
    public List<Employee> getAllEmployee(){
        String sql = "Select * from Employee";
        RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee e = new Employee();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setDepartment(rs.getString(3));
                return e;
            }
        };
        return template.query(sql,rowMapper);
    }
}
