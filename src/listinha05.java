import java.util.Locale;
import java.util.Scanner;

public class listinha05 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a distância percorrida: ");
            double x = sc.nextDouble(); // Distancia
            System.out.print("Digite o consumo de combustível: ");
            double y = sc.nextDouble();  // Combustivel
            double z = ((x + y) / 2); // Consumo
            System.out.print("A média de combustível gasto foi " + z);
            sc.close();
        }
    }