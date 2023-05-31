public class Uzduotis1 {
    public static void main(String[] args) {

        System.out.println("arDalinasiBeLiekanos = " + arDalinasiBeLiekanos(25, 6, 5));
        System.out.println("arDalinasiBeLiekanos = " + arDalinasiBeLiekanos(-100, 10, -20));
        System.out.println("arDalinasiBeLiekanos = " + arDalinasiBeLiekanos(140, 7, 2));
        System.out.println("arDalinasiBeLiekanos = " + arDalinasiBeLiekanos(12, 4, 5));
    }

    public static boolean arDalinasiBeLiekanos(int skaicius, int Daliklis1, int Daliklis2) {

        if ((skaicius % Daliklis1 == 0) && (skaicius % Daliklis2 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}