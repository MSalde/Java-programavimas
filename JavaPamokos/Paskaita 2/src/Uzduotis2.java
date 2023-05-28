public class Uzduotis2 {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        int arLyginis;
        if (x % 2 == 0) {
            arLyginis = x * y;
        } else {
            arLyginis = y - x;
        }
        System.out.println("arLyginis = " + arLyginis);
    }
}
