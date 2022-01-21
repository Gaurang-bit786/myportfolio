package com.crud.crud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_TABLE")
public class StudentEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name="Name")
    private String name;
    @Column(name="Class")
    private String clas;
    @Column(name="Address")
    private String address;
    @Column(name="Image")
    private String image;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getClas() {
        return clas;
    }
    public void setClas(String clas) {
        this.clas = clas;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    public StudentEntities(int id, String name,String clas, String address,String image){
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.address = address;
        this.image = image;
    }

    public StudentEntities(){
        super();
    }
}
