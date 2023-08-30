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

    }

    public void Battle(Player player, Enemy enemy) {

        while (true) {


            int lifePlayer = player.GetLife();
            int lifeEnemy = enemy.GetLife();

            if (lifePlayer == 0) {
                System.out.println("O vencedor é o Enemy " + enemy.name + "!!!");
                break;
            }else if (lifeEnemy == 0) {
                System.out.println("O vencedor é o Player " + player.name + "!!!");
                break;
            }

            System.out.println("----------   Battle   ----------");
            System.out.println("Ataque Player [R] - " + player.name + "- Life player: " + lifePlayer);
            System.out.println("Ataque Enemy [Q] - " + enemy.name + "- Life enemy: " + lifeEnemy);
            System.out.println("Defesa (Player e Enemy) [1 - 5]");
            System.out.println("--------------------------------");

            String ataque = teclado.next();

            ////
            if (ataque.equalsIgnoreCase("R")) {
                System.out.println("-------------------------");
                System.out.println("--   O Player atacou   --");
                System.out.println("-------------------------");

                int danoPlayer = (int) (Math.random() * 20) + 1;

                System.out.println("-------------------------");
                System.out.println("-- O ataque foi de: " + danoPlayer + " --");
                System.out.println("-------------------------");


                System.out.println("Digite um número para defesa [1 -5]: ");

                int defesaNumero = teclado.nextInt();

                int defesa = (int) (Math.random()*5)+1;

                System.out.println("-------------------------");
                System.out.println("--   O Enemy defendeu  --");
                System.out.println("-------------------------");
                System.out.println("O número gerado foi: " + defesa);

                int defesaEnemy = (int) (Math.random() * 20) + 1;

                System.out.println("-------------------------");
                System.out.println("-- A defesa foi de: " + defesaEnemy + " --");
                System.out.println("-------------------------");

                int danoReal = danoPlayer - defesaEnemy;

                if (defesaNumero == defesa){
                    danoReal = danoPlayer - defesaEnemy;
                }else{
                    danoReal = danoPlayer;
                }

                if (danoReal<0){
                    danoReal=0;
                }

                enemy.SubtrairVida(danoReal);

                ////
            } else if (ataque.equalsIgnoreCase("Q")) {
                ////
                System.out.println("-------------------------");
                System.out.println("--    O Enemy atacou   --");
                System.out.println("-------------------------");

                int danoEnemy = (int) (Math.random() * 20) + 1;

                System.out.println("-------------------------");
                System.out.println("-- O ataque foi de: " + danoEnemy + " --");
                System.out.println("-------------------------");

                System.out.println("Digite um número para defesa [1 -5]: ");
                int defesaNumero = teclado.nextInt();

                int defesa = (int) (Math.random() * 5) + 1;


                System.out.println("-------------------------");
                System.out.println("--  O Player defendeu  --");
                System.out.println("-------------------------");
                System.out.println("O número gerado foi: " + defesa);

                int defesaPlayer = (int) (Math.random() * 20) + 1;

                System.out.println("-------------------------");
                System.out.println("-- A defesa foi de: " + defesaPlayer + " --");
                System.out.println("-------------------------");

                int danoReal = danoEnemy - defesaPlayer;

                if (defesaNumero == defesa){
                    danoReal = danoEnemy - defesaPlayer;
                }else{
                    danoReal = danoEnemy;
                }

                if (danoReal<0){
                    danoReal=0;
                }


                player.SubtrairVida(danoReal);


                ////
            } else {
                System.out.println("Tecla inválida!!");
            }
        }
    }


}
