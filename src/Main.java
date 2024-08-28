import model.Cena;
import repository.CenaDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Cena cena = CenaDAO.findCenaById(1);

            System.out.println(cena.toString());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}