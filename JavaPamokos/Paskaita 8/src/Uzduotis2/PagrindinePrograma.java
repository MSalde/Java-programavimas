package Uzduotis2;

public class PagrindinePrograma {
    public static void main(String[] args) {

        Trikampis t1 = new Trikampis(10, 5, 10);
        System.out.println("t1 = " + t1);
        Trikampis t2 = new Trikampis();
        t2.a = 10;
        t2.b = 10;
        t2.c = 15;
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t1 trikampio perimetras = " + t1.trikampioPerimetras());
        System.out.println("t2 trikampio perimetras() = " + t2.trikampioPerimetras());
        t1.sumazintiTrikampi(2);
        System.out.println("t1 sumazintas = " + t1);
        t2.sumazintiTrikampi(3);
        System.out.println("t2 sumazintas = " + t2);
        System.out.println("t1 trikampio plotas = " + t1.trikampioPlotas());
        System.out.println("t2 trikampio plotas = " + t2.trikampioPlotas());
        System.out.println("t1 kuri didziausia() = " + t1.kuriDidziausia());
        System.out.println("t2 kuri didziausia() = " + t2.kuriDidziausia());
        System.out.println("t1.arTrikampis() = " + t1.arTrikampis(t1.a, t1.a, t1.c));
        System.out.println("t2.arTrikampis() = " + t2.arTrikampis(t2.a, t2.b, t2.c));
    }
}
