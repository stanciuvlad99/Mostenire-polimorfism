package models;

public class Masina extends Vehicul {


    private String model;
    private int caiPutere;
    private int capacitateCilndrica;

    public Masina(String marca, String culoare, int an, String model, int caiPutere, int capacitateCilindrica) {
        super(marca,culoare,an);
        System.out.println("Eu sunt constructorul cu toti paramaetrii ai lui masina");
        this.model = model;
        this.caiPutere = caiPutere;
        this.capacitateCilndrica = capacitateCilindrica;

//        super.setAn(an);
//        super.setMarca(marca);
//        super.setCuloare(culoare);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }

    public int getCaiPutere() {
        return caiPutere;
    }

    public void setCapacitateCilndrica(int capacitateCilndrica) {
        this.capacitateCilndrica = capacitateCilndrica;
    }

    public int getCapacitateCilndrica() {
        return capacitateCilndrica;
    }

    public String descriere() {

        String text = "";

        text += super.decriere() + "\n";

        text += "model " + model + "\n";
        text += "cai putere " + caiPutere + "\n";
        text += "capacitate cilindrica " + capacitateCilndrica + "\n";
        text += "marca " + super.getMarca() + "\n";
        text += "culoare " + super.getCuloare() + "\n";
        text += "an " + super.getAn();
        return text;
    }


}
