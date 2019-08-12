import Controller.Controller;
import database.ConnectionDataBase;

public class Main {
    public static void main(String[] args) {
        ConnectionDataBase.getInstance();
        //OrderSimple order = new OrderSimple();

        //Order order1 = order.buildOrder();
        //System.out.println(order1.getPath());
        //order1 = new OrderBuilder().buildOrder();
        //System.out.println(order1.getFileName());
        new Controller();
    }
}
