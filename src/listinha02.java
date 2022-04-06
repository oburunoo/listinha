import java.util.Scanner;

public class listinha02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            double r = x + y;
            System.out.println(r);

            sc.close();
        }
    }
