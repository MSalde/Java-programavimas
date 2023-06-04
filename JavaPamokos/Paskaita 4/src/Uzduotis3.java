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
        System.out.println("Trikampis yra: " + trikampioTipas(a, b, c));
        double p2 = ((a + b + c) /2);
        System.out.println("Trikampio plotas yra: " + trikampioPlotas(p2, a, b, c));
        System.out.println("Trikampio perimetras yra: " + trikampioPerimetras(a, b, c));

    }

    public static String trikampioTipas(double a, double b, double c) {

        if (c * c == (a * a) + (b * b)) {
            return "Statusis";
        }
        else if (a == b && b == c && a == c) {
            return "Lygiakrastis";
        }
        else if (a == b || b == c || a == c) {
            return "Lygiasonis";
        }else{
            return "Paprastas";
        }
    }
    public static double trikampioPlotas (double p2, double a, double b, double c) {
        return Math.sqrt (p2 * (p2 - a) * (p2 - b) * (p2 - c));
    }

    public static double trikampioPerimetras (double a, double b, double c) {
        return a + b + c;
    }
}
