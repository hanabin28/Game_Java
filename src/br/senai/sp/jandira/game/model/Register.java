package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Register {

    int avaliaAmbos = 0;

    //Instancia(cria) o player, baseado na classe dele
    Player player = new Player();

    //Instancia(cria) o inimigo, baseado na classe dele
    Enemy enemy = new Enemy();

    //Instancia(cria) teclado
    Scanner teclado = new Scanner(System.in);

    Output output = new Output();


    public void BothRegister(){
        avaliaAmbos = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintarPlayer(player);
        output.PrintarEnemy(enemy);

    }
    public Player PlayerRegister(){

        System.out.println("--------------------------------------");
        System.out.println("------------Cadastro Player-----------");
        System.out.print("Qual é o seu nome? ");
        player.name = teclado.next();
        System.out.print("Selecione sua Skin [Red - Blue - Green]: ");
        player.skin = teclado.next();
        System.out.println("-----Player cadastrado com sucesso----");
        System.out.println("--------------------------------------");

        if(avaliaAmbos != 1){
            output.PrintarPlayer(player);
        }
        return player;
    }


    public Enemy EnemyRegister(){

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("------------Cadastro Enemy------------");
        System.out.print("Qual é o seu nome? ");
        enemy.name = teclado.next();
        System.out.print("Selecione sua Skin [Red - Blue - Green]: ");
        enemy.skin = teclado.next();
        System.out.println("-----Enemy cadastrado com sucesso-----");
        System.out.println("--------------------------------------");


        if(avaliaAmbos != 1){
            output.PrintarEnemy(enemy);
        }
        return enemy;
    }


    public void Decision(){

        String decision;

        System.out.println("---------------- Bem Vindo !!! -----------------");
        System.out.println("O que deseja cadastrar? (Player - Enemy - Ambos)");
        decision = teclado.next();

        switch (decision.toLowerCase()){
            case "player":
                PlayerRegister();
                break;

            case "enemy":
                EnemyRegister();
                break;

            case "ambos":
                BothRegister();
                break;

        }

        System.out.println("Deseja continuar? [1-Sim 2-Não]: ");
        int continuar= teclado.nextInt();
        if(continuar==1){
            Decision();
        }


    }

}
