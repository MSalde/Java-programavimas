public class Uzduotis5 {
    public static void main(String[] args) {
        int skaicius = 15;
        System.out.println(arSkaiciusPirminis(skaicius));
    }
        public static boolean arSkaiciusPirminis (int skaicius) {
            int kiekis = 0;
            for (int i = 2; i < skaicius; i++) {
                if (skaicius % i == 0) {
                    kiekis++;
                }
            }
            if (kiekis == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

