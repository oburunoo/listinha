import java.util.Locale;
import java.util.Scanner;

public class listinha03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite aos valores: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > y ){
            System.out.println("o maior número é: " + x);
        }
        else {
            System.out.println("o maior número é: " + y);
        }
        sc.close();
    }
}
