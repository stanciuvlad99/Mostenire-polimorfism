package models;

public class Barca extends Vehicul{

    private String model;
    private int marime;
    private int pret;

    public Barca( String culoare, int an,String model, int marime, int pret){
        super("barca",culoare,an);
        System.out.println("Constructor Barca");
        this.model=model;
        this.marime=marime;
        this.pret=pret;
        super.setType("Barca");
    }

    public Barca(String proprietati){
        super(proprietati);
        String []split=proprietati.split(",");
        this.model=split[3];
        this.marime=Integer.parseInt(split[4]);
        this.pret=Integer.parseInt(split[5]);
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public int getMarime(){
        return marime;
    }

    public void setMarime(int marime){
        this.marime=marime;
    }

    public int getPret(){
        return pret;
    }

    public void setPret(int pret){
        this.pret=pret;
    }

    public String descriere(){
        String text="";
        text+="\n";
        text+="tip vehicul "+super.getTipVehicul()+"\n";
        text+="culoare "+super.getCuloare()+"\n";
        text+="an "+super.getAn()+"\n";
        text+="model " + model + "\n";
        text+="marime " + marime + "\n";
        text+="pret " + pret + "\n";
        return text;
    }

    public String toSave(){
        return super.getTipVehicul()+","+super.getCuloare()+","+super.getAn()+","+model + "," + marime+ ","+ pret;
    }

}
