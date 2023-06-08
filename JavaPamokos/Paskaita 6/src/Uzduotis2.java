import java.util.Scanner;
public class Uzduotis2 {
    public static void main(String[] args) {
        isvestiSkaicius(8, 5);
    }

    public static void isvestiSkaicius(int pradzia, int pabaiga) {
        for (int i = pradzia; i >= pabaiga; i--) {
            System.out.println(i);
        }
    }
}
