package model.order;

import java.util.List;
import java.util.Map;

public class Order {
   private int price;
   private String name;

    public Order(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "price=" + price +
                ", name='" + name + '\'';
    }
}
