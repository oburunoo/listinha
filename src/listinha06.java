import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class listinha06 {
    private final static double PORCENTAGEM_COMISSAO = 0.15;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome do vendedor: ");
        sc.nextLine();
        System.out.println("Informe o salário fixo: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Valor em vendas: ");
        double vendas = sc.nextDouble();
        double comissao = PORCENTAGEM_COMISSAO * vendas;
        double r = salarioFixo + comissao;

        DecimalFormat four = new DecimalFormat("#0.00");
        System.out.println("Valor da comissão R$ " + comissao);
        System.out.println("TOTAL = R$ " + four.format(r));
    }
}
