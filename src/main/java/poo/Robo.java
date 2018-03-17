package poo;

public class Robo {

    private int locx,locy;
    public int areax,areay;
    private String frente;
    private String locatual;


    public Robo(int locx, int locy, int areax, int areay, String frente, String locatual) {
        this.locx = locx;
        this.locy = locy;
        this.areax = areax;
        this.areay = areay;
        this.frente = frente;
        this.locatual = locatual;
    }

    public Robo() {
        this.locx = 0;
        this.locy = 0;
        this.areax = 10;
        this.areay = 10;
        this.frente = "N";
        this.locatual = locx+" "+locy+" "+"N";

    }


    public String mover(String S){
        if(S == "M"){
            if(this.frente == "N"){
                if(this.locy<this.areay) {
                    this.locy++;
                }else{
                    return "Voce esta no limite da Area de Exploracao!";
                }
            }
            if(this.frente=="S"){
                if(this.locy>this.areay) {
                    this.locy--;
                }else return "Voce esta no limite da Area de Exploracao!";
            }
            if(this.frente=="L"){
                if(this.locx<this.areay) {
                    this.locx++;
                }else return "Voce esta no limite da Area de Exploracao!";
            }
            if(this.frente=="O"){
                if(this.locx>this.areay) {
                    this.locx--;
                }else return "Voce esta no limite da Area de Exploracao!"
            }
        }
        if(S=="E"){
            if(this.frente=="N"){
                this.frente = "O";
            }
        }

    }




}
