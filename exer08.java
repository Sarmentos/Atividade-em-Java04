import java.util.Locale;
import java.util.Scanner;

public class exer08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp = 's';

        do {
            System.out.print("Digite a temperatura en celsius : ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit : %.1f%n ", F);
            System.out.print("Deseja refetir (s/n) ? ");
            resp = sc.next().charAt(0);

        } while (resp != 'n');
        sc.close();
    }
}
