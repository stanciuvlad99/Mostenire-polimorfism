package controllers;

import models.Avion;
import models.Barca;
import models.Masina;
import models.Vehicul;

import javax.print.attribute.standard.Fidelity;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlVehicul {
    private ArrayList<Vehicul> vehiculs;


    public ControlVehicul() {
        this.vehiculs = new ArrayList<>();
        load();

    }

    private void load() {
        try {
            File file = new File("C:\\mycode\\OOP\\mostenirea-polimorfism\\Initiere\\src\\data\\vehicule.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();

                switch (text.split("," + "")[0]) {

                    case "avion":
                        vehiculs.add(new Avion(text));
                        break;
                    case "barca":
                        vehiculs.add(new Barca(text));
                        break;
                    case "masina":
                        vehiculs.add(new Masina(text));
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String toSave(){
        if (vehiculs.size()==0){
            return "";
        }
        String text="";
        int i=0;
        for (i=0;i<vehiculs.size()-1; i++){
            text+=vehiculs.get(i).toSave()+"\n";
        }
        text+=vehiculs.get(i).toSave();
        return text;
    }

    public void save() {
        try {
            File file = new File("C:\\mycode\\OOP\\mostenirea-polimorfism\\Initiere\\src\\data\\vehicule.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(toSave());
            printWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void add(Vehicul vehicul){
        vehiculs.add(vehicul);
    }

    public void afisare(){
        for (int i=0; i<vehiculs.size();i++){

            System.out.println(vehiculs.get(i).descriere());
        }
    }
}
