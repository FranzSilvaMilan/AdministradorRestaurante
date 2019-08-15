package Controller;

import com.google.gson.Gson;
import database.Query;
import view.ConsoleRun;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    ConsoleRun consoleRun;

    public Controller() {
        consoleRun = new ConsoleRun();
        actionDataBaseSave();
    }

    /**
     * @param nameOrder
     */
    public void createJson(Order order, String nameOrder) {
        Gson json = new Gson();
        String orderJson = json.toJson(order);
        System.out.println(orderJson);
        Query searchQuery = new Query();
        searchQuery.insertCriteria(orderJson, nameOrder);
        System.out.println(searchQuery.getAllCriteria());
    }


    /**
     * this method has the accion listeenr of the button.
//     */
    private void dataBaseLoad() {
        try {
            Map<Integer, String> database = getJSONCriteriaUI();
            database.forEach((id, nameCriteria) -> System.out.println(("id "+ id.toString() + " name " + nameCriteria)));
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * this method has the accion listeenr of the button.
     */
    private void actionDataBaseSave() {
        Order order = consoleRun.getOrder();
        System.out.println(order.getName()+ "*************************");
        String nameOrder = order.getName();
        createJson(order, nameOrder);
        dataBaseLoad();

        System.out.println("Saved Order");
    }

    /**
     * @return
     * @throws SQLException
     */
    public Map<Integer, String> getJSONCriteriaUI() throws SQLException {
        ResultSet set = new Query().getAllCriteria();
        Map<Integer, String> map = new HashMap<>();
        while (set.next()) {

            map.put(Integer.parseInt(set.getString("ID")), set.getString("nombrePedido"));
        }
        return map;
    }
}
