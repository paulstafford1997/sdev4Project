package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

//Product to Employee
@Entity
public class Project extends Model {
    
    // Properties
    @Id
    public Long id;
    @Constraints.Required
    public String name;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "projects")
    public List<Employee> employees; 

    public static final Finder<Long, Project> find = new Finder<>(Project.class);
    

    public static final List<Project> findAll() {            
        return Project.find.all();
    }
    // Default Constructor
    public Project() {
    }
    
    // Constructor to initialise object
    public Project(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Accessor methods
    public Long getId() {
        return id;
    }

    public List<Employee> getEmployee(){
        return employees;
    }

    public void setEmployee(Employee e){
        employees.add(e);
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        
}
    