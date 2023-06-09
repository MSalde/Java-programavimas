public class Uzduotis6 {
    public static void main(String[] args) {

        int x = 123456;
        System.out.println(skaitmenuSuma(x));
    }
    public static int skaitmenuSuma(int skaicius) {
        int suma = 0;
        while (skaicius > 0) {
            int skaitmuo = skaicius % 10;
            skaicius /= 10;
            suma += skaitmuo;
        }
        return suma;
    }
}