package view;

import model.BranchOfficeCalama;
import model.BranchOfficeHeroinas;
import model.Item;
import model.Menu;
import Controller.Order;
import model.Restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleRun {

    Restaurant restaurant;
    Order order;
    ArrayList<Order> orderArrayList = new ArrayList<>();
    boolean continueOrder;

    public ConsoleRun() {
        continueOrder = true;
        startMenu();
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ArrayList<Order> getOrderArrayList() {
        return orderArrayList;
    }

    public void setOrderArrayList(ArrayList<Order> orderArrayList) {
        this.orderArrayList = orderArrayList;
    }

    public void startMenu() {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Ingrese Su nombre De Reserva");
            order = new Order(scanner.nextLine());
            System.out.println("------------ Branch Office ------------");
            System.out.println("Choose number of Branch Office");
            System.out.println("1  Branch Office Heroinas\n2  Branch Office Calama\n3  Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    if (restaurant == null) {
                        restaurant = new BranchOfficeHeroinas();
                    }
                    getOrderUI(scanner);
                    showOrder();
                    break;
                case 2:
                    if (restaurant == null) {
                        restaurant = new BranchOfficeCalama();
                    }
                    getOrderUI(scanner);
                    showOrder();
                    break;
                case 3:
                    return;

            }
        }
    }

    public void getOrderUI(Scanner scanner){
        restaurant.main();
        System.out.println("------------ SELECTS TABLE NUMER: ------------");
        System.out.println("Selecciona la fila:");
        int fila = scanner.nextInt();
        System.out.println("Selecciona la Columna:");
        int columna = scanner.nextInt();
        restaurant.escogerLugar(fila, columna);
        System.out.println("su mesa fue reservada!!!");
        System.out.println("*********************");
        restaurant.display();
        System.out.println("*********************");

        scanner = buildOrderSimple(scanner);

        System.out.println("------------ Add More Dishes?: ------------");
        System.out.println("1 yes  2 no");
        int answer = scanner.nextInt();
        continueOrder = answer == 1;
        while (continueOrder) {
            buildOrderAdvanced(scanner);
            System.out.println("------------ Add More Dishes?: ------------");
            System.out.println("1 yes 2 no");
            int answer1 = scanner.nextInt();
            continueOrder = answer1 == 1;
            if(continueOrder){
                return;
            }
            buildOrderAdvanced(scanner);

        }
        orderArrayList.add(order);
    }

    public Scanner buildOrderAdvanced(Scanner scanner) {
        int dish;
        int drink;
        System.out.println("------------ SELECTS NUMBER DISH: ------------");
        System.out.println("1-taquiña 2-paceña 3-hiari");
        System.out.println("4-vino tinto b 5-chanpane 6-corona");
        dish = scanner.nextInt();
        return scanner;
    }

    public Scanner buildOrderSimple(Scanner scanner) {
        int dish;
        int drink;
        System.out.println("------------ SELECTS NUMBER DISH: ------------");
        System.out.println("1-pique 2-silpancho 3-asado");
        System.out.println("4-pollo b 5-lomo 6-milanesa");
        dish = scanner.nextInt();
        System.out.println("Into quantity");
        int quantityDish = scanner.nextInt();
        Item itemOrder = Menu.MAP_DISH.get(dish);
        itemOrder.setQuantity(quantityDish);
        order.addOrder(itemOrder);
        System.out.println("------------ SELECTS number DRINKS: ------------");
        System.out.println("1-COCA 300ml 2-FANTA 300ml 3-SPRITE 300ml");
        drink = scanner.nextInt();
        System.out.println("Into quantity of drink selected");
        int quantityDrink = scanner.nextInt();
        Item itemOrderDrink = Menu.MAP_DRINKS.get(drink);
        itemOrderDrink.setQuantity(quantityDrink);
        order.addOrder(itemOrderDrink);
        return scanner;
    }

    public void showOrder() {
        for (Order order : orderArrayList) {
            System.out.print("|" + order.getName() + "| -> ");
            for (Item item : order.getOrderDishes()) {
                System.out.print(item.getName().concat(" ") + item.getQuantity() + " ");
            }
            System.out.println();
        }
    }
}
