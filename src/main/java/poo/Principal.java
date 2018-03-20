package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //Robo r = new Robo(8,8,1,2,"N");

        System.out.println("Bem vindo ao Robo Explorador");

            Robo r = new Robo(10,10,1,2,"N");

            r.Movimentacao("EMEMEMEMM");
            System.out.println(r.MostraLoc());



            Robo R = new Robo();
            System.out.println("Digite seu comando de movimentação: ");
            Scanner s  = new Scanner(System.in);
            String m = s.next();
            R.Movimentacao(m);
            System.out.println(R.MostraLoc());










    }
}
