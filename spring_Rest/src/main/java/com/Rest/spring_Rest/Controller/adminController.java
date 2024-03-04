package com.Rest.spring_Rest.Controller;

import com.Rest.spring_Rest.Employee;
import com.Rest.spring_Rest.Service.getEmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class adminController {
    @Autowired
    getEmployeeData g;

    @GetMapping("/message")
    public String getMessage(){
        return "hello I am from admin.";
    }

//    ye toh normal get method call kiya
    @GetMapping("/getEmployeeDetails")
    public List<Employee> getDetails(){
        return g.getData();
    }

//    get with specified value
    @GetMapping("/getEmployeeDetails/{employeeId}")
    public Employee getDetails(@PathVariable int employeeId){
        return g.getData(employeeId);
    }

//    Post api call
    @PostMapping("/addEmployee")
    public List<Employee> addDetails(@RequestBody Employee e){
        return g.addData(e);
    }

//  Put api call
    @PutMapping("/addEmployee")
    public List<Employee> updateDetails(@RequestBody Employee e){
        return g.updateData(e);
    }

    @DeleteMapping("/deleteEmployee/{employeeId}")
    public ResponseEntity<HttpStatus> deleteDetails(@PathVariable int employeeId){
        try {
            g.deleteEmployee(employeeId);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
//        return g.deleteEmployee(employeeId);
    }
}
