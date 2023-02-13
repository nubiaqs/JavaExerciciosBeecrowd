import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int positivos = 0;
		        double soma = 0.0;
		        for (int i = 0; i < 6; i++) {
		            double n = sc.nextDouble();
		            if (n > 0) {
		                positivos++;
		                soma += n;
		            }
		        }
		        System.out.println(positivos + " valores positivos");
		        System.out.printf("%.1f\n", soma / positivos);
		    }
		}
