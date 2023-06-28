package Uzduotis2;

import java.util.Arrays;

public class pagrindinePrograma {
    public static void main(String[] args) {
        Preke preke1 = new Preke(1, "Kėdė", 19.99, 7, "baldai");
        Preke preke2 = new Preke(11, "Stalas", 39.99, 47, "baldai");
        Preke preke3 = new Preke(111, "Sofa", 99.99, 27, "baldai");
        Preke [] prekes = new Preke[] {preke1, preke2, preke3};
        System.out.println("Arrays.toString(prekes) = " + Arrays.toString(prekes));
        System.out.println("[0] elementas = " + prekes[0]);
        System.out.println("Paskutinis elementas = " + prekes[prekes.length - 1]);
        System.out.println("[1] Kaina  = " + prekes[0].getKaina());
    }
}
