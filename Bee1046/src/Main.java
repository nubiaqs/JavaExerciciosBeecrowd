import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		    int inicio = scanner.nextInt();
		    int fim = scanner.nextInt();
		    scanner.close();

		    int duracao;
		    if (inicio < fim) {
		      duracao = fim - inicio;
		    } else {
		      duracao = 24 - inicio + fim;
		    }

		    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		  }
	}


