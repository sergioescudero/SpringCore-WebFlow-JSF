package net.javabeat.spring.webflow.jsf.search.employee;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{

    private String id;
    private String name;
    private Date dob;
    private String designation;

    public String getDesignation() {
        return designation;
    } 

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
