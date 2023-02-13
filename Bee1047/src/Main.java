import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int inicioHora = sc.nextInt();
		    int inicioMinuto = sc.nextInt();
		    int fimHora = sc.nextInt();
		    int fimMinuto = sc.nextInt();

		    int duracaoMinutos = 0;
		    int duracaoHoras = 0;

		    if (inicioHora == fimHora && inicioMinuto == fimMinuto) {
		      duracaoHoras = 24;
		      duracaoMinutos = 0;
		    } else {
		      if (fimMinuto >= inicioMinuto) { 
		        duracaoMinutos = fimMinuto - inicioMinuto;
		        duracaoHoras = fimHora - inicioHora;
		      } else {
		        duracaoMinutos = (60 - inicioMinuto) + fimMinuto;
		        duracaoHoras = (fimHora - inicioHora - 1 + 24) % 24;
		      }
		    }

		    System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
	}

}
