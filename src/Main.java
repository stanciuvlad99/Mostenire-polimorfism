import models.Masina;

public class Main {
    public static void main(String[] args) {

        Masina masina = new Masina("Ford", "albastru", 2016, "Mondeo", 200,
                2000);
        System.out.println(masina.descriere());
    }
}