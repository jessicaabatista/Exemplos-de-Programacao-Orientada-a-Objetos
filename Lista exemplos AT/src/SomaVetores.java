//Quest�o 3 (Lista 01 AT) - J�ssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double vet1[] = new double[5];
		double vet2[] = new double[5];
		//double vetSoma[] = new double[5];
		
		for (int i=0; i<5; i++) {
			 System.out.printf("\n** Preencher as informa��es do vetor1 **\n");
			 System.out.printf("Informe um valor para a posi��o "+ (i+1) +":");
			 vet1[i] = ler.nextDouble();
			 
			 System.out.printf("\n** Preencher as informa��es do vetor2 **\n");
			 System.out.printf("Informe um valor para a posi��o "+ (i+1) +":");
			 vet2[i] = ler.nextDouble();
		}
		
		System.out.printf("\n** SOMA DOS VETORES **\n");
		for (int i=0; i<5; i++) {
			System.out.printf("Posi��o "+ (i+1) +" -> soma = "+ (vet1[i]+vet2[i]) +"\n"); 
		}

	}

}
