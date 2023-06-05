import java.text.Collator;
import java.util.Locale;
public class Uzduotis1 {
    public static void main(String[] args) {
        String zodis = "kelmas";
        String zodis1 = "Antanas";
        String zodis2 = "Rope";

        int i = zodis.length();
        int i1 = zodis1.length();
        int i2 = zodis2.length();

        System.out.println("Zodi1 sudaro: " + i + " raides.");
        System.out.println("Zodi2 sudaro: " + i1 + " raides.");
        System.out.println("Zodi3 sudaro: " + i2 + " raides.");

        int x = 8;
        int x1 = 5;
        int x2 = 7;

        System.out.println("x1 yra lygus: " + x + ".");
        System.out.println("x2 yra lygus: " + x1 + ".");
        System.out.println("x3 yra lygus: " + x2 + ".");

        System.out.println("Zodis1 yra ilgesnis uz x1: " + arZodisIlgesnis2(zodis, x));
        System.out.println("Zodis2 yra ilgesnis uz x2: " + arZodisIlgesnis2(zodis1, x1));
        System.out.println("Zodis3 yra ilgesnis uz x3: " + arZodisIlgesnis2(zodis2, x2));
    }
        public static boolean arZodisIlgesnis2(String zodis, int x) {
            if (zodis.length() > x) {
                return true;
            } else {
                return false;
            }
    }
}