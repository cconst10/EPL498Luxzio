package com.example.epl498luxzio;

import java.util.Date;

public class User {
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String phone_number;
    private String street_address;
    private String city;
    private String country;
    private String zip_postal_code;
    private String email_address;
    private String password;
    private String confirm_password;

    public User(String first_name,
                String last_name,
                String date_of_birth,
                String phone_number,
                String street_address,
                String city,
                String country,
                String zip_postal_code,
                String email_address,
                String password,
                String confirm_password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
        this.street_address = street_address;
        this.city = city;
        this.country = country;
        this.zip_postal_code = zip_postal_code;
        this.email_address = email_address;
        this.password = password;
        this.confirm_password = confirm_password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip_postal_code() {
        return zip_postal_code;
    }

    public void setZip_postal_code(String zip_postal_code) {
        this.zip_postal_code = zip_postal_code;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }
}