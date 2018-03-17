package poo;

public class Robo {

    private int locx,locy;
    private int areax,areay;
    private String frente;



    public Robo(int locx, int locy, int areax, int areay, String frente) {
        this.locx = locx;
        this.locy = locy;
        this.areax = areax;
        this.areay = areay;
        this.frente = frente;

    }

    public Robo() {
        this.locx = 0;
        this.locy = 0;
        this.areax = 10;
        this.areay = 10;
        this.frente = "N";
        //this.localatual = locx+" "+locy+" "+frente;

    }

    public void Area(int x,int y){
        this.areay=y;
        this.areax=x;
    }

    public String MostraLoc(){
        return locx+" "+locy+" "+frente;
    }



    public String warnLimits(String s){
        String x="";
        if(s=="L.Exp") x =  "Voce esta no limite da Area de Exploracao!";
        if(s=="ErroMover") x = "Comando invalido de movimentacao!";
        return x;
    }

    public void mover(String S) {
        if (S == "M" || S == "E" || S == "D") {
            if (S == "M") {
                if (this.frente == "N") {
                    if (this.locy < this.areay) {
                        this.locy++;
                    } else {
                        System.out.println(warnLimits("L.Exp"));
                    }
                }
                if (this.frente == "S") {
                    if (this.locy > this.areay) {
                        this.locy--;
                    } else System.out.println(warnLimits("L.Exp"));
                }
                if (this.frente == "L") {
                    if (this.locx < this.areay) {
                        this.locx++;
                    } else System.out.println(warnLimits("L.Exp"));
                }
                if (this.frente == "O") {
                    if (this.locx > this.areay) {
                        this.locx--;
                    } else System.out.println(warnLimits("L.Exp"));
                }
            }
            if (S == "E") {
                if (this.frente == "N") {
                    this.frente = "O";
                }
                if (this.frente == "S") {
                    this.frente = "L";
                }
                if (this.frente == "O") {
                    this.frente = "S";
                }
                if (this.frente == "L") {
                    this.frente = "N";
                }

            }
            if (S == "D") {
                if (this.frente == "N") {
                    this.frente = "L";
                }
                if (this.frente == "S") {
                    this.frente = "O";
                }
                if (this.frente == "O") {
                    this.frente = "N";
                }
                if (this.frente == "L") {
                    this.frente = "S";
                }
            }

        }else{
            System.out.println(warnLimits("ErroMover"));
        }
    }


}
