public class Main{
    public static void main (String[] args){
        Integer [] numere = new Integer[] {1, 5, 33, 293, 330, 1202, 33044};
        System.out.println("Suma numerelor este: " + suma(numere) + ".");

        numereImpare(numere);
    }

    public static Integer suma(Integer [] arr) {
        Integer sum = 0;
        for (Integer num : arr) {
            sum +=num;
        }
        return sum;
    }

    public static void numereImpare(Integer[] arr) {
        System.out.print("Numere impare: ");
        for (Integer numere : arr) {
            if (numere % 2 != 0) {
                System.out.print(numere + " ");
            }
        }
        System.out.println();
    }
}