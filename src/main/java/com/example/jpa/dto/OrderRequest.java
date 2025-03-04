package com.example.jpa.dto;

import com.example.jpa.entity.Customer;
public class OrderRequest {

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderRequest(Customer customer) {
        this.customer = customer;
    }
    public OrderRequest(){

    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                '}';
    }
}
