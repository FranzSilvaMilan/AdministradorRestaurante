package Controller;

import com.google.gson.Gson;
import database.Query;
import view.ConsoleRun;

import java.sql.SQLException;
import java.util.Map;

public class Controller {
    ConsoleRun consoleRun;

    public Controller() {
        consoleRun = new ConsoleRun();
        //actionDataBaseSave();
    }

    /**
     * @param criteria
     */
    public void createJson(Order order, String nameOrder) {
        Gson json = new Gson();
        String orderJson = json.toJson(order);
        System.out.println(orderJson);
        //Properties properties = json.fromJson(criteriaJSON, Properties.class);
        Query searchQuery = new Query();
        searchQuery.insertCriteria(orderJson, nameOrder);
    }


    /**
     * this method has the accion listeenr of the button.
//     */
//    private void dataBaseLoad() {
//        try {
//            Map<Integer, String> database = search.getJSONCriteriaUI();
//            database.forEach((id, nameCriteria) -> frame.getPanelMultimedia().
//                    addRowDB(new String[]{id.toString(), nameCriteria}));
//        } catch (SQLException e1) {
//            e1.printStackTrace();
//        }
//    }

    /**
     * this method has the accion listeenr of the button.
     */
//    private void actionDataBaseSave() {
//        buildCriteria();
//        String nameCriteria = frame.getPanelMultimedia().getTextCriteria();
//        search.createJson(criteria, nameCriteria);
//        dataBaseLoad();
//        System.out.println("Saved Criteria");
//    }
}
