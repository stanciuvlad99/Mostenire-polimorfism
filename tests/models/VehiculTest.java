package models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VehiculTest {



    @Test
    void exempluImplicatie4(){
        //todo:doua barci
        Barca barca = new Barca("portocaliu", 2022, "Explorer Pro", 3, 140);
        Barca barca1 = new Barca( "albastru", 2022, "Chalenger 2",3,240);
        Barca barca2 = new Barca("test", 2012,"test", 4, 400);

        Avion avion = new Avion("AirBus", 200,"TestMarca","Verde",
                2000);
        Avion avion1 = new Avion("Taromo",150,"TestMarca2","Albastru",
                2005);
        Avion avion2 = new Avion("Embrarer",170, "TestMarca3",
                "Rosu",2002);
        Masina masina = new Masina( "negru", 2020, "A8", 300,
                3000);
        Masina masina1 = new Masina( "rosu", 2007, "Logan", 400,
                2000);

        Vehicul vehicul=barca1;//

        vehicul=avion1;

        vehicul=masina1;

//        System.out.println(vehicul.decriereVehicul());


        ArrayList<Vehicul> vehiculs = new ArrayList<>();
        vehiculs.add(barca);
        vehiculs.add(barca1);
        vehiculs.add(barca2);
        vehiculs.add(avion);
        vehiculs.add(avion1);
        vehiculs.add(avion2);
        vehiculs.add(masina);
        vehiculs.add(masina1);

//        for (int i=0; i<vehiculs.size(); i++){
//
//            if(vehiculs.get(i) instanceof  Barca){
//
//                //coneversie de la vehicul la barca
//
//                Barca b= (Barca) vehiculs.get(i);
//
//                System.out.println(b.descriereBarca());
//            }
//        }
//
//        for (int i=0; i<vehiculs.size(); i++){
//            if (vehiculs.get(i) instanceof Masina){
//                Masina m=(Masina) vehiculs.get(i);
//                System.out.println(m.descriereMasina());
//            }
//        }
//
//        for (int i=0; i<vehiculs.size(); i++){
//            if (vehiculs.get(i) instanceof Avion){
//                Avion a=(Avion) vehiculs.get(i);
//                System.out.println(a.descriereAvion());
//            }
//        }

        Vehicul vehicul1=avion1;//avem o referinta de tip vehicul de ce retine  adresa unui obiect de tip avion


        vehicul1=masina1;
        System.out.println(vehicul1.descriere());

    }

}