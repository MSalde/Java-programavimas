public class Uzduotis6 {
    public static void main(String[] args) {

        System.out.println("metaiYraKeliamieji = " + metaiYraKeliamieji(1582));
        System.out.println("metaiYraKeliamieji = " + metaiYraKeliamieji(2003));
        System.out.println("metaiYraKeliamieji = " + metaiYraKeliamieji(1999));
        System.out.println("metaiYraKeliamieji = " + metaiYraKeliamieji(2020));
    }

    public static boolean metaiYraKeliamieji (double metai) {

        if (metai % 4 == 0 && metai % 100 != 0 || metai % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
