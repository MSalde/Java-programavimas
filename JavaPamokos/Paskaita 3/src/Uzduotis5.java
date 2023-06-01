public class Uzduotis5 {
    public static void main(String[] args) {

        System.out.println("skaiciausModulisYra = " + skaiciausModulisYra(-27.327));
        System.out.println("skaiciausModulisYra = " + skaiciausModulisYra(258));
        System.out.println("skaiciausModulisYra = " + skaiciausModulisYra(-147.25));
        System.out.println("skaiciausModulisYra = " + skaiciausModulisYra(154.20));
    }

    public static double skaiciausModulisYra (double x) {

        if (x < 0) {
            return (x * (-1));
        } else {
            return x;
        }
    }
}
