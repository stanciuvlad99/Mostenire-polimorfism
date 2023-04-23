package models;

public class Vehicul {

    private String tipVehicul;
    private String culoare;
    private int an;

    private String type;


//    public Vehicul() {
//        System.out.println("Eu sunt constructorlul gol");
//    }


    public Vehicul(String tipVehicul, String culoare, int an) {
//        System.out.println("Eu sunt constructorul cu 3 parametri");
        this.tipVehicul = tipVehicul;
        this.culoare = culoare;
        this.an = an;
    }

    public Vehicul(String proprietati) {
        String []splt=proprietati.split(",");
        this.tipVehicul =splt[0];
        this.culoare=splt[1];
        this.an=Integer.parseInt(splt[2]);

    }

    public Vehicul(String culoare, int an){
        System.out.println("Eu sunt constuctorul cu 2 parametri");
        this.culoare=culoare;
        this.an=an;
    }

    public void setTipVehicul(String tipVehicul) {
        this.tipVehicul = tipVehicul;
    }

    public String getTipVehicul() {
        return tipVehicul;
    }


    public void setType(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public int getAn() {
        return an;
    }
    //descriere


    public String descriere() {
        String descriere="";
        descriere+="tip vehicul " + tipVehicul + "\n";
        descriere+="culoare " + culoare + "\n";
        descriere+="an " + an + "\n";
        return descriere;
    }
    public String toSave(){
        return tipVehicul + "," + culoare + ","+ an;
    }



}
