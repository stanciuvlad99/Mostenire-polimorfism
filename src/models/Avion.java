package models;

public class Avion extends Vehicul{

    private String firma;
    private int locuri;
    private String locatie;

    public Avion(String firma, int locuri, String localitate,String marca, String culoare, int an) {
        super(marca,culoare,an);
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
        text += "firma" + firma + "\n";
        text += "locuri" + locuri + "\n";
        text += "locatie" + locatie + "\n";
        return text;
    }


}
