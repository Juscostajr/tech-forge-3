package controller;

import com.google.gson.Gson;
import repository.CenaDAO;
import service.ComandoHelp;
import service.ComandoStart;
import spark.Request;
import spark.Response;
import spark.Route;

public class AntesDoJogoController implements Route {
    private static final Gson Gson = new Gson();

    @Override
    public Object handle(Request request, Response response) throws Exception {
        String comandoBruto = request.params(":comando");
        String[] comandos = comandoBruto.split(" ");


        if(comandos[0].equalsIgnoreCase("help")) {
            ComandoHelp comandoHelp = new ComandoHelp();
            return comandoHelp.executar();
        }

        if(comandos[0].equalsIgnoreCase("start")) {
            ComandoStart comandoStart = new ComandoStart();
            return Gson.toJson(comandoStart.executar());
        }


        return "O comando digitado foi: " + comandos[0] + " e o argumento " + comandos[1];
    }
}
