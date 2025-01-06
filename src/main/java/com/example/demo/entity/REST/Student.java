package com.example.demo.entity.REST;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

    // private fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Correct annotation for JPA
    private int rollNo;

    @Column(name="st_name")
    private String name;

    @Column(name="st_email")
    private String email;

    @Column(name="st_phoneNuber")
    private Long phoneNuber;

    @Column(name="st_branch")
    private String branch;

    @Column(name="st_percentage")
    private float percentage;

    // default constructor
    public Student() {}

    // parameterized constructor
    public Student(String branch, String email, String name, float percentage, Long phoneNuber) {
        this.branch = branch;
        this.email = email;
        this.name = name;
        this.percentage = percentage;
        this.phoneNuber = phoneNuber;
    }

    // getters and setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNuber() {
        return phoneNuber;
    }

    public void setPhoneNuber(Long phoneNuber) {
        this.phoneNuber = phoneNuber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", phoneNuber=").append(phoneNuber);
        sb.append(", branch=").append(branch);
        sb.append(", percentage=").append(percentage);
        sb.append('}');
        return sb.toString();
    }
}
