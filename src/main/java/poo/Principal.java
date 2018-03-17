package poo;

public class Principal {
    public static void main(String[] args) {

        Robo r = new Robo();

        System.out.println(r.MostraLoc());
        r.mover("M");
        System.out.println(r.MostraLoc());

    }
}
