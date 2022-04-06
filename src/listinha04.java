import java.util.Locale;
import java.util.Scanner;

public class listinha04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double x = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double y = sc.nextDouble();
        double r1 = x + y;
        double r2 = x - y;
        double r3 = x * y;
        double r4 = x / y;

        System.out.println(x + " + " + y + " = " + r1);
        System.out.println(x + " - " + y + " = " + r2);
        System.out.println(x + " * " + y + " = " + r3);
        System.out.println(x + " / " + y + " = " + r4);

        sc.close();
    }
}
