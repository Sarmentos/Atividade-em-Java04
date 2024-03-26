import java.util.Scanner;

public class exer00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro : ");
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }
        
        System.out.println(soma);
        sc.close();
    }
}
