public class Homework2 {
    public static void main(String[] args) {
        int[] numere = new int [] {1, 44, 303, 400, 2344, 4532, 129292, 1000000, 2000000, 10000000};
        int numarIntreg = 4000;
        int[] rezultat = numereMaiMari(numere, numarIntreg);

        System.out.print("Numerele mai mari decat " + numarIntreg + " sunt: ");
        for (int numar : rezultat) {
            System.out.print(numar + " ");
        }
    }

    public static int[] numereMaiMari(int[] numere, int numarIntreg) {
        int count = 0;

        for (int numar : numere) {
            if (numar > numarIntreg) {
                count++;
            }
        }

        int[] rezultat = new int[count];
        int index = 0;

        for (int numar : numere) {
            if (numar > numarIntreg) {
                rezultat[index] = numar;
                index++;
            }
        }

        return rezultat;
    }
}
