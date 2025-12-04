package com.PracticeSpring.SpringBractice.JSON.Domain;

import java.util.List;

public class Customer {
    private String name;
    private Address address;
    private List<Order> orderss;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Order> getOrderss() {
        return orderss;
    }

    public void setOrderss(List<Order> orderss) {
        this.orderss = orderss;
    }
}
