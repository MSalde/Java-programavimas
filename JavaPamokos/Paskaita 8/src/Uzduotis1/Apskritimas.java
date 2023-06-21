package Uzduotis1;

public class Apskritimas {
    double spindulys;

    public Apskritimas(double spindulys) {
        this.spindulys = spindulys;
    }
    public Apskritimas () {

    }

    @Override
    public String toString() {
        return "Apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }

    public double diametras() {
        return spindulys * 2;
    }

    public void padidintiSpinduli (int santykis) {
        spindulys *= santykis;
    }

    public double apskritimoIlgis () {
        return 2 * Math.PI * spindulys;
    }

    public double apskritimoPlotas () {
        return Math.PI * (spindulys * spindulys);
    }
}
