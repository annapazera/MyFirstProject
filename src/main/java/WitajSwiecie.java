import spark.Spark;

public class WitajSwiecie
{
	public static void main(String[] args) 
	{
	
		Spark.get("/Hello",(req, res) -> "Siema");
		System.out.println("Witaj Piêkny wiecie  !");
		System.out.println("Witaj ęą!");
	}
}
