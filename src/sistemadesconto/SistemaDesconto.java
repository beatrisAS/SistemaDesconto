package sistemadesconto;

/**
 *
 * @author beatris
 */
import java.util.Scanner;

public class SistemaDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o valor total da compra
        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        
        double desconto = 0.0;
        
        // Verifica a faixa de desconto aplicável
        if (valorCompra < 200) {
            desconto = 0.05;  // 5% de desconto
        } else if (valorCompra >= 200 && valorCompra < 300) {
            desconto = 0.10;  // 10% de desconto
        } else if (valorCompra >= 300) {
            desconto = 0.15;  // 15% de desconto
        }
        
        // Calcula o valor do desconto e o total a pagar
        double valorDesconto = valorCompra * desconto;
        double valorFinal = valorCompra - valorDesconto;
        
        // Exibe os resultados
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final a ser pago: R$ " + valorFinal);
        
        // Fecha o scanner
        scanner.close();
    }
}
