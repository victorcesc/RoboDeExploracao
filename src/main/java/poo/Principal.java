package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Robo r = new Robo(8,8,1,2,"N");

        System.out.println("Bem vindo ao Robo Explorador : \n");
        System.out.println("Digite seu comando de movimentação: ");
        Scanner s  = new Scanner(System.in);
        String movimentacao = "EMEMEMEMM";

        //System.out.println(movimentacao);

        r.Movimentacao(movimentacao);




        System.out.println(r.MostraLoc());
        //r.Mover("M");
       // r.Mover("M");
        //r.Mover("M");
       // System.out.println(r.MostraLoc());

    }
}
