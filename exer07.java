import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 3;
        int Y = 0;

        for (int i = 0; i < X; i++) {
            System.out.print(i + ",");
            Y = Y + 5;
            System.out.println(Y);
        }
        sc.close();
    }
}
