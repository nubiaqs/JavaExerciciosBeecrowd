import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;

		do {
		System.out.println("Digite um valor:");
			valor = teclado.nextInt();
		}while(valor!= -1);
		teclado.close();
		
		System.out.print("!FIM!");
	

	}

}
