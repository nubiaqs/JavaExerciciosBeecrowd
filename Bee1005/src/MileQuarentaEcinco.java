import java.util.Scanner;

public class MileQuarentaEcinco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		    int n = teclado.nextInt();

		    for (int i = 1; i <= n; i++) {
		      System.out.println(i + " " + (i * i) + " " + (i * i * i));
		      System.out.println(i + " " + (i * i + 1) + " " + (i * i * i + 1));
		    }
		  }
		}