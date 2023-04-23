package models;

public class Avion extends Vehicul{

    private String firma;
    private int locuri;
    private String locatie;

    public Avion(String firma, int locuri, String localitate, String culoare, int an) {
        super("avion",culoare,an);
        this.firma = firma;
        this.locuri = locuri;
        this.locatie = localitate;

    }

    public Avion(String firma, int locuri,String culoare, int an) {
        super(culoare, an);
        this.firma = firma;
        this.locuri = locuri;
    }

    public Avion(String locatie, String marca) {
        super(marca);
        this.locatie = locatie;
    }

    public Avion(String proprietati){
        super(proprietati);
        String []split=proprietati.split(",");
        this.firma=split[3];
        this.locuri=Integer.parseInt(split[4]);
        this.locatie=split[5];
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    public void setLocuri(int locuri) {
        this.locuri = locuri;
    }

    public int getLocuri() {
        return locuri;
    }

    public void setLocatie(String localitate) {
        this.locatie = localitate;
    }

    public String getLocatie() {
        return locatie;
    }


    public String descriere() {
        String text = "";
        text+="\n";
        text+="tip vehicul "+super.getTipVehicul()+"\n";
        text+="culoare "+super.getCuloare()+"\n";
        text+="an "+super.getAn()+"\n";
        text += "firma " + firma + "\n";
        text += "locuri " + locuri + "\n";
        text += "locatie " + locatie;
        return text;
    }

    public String toSave(){
        return super.getTipVehicul()+","+super.getCuloare()+","+super.getAn()+","+firma+","+locuri+","+locatie;
    }


}