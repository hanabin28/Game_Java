package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Menu {

    String osDois;

    /**Instancia o SCANNER*/
    Scanner teclado = new Scanner(System.in);


    /**Instanciar o método REGISTER*/
    Register register = new Register();

    /**Instancia BATTLE*/
    Battle battle = new Battle();

    public void Menu(){

        boolean continuar = true;

        while (continuar) {
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("------    Bem Vindo    ------");
            System.out.println("Escolha uma opção: ");
            System.out.println("[1- Register  2- Battle  3-Exit]");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            int userOption = teclado.nextInt();

            switch (userOption){
                case 1:
                    register.Decision();
                    break;

                case 2:
                    battle.choiceScenario();
                    battle.Battle(register.player, register.enemy);
                    break;

                case 3:
                    continuar = false;
                    break;
            }
        }


    }
}
