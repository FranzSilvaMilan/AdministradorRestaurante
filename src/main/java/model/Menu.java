package model;

import java.util.HashMap;

public class Menu {
    public static final HashMap<Integer, Item> MAP_DISH = new HashMap<>();
    static {
        MAP_DISH.put(1, new Item("Pique", 20));
        MAP_DISH.put(2, new Item("Sillpancho", 12));
        MAP_DISH.put(3, new Item("Asado", 15));
        MAP_DISH.put(4, new Item("Pollo Broaster", 10));
        MAP_DISH.put(5, new Item("Lomo", 18));
        MAP_DISH.put(6, new Item("Milanesa", 15));
    }
    public static final HashMap<Integer, Item> MAP_DRINKS = new HashMap<>();
    static {
        MAP_DRINKS.put(1, new Item("Coca Cola", 10));
        MAP_DRINKS.put(2, new Item("Fanta", 10));
        MAP_DRINKS.put(3, new Item("Sprite", 10));
    }
}
