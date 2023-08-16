package br.senai.sp.jandira.game.model;

public class Output {
    public void PrintarPlayer(Player player){
        System.out.println("-----------------------------------");
        System.out.println("O nome do player é: " + player.name);
        System.out.println("A skin escolhida foi: " + player.skin);
        System.out.println("A vida do player é: " + player.GetLife());
        System.out.println("-----------------------------------");
    }

    public void PrintarEnemy(Enemy enemy){
        System.out.println("-----------------------------------");
        System.out.println("O nome do inimigo é: " + enemy.name);
        System.out.println("A skin escolhida foi: " + enemy.skin);
        System.out.println("A vida do inimigo é: " + enemy.GetLife());
        System.out.println("-----------------------------------");
    }

}
