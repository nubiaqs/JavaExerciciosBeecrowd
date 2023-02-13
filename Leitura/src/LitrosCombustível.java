import java.util.Scanner;

public class LitrosCombustível {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int tempo;
		double velocidade, distancia, kmlitro;
		
		System.out.println("Informe tempo da viagem: ");
		tempo = teclado.nextInt();
		System.out.println("Infome a velocidade: ");
		velocidade = teclado.nextDouble();
		distancia = velocidade * tempo;
		System.out.println("A distancia percorrida: " + distancia + "km");
		kmlitro = distancia / 12;
		System.out.println("O gasto em litros na viagem foi de: " + kmlitro + "litro");
		
		
	}

}
