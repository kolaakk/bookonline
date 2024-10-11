package com.katabooks.bookonline.entity;

// import java.time.LocalDate;
import java.util.Date;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import javax.validation.constraints.NotNull;
// import javax.validation.constraints.*;

// import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Customer {


    @Id
    @GeneratedValue
    @Column(name="customer_id")
    private long customerId;
    

    @NotNull(message ="Name cannot be empty")
    private String name;

    @NotNull(message ="Email can not be empty")
    @Email(message ="Email not valid")
    @Column(unique = true)
    private String email;
    private Date dob;
    private String gender;



    public long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
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
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

}
