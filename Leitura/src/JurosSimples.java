
public class JurosSimples {

	
	public static void main (String[] args) {
		double valor = 1000.0;
		double taxa = 10.0;
		int tempo = 2; 
		
		
		double juros = valor * (1 + (taxa/100)) * tempo;
		double prestacao = valor + juros;
		
		System.out.println("Valor da prestação é: " + prestacao);
		
	}
}
