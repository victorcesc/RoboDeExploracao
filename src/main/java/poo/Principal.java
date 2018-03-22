package poo;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Robo r;

        System.out.println("Bem vindo ao Robo Explorador");
        System.out.println("Digite qualquer tecla para Robo Padrao(Area 8, 1,2(x,y)) ou 1 - Criar seu proprio Robo");
        Scanner i = new Scanner(System.in);
        int x = i.nextInt();
        if (x == 1) {
            System.out.println("Digite a area de exploracao ");
            Scanner ax = new Scanner(System.in);
            int areax = ax.nextInt();

            System.out.println("Digite seu ponto x do robo");
            Scanner px = new Scanner(System.in);
            int pontox = px.nextInt();
            System.out.println("Digite seu ponto y do robo");
            Scanner py = new Scanner(System.in);
            int pontoy = py.nextInt();
            System.out.println("Digite a posicao frontal do robo ");
            Scanner f = new Scanner(System.in);
            String frente = f.next();
            r = new Robo(areax, areax, pontox, pontoy, frente);
            System.out.println(r.MostraLoc());
            System.out.println("Digite seu comando de movimentação: ");
            Scanner m = new Scanner(System.in);
            m.next();
            String mov = m.next();
            String s = mov;
            System.out.println(s);
            r.Movimentacao(s);
            System.out.println(r.MostraLoc());
        } else {
            r = new Robo();
            System.out.println("Digite seu comando de movimentação: ");
            Scanner s = new Scanner(System.in);
            String m = s.next();
            r.Movimentacao(m);
            System.out.println(r.MostraLoc());


        }




    }
}
