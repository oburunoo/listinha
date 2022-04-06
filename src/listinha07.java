import java.util.Locale;
import java.util.Scanner;

public class listinha07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nm = sc.next();
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double r = (n1 + n2 + n3) / 3;

        System.out.println(nm + r);
        sc.close();
    }
}
