package Uzduotis1;

public class PagrindinePrograma {
    public static void main(String[] args) {

        Apskritimas s1 = new Apskritimas (5);
        System.out.println("s1 = " + s1);
        Apskritimas s2 = new Apskritimas ();
        s2.spindulys = 7;
        System.out.println("s2 = " + s2);
        System.out.println("s1 Diametras = " + s1.diametras());
        System.out.println("s2 Diametras = " + s2.diametras());
        s1.padidintiSpinduli(2);
        System.out.println("Sumazintas spindulys:" + s1);
        System.out.println("Sumazintas spindulys:" + s2);
        s1.apskritimoIlgis();
        System.out.println("s1 apskritimo ilgis = " + s1.apskritimoIlgis());
        System.out.println("s2 apskritimo ilgis = " + s2.apskritimoIlgis());
        s1.apskritimoPlotas();
        System.out.println("s1.apskritimo plotas() = " + s1.apskritimoPlotas());
        System.out.println("s2.apskritimo plotas() = " + s2.apskritimoPlotas());
    }
}
