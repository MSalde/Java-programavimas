public class Uzduotis4 {
    public static void main(String[] args) {
        double a = 5;
        double b = 5.5;
        double a1 = 25;
        double b1 = 37;
        double a2 = -200;
        double b2 = 100;
        System.out.println(dvigubaSuma(a, b));
        System.out.println(dvigubaSuma(a1, b1));
        System.out.println(dvigubaSuma(a2, b2));
    }
    public static double dvigubaSuma (double a, double b) {
        return (a + b) * 2;
    }
}
