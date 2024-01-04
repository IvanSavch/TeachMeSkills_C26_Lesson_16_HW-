package controller;

import util.Util;
import view.OrderTracking;

public class Controller {
    public static void start() {
        OrderTracking.showOrder(Util.createOrderClients());
        OrderTracking.showOrder2(Util.createOrderClients());
        OrderTracking.showOrderKey(Util.createOrderClients());
        OrderTracking.showOrderValue(Util.createOrderClients());
    }
}
