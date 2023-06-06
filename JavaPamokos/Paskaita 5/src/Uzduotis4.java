import java.text.Collator;
import java.util.Locale;
public class Uzduotis4 {
    public static void main(String[] args) {

        String zodis = "katė";
        String zodis1 = "ananasas";
        String zodis2 = "Sakinys";
        String zodis3 = "meška";

        int indeksas = 0;
        int indeksas1 = 5;
        int indeksas2 = 3;
        int indeksas3 = 2;

        System.out.println("Raide pagal indeksa yra: " + isvestiRaide(zodis, indeksas));
        System.out.println("Raide pagal indeksa yra: " + isvestiRaide(zodis1, indeksas1));
        System.out.println("Raide pagal indeksa yra: " + isvestiRaide(zodis2, indeksas2));
        System.out.println("Raide pagal indeksa yra: " + isvestiRaide(zodis3, indeksas3));

    }
    static public char isvestiRaide (String zodis, int indeksas) {
        char c = zodis.charAt(indeksas);
        return c;
    }
}
