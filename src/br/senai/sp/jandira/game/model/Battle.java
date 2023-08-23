package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Battle {

    /**Criando String scenarioBattle para receber o que foi digitado*/
    String scenarioBattle;


    /**Instancia o SCENARIO*/
    Scenario scenario = new Scenario();


    /**Instancia o SCANNER*/
    Scanner teclado = new Scanner(System.in);

    public void choiceScenario(){
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Escolha uma cenário: ");
        System.out.println("[1- Arabia  2- Grécia  3- Los Angeles]");
        System.out.println("[4- Rio de Janeiro 5- Tóquio  6- Berlim]");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        /**Variável para receber a escolha de cenário do usuário*/
        int userScenario = teclado.nextInt();

        /**Guardando o método SCENARIO(que retorna STRING) e a decisão do usuário na variavel scenarioBattle */
        scenarioBattle = scenario.Scenario(userScenario);
        System.out.println(scenarioBattle);

    }

    public void Battle(Player player, Enemy enemy){
        System.out.println(player.name);
        System.out.println(enemy.name);
    }


}
