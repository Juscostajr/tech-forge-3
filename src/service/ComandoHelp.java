package service;

public class ComandoHelp {
    public String executar(){
        return "O objetivo do text adventure é o usuário interagir com os objetos descritos na cena (identificados pelos nomes em letra maiúsculas) para avançar no jogo. Os comandos possíveis são:\n" +
                "HELP: exbibe o menu de ajuda do jogo\n" +
                "USE [ITEM]: interage com o item da cena\n" +
                "CHECK [ITEM]: mostra a descrição do objeto na cena\n" +
                "GET [ITEM]: Se possível, adiciona o item ao inventário\n" +
                "INVENTORY: mostra os itens que estão no inventário\n" +
                "USE [INVENTORY_ITEM] WITH [SCENE_ITEM]: Realiza a ação utilizando um item do inventário com um item da cena\n" +
                "SAVE: salva o jogo\n" +
                "LOAD: carrega um jogo salvo\n" +
                "RESTART: reinicia o jogo";
    }
}
