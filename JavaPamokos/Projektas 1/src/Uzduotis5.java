public class Uzduotis5 {
    public static void main(String[] args) {
        String x = "tekstas";
        String x1 = zodisTrisKartus(x);
        System.out.println(x1);
        String y = "Penktadienis";
        String x2 = zodisTrisKartus(y);
        System.out.println(x2);
        String z = "Siandien as programuoju";
        String x3 = zodisTrisKartus(z);
        System.out.println(x3);


    }
    public static String zodisTrisKartus (String zodis) {
        return zodis + " " + zodis + " " + zodis;
    }

}
