//Quest�o 5 (Lista 01 AT) - J�ssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;

public class Comparador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double vetLojas[] = new double[5];
		double teste;
		
		System.out.printf("\n** Preencher o vetor com os pre�os **\n");
		for (int i=0; i<5; i++) {
			 System.out.printf("Informe pre�o do produto na loja "+ (i+1) +":");
			 vetLojas[i] = ler.nextDouble();
		}
		
		System.out.printf("\nInforme o pre�o para teste:");
		teste = ler.nextDouble();
		for (int i=0; i<5; i++) {
			 if (teste >= vetLojas[i]) {
				 System.out.printf("\nLoja "+ (i+1) +" tem o pre�o de R$"+ vetLojas[i]);
			 }
		}

	}

}
