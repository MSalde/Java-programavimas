import java.util.Scanner;
public class Uzduotis4 {
    public static void main(String[] args) {
        String tekstas = "žinios, politika, verslas, sportas, pramogos, orai, horoskopai, TV programa";
        char raide = 'i';
        int kiekKartojasi = kiekKartuKartojasiRaide(tekstas, raide);
        System.out.println("Raide " + raide + " kartojasi " + kiekKartojasi + " kartus");
    }
    public static int kiekKartuKartojasiRaide(String s1, char simbolis) {
        int kiekis = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == simbolis) {
                kiekis++;
            }
        }
        return kiekis;
    }
}
