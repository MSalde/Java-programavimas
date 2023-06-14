public class Uzduotis3 {
    public static void main(String[] args) {
        int [] masyvas = {5, 10, 15, 20, 25, 30, 35, 40};
        int indeksas = 3;
        int i = isvestiElementa(masyvas, indeksas);
        System.out.println("masyvas = " + i);
    }
    public static int isvestiElementa (int [] masyvas, int indeksas) {
            return masyvas[masyvas.length - indeksas];
    }
}
