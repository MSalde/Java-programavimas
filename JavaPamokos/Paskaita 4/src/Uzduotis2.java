import javax.lang.model.SourceVersion;
import java.util.Scanner;
public class Uzduotis2 {
    public static void main(String[] args) {
        Scanner skait1 = new Scanner(System.in);
        System.out.println("Įveskite staciakampio ilgi");
        double a = skait1.nextDouble();
        Scanner skait2 = new Scanner(System.in);
        System.out.println("Įveskite staciakampio ploti");
        double b = skait2.nextDouble();
        System.out.println("Plotas su " + a + " ilgiu ir " + b + " plociu yra: " + staciakampioPlotas(a, b));
        System.out.println("Perimetras su " + a + " ilgiu ir " + b + " plociu yra: " + staciakampioPerimetras(a, b));
        System.out.println (kurisDidesnis(a, b));
    }
    public static double staciakampioPlotas(double a, double b) {
        return a * b;
    }
    public static double staciakampioPerimetras(double a, double b) {
        return (a + b) * 2;
    }
    public static String kurisDidesnis (double staciakampioPerimetras, double staciakampioPlotas) {
        if  (staciakampioPerimetras > staciakampioPlotas) {
            return ("Staciakmpio plotas yra didesnis.");
        }else{
            return ("Staciakampio perimetras yra didesnis.");
        }
    }
}
