package fr.web3lance.com.bigdata.model;

import java.io.Serializable;

/**
 * Created by Faliherizo on 09/02/2017.
 */
public class Person implements Serializable {
    private String lastname;
    private String firstname;
    private String email;
    private String address;
    private String PostalCode;
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }



}
