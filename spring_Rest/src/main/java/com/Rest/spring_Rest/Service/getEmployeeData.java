package com.Rest.spring_Rest.Service;

import com.Rest.spring_Rest.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

interface getEmployee{
    List<Employee> getData();
    Employee getData(int id);
    List<Employee> addData(Employee employee);
    List<Employee> updateData(Employee employee);

    List<Employee> deleteEmployee(int employeeId);

}



@Service
public class getEmployeeData implements getEmployee{

    @Autowired
    getEmployeeDAO dao;
//    List<Employee> list;
    public getEmployeeData() {
//        list = new ArrayList<>();
//        list.add(new Employee(2,"Sankalp2","Intern2"));
//        list.add(new Employee(1,"Sankalp1","Intern1"));
//        list.add(new Employee(3,"Sankalp3","Intern3"));
    }

    @Override
    public List<Employee> getData() {
//        return list;
        return dao.findAll();
    }

    @Override
    public Employee getData(int id) {
//        for(Employee e: list){
//            if(e.getId()==id){
//                return e;
//            }
//        }
//        return null;
        return dao.getOne(id);
    }

    @Override
    public List<Employee> addData(Employee employee) {
//        list.add(employee);
//        return list;
        dao.save(employee);
        return dao.findAll();
    }

    @Override
    public List<Employee> updateData(Employee employee) {
//        for(Employee e: list){
//            if(e.getId()==employee.getId()){
//                e.setId(employee.getId());
//                e.setDepartment(employee.getDepartment());
//                e.setName(employee.getName());
//            }
//        }
//        return list;
         dao.save(employee);
         return dao.findAll();
    }

    @Override
    public List<Employee> deleteEmployee(int employeeId) {
//        for(int i=0; i<list.size(); i++){
//            if(list.get(i).getId()==employeeId){
//                list.remove(i);
//            }
//        }
//        return list;
        Employee e = dao.getOne(employeeId);
        dao.delete(e);
        return dao.findAll();
    }
}
