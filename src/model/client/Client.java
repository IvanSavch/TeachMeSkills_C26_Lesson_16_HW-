package model.client;

import model.order.Order;

import java.util.Date;
import java.util.List;

public class Client {
    private Date registration;
    private String name;
    private int age;
    private String passportNumber;
    private List<Order> order;

    public Client(Date registration, String name, int age, List<Order> order) {
        this.registration = registration;
        this.name = name;
        this.age = age;
        this.order = order;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Client{" +
                "registration=" + registration +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", order=" + order +
                '}';
    }
}
