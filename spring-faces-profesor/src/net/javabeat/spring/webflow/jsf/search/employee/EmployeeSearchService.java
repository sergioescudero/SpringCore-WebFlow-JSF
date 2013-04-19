package net.javabeat.spring.webflow.jsf.search.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeSearchService {

    private static List<Employee> allEmployees;
    
    public List<Employee> findEmployees(EmployeeCriteria criteria){

        List<Employee> searchedEmployees = new ArrayList<Employee>();
        if (criteria == null){
            return allEmployees;
        }

        String searchEmpName = criteria.getEmpName();
        if (searchEmpName != null && searchEmpName.trim().length() > 0){
            
            for (Employee anEmployee : allEmployees){

                if (anEmployee.getName().contains(searchEmpName)){
                    searchedEmployees.add(anEmployee);
                }
            }
            return searchedEmployees;
        }else{
            return allEmployees;
        }
    }

    static{

        allEmployees = new ArrayList<Employee>();
        allEmployees.add(employee("10000", "Steve Clark", new Date(1960, 6, 12), "Employee"));
        allEmployees.add(employee("10000", "Alfred Ray", new Date(1954, 4, 17), "Manager"));
        allEmployees.add(employee("10000", "Robert Woulsh", new Date(1944, 2, 16), "Director"));
    }

    static Employee employee(String id, String name, Date dob, String designation){

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setDob(dob);
        employee.setDesignation(designation);
        return employee;
    }
}
