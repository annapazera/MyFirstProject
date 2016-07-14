import org.omg.CORBA.FREE_MEM;
import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

public class WitajSwiecie {
    public static void main(String[] args) {

        Spark.staticFileLocation("/public");

        Spark.get("/Hello", (req, res) -> "<html><h1>Siema</h1>traaalalala</html>");

        Spark.get("/travel", (req, res) -> {
            String name = req.queryParams("name");
            if (name == null || "".equals(name)) {
                name = "";
            }

            String surname = req.queryParams("surname");
            if (surname == null || "".equals(surname)) {
                surname = "";
            }
            Map<String, Object> model = new HashMap<>();
            model.put("name", name);
            model.put("surname", surname);
            return new ModelAndView(model,"ani_stronka.ftl" );
        }, new FreeMarkerEngine());

        Spark.post("/travel", (req, res) -> {
            String name = req.queryParams("name");
            if (name == null || "".equals(name)) {
                name = "";
            }
            String surname = req.queryParams("surname");
            if (surname == null || "".equals(surname)) {
                surname = "";
            }
            Map<String, Object> model = new HashMap<>();
            model.put("name", name);
            model.put("surname", surname);
            return new ModelAndView(model, "ani_stronka.ftl");
        }, new FreeMarkerEngine());

        System.out.println("Witaj Piękny świecie  !");
        System.out.println("Witaj ęą!");
        }
}