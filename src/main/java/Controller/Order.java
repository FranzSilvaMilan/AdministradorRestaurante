package Controller;


import model.Item;
import model.Restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * This class is a object that have a pedido for search.
 *
 * @author Franz Silva
 * @version 1.0.
 */
public class Order {

    ArrayList<Item> orderDishes;
    String name;
    Restaurant restaurant;

    public Order(String name) {
        this.name = name;
        orderDishes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public ArrayList<Item> getOrderDishes() {
        return orderDishes;
    }

    public void addOrder(Item item) {
        if (!orderDishes.contains(item)) this.orderDishes.add(item);
    }
}
