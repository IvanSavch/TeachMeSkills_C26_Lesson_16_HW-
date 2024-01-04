package util;

import constant.Const;
import model.client.Client;
import model.order.Order;

import java.util.*;

public class Util {
    public static Map<String,Client> createOrderClients() {
        Order order = new Order(20,"bread");
        Order order2 = new Order(30,"egg");
        Order order3 = new Order(5,"milk");
        Order order4 = new Order(50,"oil");
        Order order5 = new Order(40,"beer");
        Order order6 = new Order(10,"water");
        Order order7 = new Order(15,"pepsi");

        List<Order> orders1 = new ArrayList<>();
        Collections.addAll(orders1,order,order2,order3);
        List<Order> orders2 = new ArrayList<>();
        Collections.addAll(orders2,order4,order5);
        List<Order> orders3 = new ArrayList<>();
        Collections.addAll(orders3,order6,order7);

        Client ivan = new Client(new Date(),"Ivan",20,orders1);
        Client anton = new Client(new Date(),"Anton",300,orders2);
        Client igor = new Client(new Date(),"Igor",29,orders3);

        Map<String,Client> clientOrder = new HashMap<>();
        clientOrder.put(Const.passportNumberIvan,ivan);
        clientOrder.put(Const.passportNumberAnton,anton);
        clientOrder.put(Const.passportNumberIgor,igor);

        return clientOrder;
    }
}
