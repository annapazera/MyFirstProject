import org.omg.CORBA.FREE_MEM;
import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

public class WitajSwiecie {
    public static void main(String[] args) {

        Spark.staticFileLocation("/public");

        Spark.get("/Hello", (req, res) -> "<html><h1>Siema</h1>traaalalala</html>");

        Spark.get("/travel", (res, req) -> {
            return new ModelAndView(null,"ani_stronka.ftl" );
        }, new FreeMarkerEngine());

        System.out.println("Witaj Piękny świecie  !");
        System.out.println("Witaj ęą!");
    }
}
