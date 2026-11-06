package com.jecrc.model;

public class Customer {

    private int cust_id;
    private String name;
    private String address;

    public Customer(int cust_id, String name, String address) {
        this.cust_id = cust_id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Customer ID: " + cust_id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}