import java.util.Scanner;

public class EnergiaEletrica {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do salário mínimo: ");
	        double salarioMinimo = scanner.nextDouble();
	        double valorKw = salarioMinimo / 7 / 100;

	        System.out.print("Digite a quantidade de kW gasta por essa residência: ");
	        double kwGasto = scanner.nextDouble();
	        double valorAPagar = valorKw * kwGasto;

	        System.out.println("O valor em reais de cada kW é: " + valorKw);
	        System.out.println("O valor em reais a ser pago é: " + valorAPagar);

	        double desconto = valorAPagar * 0.1;
	        double novoValor = valorAPagar - desconto;
	        
	        System.out.println("O novo valor a ser pago com desconto de 10% é: " + novoValor);
	       
		}
		
}
	

	

