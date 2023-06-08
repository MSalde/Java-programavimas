import java.util.Scanner;
public class Uzduotis3 {
    public static void main(String[] args) {
        int parametras = 100;
        isvestiBruksniukus(parametras);
        System.out.println(isvestiBruksniukus(parametras));

    }

        public static String isvestiBruksniukus (int parametras) {
            String s = "";
            for (int i = 0; i < parametras; i++) {
                s += "-";
            }
            return s;
        }
    }

