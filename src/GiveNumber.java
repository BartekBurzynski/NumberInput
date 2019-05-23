import java.util.Scanner;

public class GiveNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Wprowadź liczbę54");
        int i = 0;

        while (true) {
            i = reader.nextInt();
            if (i == 1) {
                break;
            }
            if (i < 100) {
                System.out.println("zbyt mała liczba");
            } else if (i > 200) {
                System.out.println("zbyt duża liczba");
            } else if (i % 3 != 0) {
                System.out.println("liczba nie dzieli się przez 3");
            } else {
                System.out.println("Podana liczba jest ok");
            }
        }
    }
}
