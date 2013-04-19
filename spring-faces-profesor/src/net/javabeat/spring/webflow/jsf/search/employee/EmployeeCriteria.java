package net.javabeat.spring.webflow.jsf.search.employee;

import java.io.Serializable;

public class EmployeeCriteria implements Serializable{

    private static final long serialVersionUID = 1L;
    private String empName;

    public String getEmpName() {
        return empName;
    } 

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
}
