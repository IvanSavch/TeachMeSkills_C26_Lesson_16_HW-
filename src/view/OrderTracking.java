package view;

import model.client.Client;

import java.util.Iterator;
import java.util.Map;

public class OrderTracking {
    public static void showOrder(Map<String, Client> order) {
        System.out.println("show show order(1)");
        for (Map.Entry<String, Client> entry : order.entrySet()) {
            System.out.println(entry);
        }
    }
    public static void showOrder2(Map<String, Client> order) {
        System.out.println("show order (2)");
        Iterator<Map.Entry<String,Client>> iterator = order.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Client> entry = iterator.next();
            System.out.println(entry);
        }
    }
    public static void showOrderKey(Map<String, Client> order) {
        System.out.println("show key");
        System.out.println(order.keySet());
    }
    public static void showOrderValue(Map<String, Client> order) {
        System.out.println("show value");
        for (Client client : order.values()) {
            System.out.println(client);
        }
    }
}
