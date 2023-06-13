import java.util.Arrays;

public class Uzduotis2 {
    public static void main(String[] args) {
        int [] masyvas = {5, 10, 15, 20, 25, 30, 35, 40};
        int[] naujasMasyvas = kopijuotiMasyva(masyvas);
        System.out.println("masyvas = " + Arrays.toString(masyvas));
        System.out.println(Arrays.toString(kopijuotiMasyva(naujasMasyvas)));
    }
    public static int[] kopijuotiMasyva(int[] masyvas) {
        int [] masyvokopija = new int [masyvas.length];;
        for (int i = 0; i < masyvokopija.length; i++) {
            masyvokopija[i] = masyvas [i];
        }
        return masyvokopija;
    }
}
