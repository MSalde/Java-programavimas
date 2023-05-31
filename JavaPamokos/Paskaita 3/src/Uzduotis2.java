public class Uzduotis2 {
    public static void main(String[] args) {
        System.out.println("arVerslasPelningas = " + arVerslasPelningas (1679.25,2631.25));
        System.out.println("arVerslasPelningas = " + arVerslasPelningas (2300.25,2300.25));
        System.out.println("arVerslasPelningas = " + arVerslasPelningas (1325.25,1131.25));
    }

    public static boolean arVerslasPelningas(double islaidos, double pajamos) {

        if (pajamos > islaidos) {
            return true;
        } else {
            return false;
        }
    }
}