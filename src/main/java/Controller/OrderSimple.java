package Controller;

import model.Client;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderSimple implements IBuilder{
    private HashMap<String, Integer> mapDishes;
    public OrderSimple(){
        mapDishes = new HashMap<>();
    }
    public void buildSimpleOrder(Client client, String dish, int quantityDish, String drink, int quantityDrinks){
//        order.setClient(client);
//        mapDishes.put(dish, quantityDish);
//        order.getOrderDishes().add(mapDishes);
    }


    public void buildAdvanzedOrder(String frameRare, String videoCode, String audioCode, String resolution, double duration, String operatorDurationTime, String unitTime, ArrayList<String> extensionVideo, String aspectRatio){

    }

    @Override
    public Order buildOrder() {
        //order.setPath("order simple");
        //return order;
        return null;
    }
}
