package poo;

public class Robo {

    private int locx,locy;
    private int areax,areay;
    private String frente;



    public Robo(int areax, int areay, int locx, int locy, String frente) {
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



    public String WarnLimits(String s){
        String x="";
        if(s=="L.Exp") x =  "Voce esta no limite da Area de Exploracao!";
        if(s=="ErroMover") x = "Comando invalido de movimentacao!";
        return x;
    }

    public void Mover(char S) {
        if (S == 'M' || S == 'E' || S == 'D') {
            if (S == 'M') {
                if (this.frente == "N") {
                    if (this.locy < this.areay) {
                        this.locy++;
                    } else {
                       System.out.println(WarnLimits("L.Exp"));
                    }
                }
                if (this.frente == "S") {
                    if (this.locy > 0) {
                        this.locy--;
                   } else System.out.println(WarnLimits("L.Exp"));
                }
                if (this.frente == "L") {
                    if (this.locx < this.areax) {
                        this.locx++;
                    } else System.out.println(WarnLimits("L.Exp"));
                }
                if (this.frente == "O") {
                    if (this.locx > 0) {
                        this.locx--;
                    } else System.out.println(WarnLimits("L.Exp"));
                }
            }
            if (S == 'E') {
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
            if (S == 'D') {
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
            System.out.println(WarnLimits("ErroMover"));
        }
    }

    public void Movimentacao(String m){
        int n;
        String M = m.toUpperCase();
        n = M.length();

        for(int i=0;i<n;i++){
            if((M.charAt(i) == 'M') || M.charAt(i) == 'E' || M.charAt(i) == 'D'){
                    char p = M.charAt(i);
                System.out.println(p);
                    Mover(p);
            }

        }

    }


}
