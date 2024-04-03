import java.util.Random;

public class Homework3 {

    public static void main(String[] args) {
        int donatiiFinale = 1000;
        donatiiSuma(donatiiFinale);
    }

    public static void donatiiSuma(int target) {
        Random random = new Random();
        int sumaTotala = 0;
        int numarDonatii = 0;

        while (sumaTotala < target) {
            int donatie = random.nextInt(100);
            sumaTotala += donatie;
            numarDonatii++;

            System.out.println("Donatie: " + donatie + " euro");
        }

        System.out.println("Suma dorita de 1000 de euro a fost atinsa. Multumim!");
    }
}