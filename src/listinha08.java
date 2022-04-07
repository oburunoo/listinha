import java.util.Scanner;

public class listinha08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int r1 = v2;
        int r2 = v1;

        System.out.println("Agora o valor 1 é: " + r1);
        System.out.println("Agora o valor 2 é: " + r2);
        sc.close();
    }


}
