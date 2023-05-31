public class Uzduotis3 {
    public static void main(String[] args) {
        System.out.println("arGalimaSudarytiTrikampi = " + arGalimaSudarytiTrikampi (25,14, 10 ));
        System.out.println("arGalimaSudarytiTrikampi = " + arGalimaSudarytiTrikampi (1,1, 1 ));
        System.out.println("arGalimaSudarytiTrikampi = " + arGalimaSudarytiTrikampi (12,5, 7 ));
        System.out.println("arGalimaSudarytiTrikampi = " + arGalimaSudarytiTrikampi (123.451,146.541, 100.2257 ));
    }

    public static boolean arGalimaSudarytiTrikampi(double a, double b, double c) {

        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }
}
