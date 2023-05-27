public class Uzduotis3 {
    public static void main(String[] args) {
        double a = 5;
        double b = 5.5;
        double c = 4.5;
        double d = 4;
        double perimetras = keturkampioPerimetras(a, b, c, d);
        System.out.println(perimetras);

        double a1 = 17.35;
        double b1 = 18;
        double c1 = 20.47;
        double d1 = 16.37;
        double perimetras1 = keturkampioPerimetras(a1, b1, c1, d1);
        System.out.println(perimetras1);

        double a2 = 2;
        double b2 = 4;
        double c2 = 2;
        double d2 = 4.1;
        double perimetras2 = keturkampioPerimetras(a2, b2, c2, d2);
        System.out.println(perimetras2);
    }
    public static double keturkampioPerimetras (double a, double b, double c, double d){
        return a + b + c +d;
    }

}
