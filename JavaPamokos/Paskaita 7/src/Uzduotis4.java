public class Uzduotis4 {
    public static void main(String[] args) {
        int[] masyvas = {5, 10, 15, 20, 25, 30, 35, 40};
        int i1 = 3;
        int i2 = 7;
        int suma1 = isvestiSuma(i1, i2, masyvas);
        int suma2 = isvestiSuma(2, 4, masyvas);
        System.out.println("suma1 = " + suma1);
        System.out.println("  suma2 = " + suma2);

    }

    public static int isvestiSuma(int i1, int i2, int[] masyvas) {
        int suma1 = masyvas[i1] + masyvas[i2];
        return suma1;
    }
}
