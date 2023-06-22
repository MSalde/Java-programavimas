package Uzduotis2;

public class Trikampis {

    double a;
    double b;
    double c;

    public Trikampis() {
    }

    public Trikampis(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (arTrikampis(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    @Override
    public String toString() {
        return "Trikampis{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    public double trikampioPerimetras() {
        return a + b + c;
    }
    public void sumazintiTrikampi(int santykis) {
        a /= santykis;
        b /= santykis;
        c /= santykis;
    }
    public double trikampioPlotas (){
        double p = trikampioPerimetras() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public char kuriDidziausia (){
        if (a > b && a > c) {
            return 'a';
        } else if (b > a && b > c) {
            return 'b';
        } else {
            return 'c';
        }
    }
    public boolean arTrikampis (double a, double b, double c){
        if (a + b >= c || a + c >= b || b + c >= a)
            return false;
        else
            return true;
    }

}
