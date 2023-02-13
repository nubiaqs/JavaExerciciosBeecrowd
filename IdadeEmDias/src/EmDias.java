import java.util.Scanner;

public class EmDias {

	public static void main(String[] args) {
		int anosEmDias;
		int qtdAnos, qtdMeses, qtdDias;
		int resto;
		
	Scanner teclado = new Scanner (System.in);
	anosEmDias = teclado.nextInt();
	
	qtdAnos = anosEmDias / 365;
	
	resto = anosEmDias % 365;
	qtdMeses = anosEmDias % 365;
	qtdDias = resto / 30;
	
	qtdDias = resto % 30;
	
	System.out.println(qtdAnos + "anos (s)");
	System.out.println(qtdMeses + "meses (s)");
	System.out.println(qtdDias + "dias (s)");
	

	}

}
