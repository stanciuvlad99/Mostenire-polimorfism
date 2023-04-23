package models;

public class Masina extends Vehicul {


    private String model;
    private int caiPutere;
    private int capacitateCilndrica;

    public Masina(String culoare, int an, String model, int caiPutere, int capacitateCilindrica) {
        super("masina",culoare,an);
        System.out.println("Eu sunt constructorul cu toti paramaetrii ai lui masina");
        this.model = model;
        this.caiPutere = caiPutere;
        this.capacitateCilndrica = capacitateCilindrica;

//        super.setAn(an);
//        super.setMarca(marca);
//        super.setCuloare(culoare);
    }

    public Masina(String proprietati){
        super(proprietati);
        String []split=proprietati.split(",");
        this.model=split[3];
        this.caiPutere=Integer.parseInt(split[4]);
        this.capacitateCilndrica=Integer.parseInt(split[5]);
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


    @Override
    public String descriere() {

        String text = "";

        text += "\n";

        text += "tip vehicul " + super.getTipVehicul() + "\n";
        text += "culoare " + super.getCuloare() + "\n";
        text += "an " + super.getAn()+"\n";
        text += "model " + model + "\n";
        text += "cai putere " + caiPutere + "\n";
        text += "capacitate cilindrica " + capacitateCilndrica + "\n";

        return text;
    }

    public String toSave(){
        return super.getTipVehicul()+","+super.getCuloare()+","+super.getAn()+","+model + ","+caiPutere+","
                +capacitateCilndrica;
    }


}
