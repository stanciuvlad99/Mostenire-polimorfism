import controllers.ControlVehicul;
import models.Avion;
import models.Barca;
import models.Masina;
import models.Vehicul;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        ControlVehicul controlVehicul = new ControlVehicul();
        controlVehicul.add(new Avion( "qwerty",999,"qwerty", "qwerty",999));
        controlVehicul.add(new Barca( "qwerty", 999, "qwerty", 999,999));
        controlVehicul.add(new Masina( "qwerty", 999, "qwerty", 999, 999));
        controlVehicul.save();

//        controlVehicul.afisare();


    }
}