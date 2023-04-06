package models;

public class Vehicul {

    private String marca;
    private String culoare;
    private int an;


//    public Vehicul() {
//        System.out.println("Eu sunt constructorlul gol");
//    }


    public Vehicul(String marca, String culoare, int an) {
        System.out.println("Eu sunt constructorul cu 3 parametri");
        this.marca = marca;
        this.culoare = culoare;
        this.an = an;
    }

    //todo:un contructor cu 1 parametru si unul cu 2
    public Vehicul(String marca){
        System.out.println("Eu sunt constructorul cu un parametru");
        this.marca=marca;
    }

    public Vehicul(String culoare, int an){
        System.out.println("Eu sunt constuctorul cu 2 parametri");
        this.culoare=culoare;
        this.an=an;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
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

    public String decriere() {
        String descriere = "Marcam masinii este " + marca + ", culoarea este " + culoare +
                ", iar anul de fabricare este " + an;
        return descriere;
    }
}
