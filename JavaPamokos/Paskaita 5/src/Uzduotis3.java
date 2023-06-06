import java.text.Collator;
import java.util.Locale;
public class Uzduotis3 {
    public static void main(String[] args) {
        String zodis1 = "Antanas";
        int s1 = zodis1.length();
        String zodis2 = "ropė";
        int s2 = zodis2.length();
        String zodis3 = "kelmas";
        int s3 = zodis3.length();
        String zodis4 = "skruzdėlynas";
        int s4 = zodis4.length();
        String zodis5 = "mašina";
        int s5 = zodis5.length();
        String zodis6 = "metras";
        int s6 = zodis6.length();
        System.out.println(kurisZodisIlgesnis(zodis1, zodis2));
        System.out.println(kurisZodisIlgesnis(zodis3, zodis4));
        System.out.println(kurisZodisIlgesnis(zodis5, zodis6));
    }
        static public int kurisZodisIlgesnis (String zodis1, String zodis2) {
            if (zodis1.length() > zodis2.length()) {
                return -1;
            } else if (zodis1.length() < zodis2.length()) {
                return 1;
            } else {
                return 0;
            }
        }
    }



