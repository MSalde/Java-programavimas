import java.text.Collator;
import java.util.Locale;
public class Uzduotis2 {
    public static void main(String[] args) {
        String zodis1 = "ananasas";
        String s1 = zodzioPaskutineRaide (zodis1);
        String zodis2 = "Sakinys";
        String s2 = zodzioPaskutineRaide (zodis2);
        String zodis3 = "meska";
        String s3 = zodzioPaskutineRaide(zodis3);
        System.out.println("Zodzio " + zodis1+ " paskutine raide yra: " + (s1));
        System.out.println("Zodzio " + zodis2 + " paskutine raide yra: " + (s2));
        System.out.println("Zodzio " + zodis3 + " paskutine raide yra: " + (s3));
    }
    static public String zodzioPaskutineRaide(String zodis) {
        String s = zodis.substring(zodis.length() - 1);
        return s;
    }
}

