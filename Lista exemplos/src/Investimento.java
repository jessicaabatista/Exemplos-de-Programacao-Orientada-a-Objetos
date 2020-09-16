//Questão 5 (Lista 01) - Jéssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;

public class Investimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		 
	    double valorInicial, valorMensal, taxaJuros, saldoConta;
	    int meses;
	 
	    System.out.printf("\n** Investimento **\n");
	    System.out.printf("Informe o valor inicial: ");
	    valorInicial = ler.nextDouble();
	    System.out.printf("Informe o número de meses de duração do investimento: ");
	    meses = ler.nextInt();
	    System.out.printf("Informe a taxa de juros a ser aplicada: ");
	    taxaJuros = ler.nextDouble();
	    System.out.printf("Informe o valor mensal a ser depositado: ");
	    valorMensal = ler.nextDouble();
	    
	    for (int i = meses; i > 0; i--) {
	    	System.out.printf("\n** Saldo no "+ i +" mês. **");
	    	saldoConta = (valorInicial * Math.pow((1+taxaJuros),meses));
	    	System.out.printf("R$ \n"+ saldoConta);
	    }
	}
}
