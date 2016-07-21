import spark.ModelAndView;

import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;


public class WitajSwiecie {
            public static void main(String[] args) {

                Spark.port(4567);

                Spark.staticFileLocation("/public");






                Spark.get("/obliczenia", (req, res) -> {
                    Map<String, Object> model = new HashMap<>();
                    String imie = req.queryParams("imie");
                    double liczba1 = Double.parseDouble(req.queryParams("liczba1"));
                    double liczba2= Double.parseDouble(req.queryParams("liczba2"));

                    String dzialanie = req.queryParams("dzialanie");
                    double wynik=0;
                    if (dzialanie.equals("dodawanie")){
                         wynik = kalkulator.dodawaj(liczba1, liczba2);

                    }
                    if (dzialanie.equals("odejmowanie")){
                        wynik = kalkulator.odejmuj(liczba1, liczba2);

                    }
                    if (dzialanie.equals("mnożenie")){
                        wynik = kalkulator.mnoz(liczba1, liczba2);

                    }
                    if (dzialanie.equals("dzielenie")){
                        wynik = kalkulator.dziel(liczba1, liczba2);

                    }
                    model.put("imie", imie);
                    model.put("liczba1", liczba1);
                    model.put("liczba2", liczba2);
                    model.put("wynik", wynik);
                    return new ModelAndView(model, "KalkulatorAni.ftl");
                }, new FreeMarkerEngine());




//        System.out.println(Imię + " podaj dwie dowolne liczby ");
//        double liczba1;
//        double liczba2;
//        Scanner input1 = new Scanner(System.in);
//        liczba1 = input1.nextDouble();
//        liczba2 = input1.nextDouble();
//        System.out.println(Imię + " twoje liczby to " + liczba1 + " i " + liczba2);
//
//        double wynik = kalkulator.dodawaj(liczba1, liczba2);
//        System.out.println("Suma Twoich liczb to " + wynik );
//        double wynik2 = kalkulator.odejmuj(liczba1, liczba2);
//        System.out.println ( "Wynik odejmowania Twoich liczb to " + wynik2);
//
//        double wynik3=kalkulator.mnoz(liczba1,liczba2);
//        System.out.println("Iloczyn Twoich liczb to " + wynik3 );
//
//        double wynik4=kalkulator.dziel(liczba1, liczba2);
//        System.out.println("Iloraz Twoich liczb to " + wynik4 );


//                    Map<String, Object> model = new HashMap<>();
//                    model.put("Imię", Imię);
//        model.put("Liczba1", liczba1);
//        model.put("Liczba2", liczba2);


//        Spark.get("/Hello", (req, res) -> "<html><h1>Siema</h1>traaalalala</html>");
//
//        Spark.get("/travel", (req, res) -> {
//            return dupa(req);
//        }, new FreeMarkerEngine());
//
//
//        Spark.get("/dupa", (req, res) -> {
//            System.out.println("dupa");
//            Map<String, Object> model = new HashMap<>();
//            model.put("warzywo", "ziemniak");
//            return new ModelAndView(model, "warzywa.ftl");
//        }, new FreeMarkerEngine());
//
//
//
//        Spark.get("/recipe", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            String name = req.queryParams("name");
//
//            if (name == null) {
//                name = "";
//            }
//            model.put("name", name);
//            return new ModelAndView(model, "RecipeBook.ftl");
//        }, new FreeMarkerEngine());
//
//        System.out.println("Witaj Piękny świecie  !");
//        System.out.println("Witaj ęą!");


//    private static ModelAndView dupa(Request req) {
//        String name = req.queryParams("name");
//
//        if (name == null) {
//            name = "";
//        }
//
//        String surname = req.queryParams("surname");
//        if (surname == null) {
//            surname = "";
//        }
//        if (("".equals(name)) && ("".equals(surname))) {
//            name = "stranger";
//        }
//
//        Map<String, Object> model = new HashMap<>();
//        model.put("name", name);
//        model.put("surname", surname);
//        model.put("jakis_atrybut", 123);
//        return new ModelAndView(model, "ani_stronka.ftl");}


        }}
