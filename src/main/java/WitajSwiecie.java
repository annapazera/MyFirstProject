import spark.Spark;

public class WitajSwiecie
{
	public static void main(String[] args) 
	{
	      Spark.staticFileLocation("/public");

		Spark.get("/Hello",(req, res) -> "<html><h1>Siema</h1>traaalalala</html>");
		System.out.println("Witaj Piêkny wiecie  !");
		System.out.println("Witaj ęą!");
	}
}
