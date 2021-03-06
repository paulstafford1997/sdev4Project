package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Department extends Model{
    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Employee> employeeList = new ArrayList<>();

    public Department() {
    }

    public Department(Long id) {
        this.id = id;
    }


    public static final Finder<Long, Department> find = new Finder<>(Department.class);
    
    public static final List<Department> findAll() {
        return Department.find.all();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap();

        for (Department dep: Department.findAll()) {
            options.put(dep.getId().toString(), dep.getName());
        }
        
        return options;
    }

}