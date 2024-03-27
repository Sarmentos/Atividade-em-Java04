import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero : ");

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
        sc.close();
    }
}
