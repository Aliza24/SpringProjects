package com.jecrc.model;

import java.util.List;

public class Order {

    private Customer customer;
    private List<Cart> items;

    public Order(Customer customer, List<Cart> items) {
        this.customer = customer;
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Cart> getItems() {
        return items;
    }
}