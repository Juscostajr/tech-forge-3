import controller.AntesDoJogoController;
import spark.Spark;

public class Main {
    public static void main(String[] args) {

        Spark.get("/:comando",new AntesDoJogoController());

    }
}
