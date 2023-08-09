package br.senai.sp.jandira.game.model;

public class Output {
    public void PrintarPlayer(Player player){
        System.out.println("-----------------------------------");
        System.out.println("O nome do player é: " + player.name);
        System.out.println("A skin escolhida foi: " + player.skin);
    }

    public void PrintarEnemy(Enemy enemy){
        System.out.println("-----------------------------------");
        System.out.println("O nome do player é: " + enemy.name);
        System.out.println("A skin escolhida foi: " + enemy.skin);
    }

}
