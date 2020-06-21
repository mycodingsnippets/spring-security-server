package com.dotcomengineer.employee.controllers;

import com.dotcomengineer.employee.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    @RequestMapping(value = "/user/getEmployeesList", produces = "application/json")
    @ResponseBody
    public List<Employee> getEmployeesList(){
        List<Employee> employees = new ArrayList<>();
        Employee emp = new Employee();
        emp.setEmpId("emp1");
        emp.setEmpName("emp1");
        employees.add(emp);
        return employees;
    }

    @RequestMapping(value="/getEmployees", method = RequestMethod.GET)
    public ModelAndView getEmployeeInfo(){
        return new ModelAndView("getEmployees");
    }
}
