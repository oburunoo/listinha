import java.util.Locale;
import java.util.Scanner;

public class listinha01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as notas:");

        double w = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double r = (w + x + y + z)/4;

        if (r >= 6.0) {
            System.out.println("Aprovado " + r);
        } else {
            System.out.println("Reprovado " + r);
        }
        sc.close();
    }

}
