package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Register {

    //Instancia(cria) o player, baseado na classe dele
    Player player = new Player();

    //Instancia(cria) o inimigo, baseado na classe dele
    Enemy enemy = new Enemy();

    //Instancia(cria) teclado
    Scanner teclado = new Scanner(System.in);

    Output output = new Output();

    public void BothRegister(){

        PlayerRegister();
        EnemyRegister();

        output.PrintarAmbos();

    }
    public void PlayerRegister(){

        System.out.println("--------------------------------------");
        System.out.println("------------Cadastro Player-----------");
        System.out.print("Qual é o seu nome?");
        player.name = teclado.nextLine();
        System.out.println("Selecione sua Skin [Red - Blue - Green] : ");
        player.skin = teclado.nextLine();
        System.out.println("-----Player cadastrado com sucesso----");
        System.out.println("--------------------------------------");

        output.PrintarPlayer(player);

    }

    public void EnemyRegister(){

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("------------Cadastro Enemy------------");
        System.out.print("Qual é o seu nome?");
        enemy.name = teclado.nextLine();
        System.out.println("Selecione sua Skin [Red - Blue - Green] : ");
        enemy.skin = teclado.nextLine();
        System.out.println("-----Enemy cadastrado com sucesso-----");
        System.out.println("--------------------------------------");

        output.PrintarEnemy(enemy);

    }

    public void Decision(){

        String decision;

        System.out.println("---------------- Bem Vindo !!! -----------------");
        System.out.println("O que deseja cadastrar? (Player - Enemy - Ambos)");
        decision = teclado.nextLine();

        switch (decision){
            case "Player":
                PlayerRegister();
                break;

            case "Enemy":
                EnemyRegister();
                break;

            case "Ambos":
                BothRegister();
                break;

            default:
                System.out.println("Escolha uma opção válida!!");
                System.out.println();
                Decision();

        }

    }

}
