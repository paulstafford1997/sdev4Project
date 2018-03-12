package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

//Category to department
@Entity
public class Employee extends Model {
    @Id
    public Long id;
    
    @Constraints.Required
    public String name;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Project> projects;

    @ManyToOne()
    public Department department;

    @OneToOne(mappedBy="employee")
    private Address address;

    public Employee() {
    }

    public Employee(Long id, String name, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.projects = projects;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress(){
        return address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public static Finder<Long, Employee> find = new Finder<Long, Employee>(Employee.class);

    public static List<Employee> findAll() {
        return Employee.find.query().where().orderBy("name asc").findList();
    }

}