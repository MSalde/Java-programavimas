public class Uzduotis4 {
    public static void main(String[] args) {



        System.out.println("arFiguraYraKvadratas = " + arFiguraYraKvadratas(12.5, 12.5, 12.5, 12.5));
        System.out.println("arFiguraYraKvadratas = " + arFiguraYraKvadratas(1, 1, 1, 1));
        System.out.println("arFiguraYraKvadratas = " + arFiguraYraKvadratas(13.4, 13.4, 13.34, 13.24));
    }

    public static boolean arFiguraYraKvadratas (double a, double b, double c, double d) {

        if (a == b && b == c && c == d && a == d) {
            return true;
        } else {
            return false;
        }
    }
}
