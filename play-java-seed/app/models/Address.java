package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Address extends Model{
    @Id
    private Long id;

    @Constraints.Required
    private int houseNum;

    @Constraints.Required
    private String street;


    @Constraints.Required
    private String town;

    @Constraints.Required
    private String province;

    private String city;

    @Constraints.Required
    private String postcode;

    @OneToOne()
    @JoinColumn(name = "id")
    private Employee employee;

    public Address() {
    }

    public Address(Long id, int houseNum, String street, String town, String province, String postcode) {
        this.id = id;
        this.houseNum = houseNum;
        this.street = street;
        this.town = town;
        this.province = province;
        this.postcode = postcode;
    }


    public static final Finder<Long, Address> find = new Finder<>(Address.class);
    
    public static final List<Address> findAll() {
        return Address.find.all();
    }

    public Long getId() {
        return this.id;
    }

    public Employee getEmployee(){
        return employee;
    }

    public int getHouseNum(){
        return houseNum;
    }

    public void setHouseNum(int houseNum){
        this.houseNum = houseNum;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getTown(){
        return town;
    }

    public void setTown(){
        this.town = town;
    }

    public String getProvince(){
        return province;
    }

    public void setProvince(String province){
        this.province = province;
    }

    public String getPostcode(){
        return postcode;
    }

    public void setPostcode(String postcode){
        this.postcode = postcode;
    }
}