import com.google.gson.Gson;
import model.Cena;
import model.Save;
import repository.CenaDAO;
import repository.SaveDAO;
import spark.Spark;

public class Main {
    private static final Gson Gson = new Gson();
    public static void main(String[] args) {
        try {
            Save save = SaveDAO.novoJogo();
            String saveJson = Gson.toJson(save);
            Spark.get("/", (req,res) -> saveJson);

            Spark.get("/cena/:id", (req,res) -> {
                Integer cenaId = Integer.parseInt(req.params(":id"));
                Cena cena = CenaDAO.findCenaById(cenaId);
                return Gson.toJson(cena);
            });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}