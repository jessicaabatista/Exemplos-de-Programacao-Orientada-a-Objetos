//Quest�o 6 (Lista 01) - J�ssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		//String vet_Produto[] = new String[5];
		int vet_QTD[] = new int[5];
		double vet_Pre�o[] = new double[5];
		double pTotal = 0;
		int qtdTotal = 0;
		
		for (int i=0; i<5; i++) {
			 System.out.printf("\n** Preencher as informa��es de estoque **\n");
			 System.out.printf("Informe o nome do produto: ");
			 //vet_Produto[i] = ler.nextLine();
			 System.out.printf("Informe a quantidade em estoque do produto: ");
			 vet_QTD[i] = ler.nextInt();
			 System.out.printf("Informe o pre�o do produto: ");
			 vet_Pre�o[i] = ler.nextDouble();
		}
		
		for (int i=0; i<5; i++) {
			pTotal = pTotal + vet_Pre�o[i];
			qtdTotal = qtdTotal + vet_QTD[i];
		}
		
		System.out.printf("/nO valor total do estoque � de R$ "+ pTotal);
		System.out.printf("\nA quantidade total em estoque � de "+ qtdTotal +" produtos.");
	}

}
