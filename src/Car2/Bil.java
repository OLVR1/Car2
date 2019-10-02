package Car2;

public class Bil {
    private String maerke;
    private String nummerplade;
    private String farve;
    private static int taeller = 1;



    public Bil(String maerke, String nummerplade, String farve)
    {
        this.maerke = maerke;
        this.nummerplade = nummerplade;
        this.farve = farve;
    }

    public int getRegno() {
        return taeller++;}

    public int getNextregno(){
    return taeller;}



    public boolean alike(Bil b1) {
        return this.maerke == b1.maerke && this.farve == b1.farve;
    }
    public boolean equals(Bil b1) {
        return this.nummerplade == b1.nummerplade;
    }

    public String toString ()
    {  return ("Mærke: " + maerke + "\n" + "Nummerplade: " + nummerplade  +  "\n" + "Farve: " + farve);
    }


}
