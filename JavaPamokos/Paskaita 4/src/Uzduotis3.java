import java.util.Scanner;
public class Uzduotis3 {
    public static void main(String[] args) {

        Scanner skait1 = new Scanner(System.in);
        System.out.println("Įveskite trikampio krastines a ilgi");
        double a = skait1.nextDouble();
        Scanner skait2 = new Scanner(System.in);
        System.out.println("Įveskite trikampio krastines b ilgi");
        double b = skait1.nextDouble();
        Scanner skait3 = new Scanner(System.in);
        System.out.println("Įveskite trikampio krastines c ilgi");
        double c = skait1.nextDouble();
        System.out.println("Trikampio plotas yra: " + trikampioPlotas(a, b, c));
        System.out.println("Trikampio perimetras yra: " + trikampioPerimetras(a, b, c));
    }

    public static String trikampioPlotas(double a, double b, double c) {
        if (c * c == (a * a) + (b * b)) {
            return "Trikampis yra statusis";
        }
        else if (a == b && b == c && a == c) {
            return "Trikampis yra lygiakrastis";
        }
        else if (a == b || b == c || a == c) {
            return "Trikampis yra lygiasonis";
        }else{
            return "Trikampis yra paprastas";
        }
    }

    public static double trikampioPerimetras (double a, double b, double c) {
        return a + b + c;
    }
}
