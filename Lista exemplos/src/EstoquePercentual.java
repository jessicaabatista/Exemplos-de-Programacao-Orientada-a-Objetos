//Questão 7 (Lista 01) - Jéssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;


public class EstoquePercentual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String vet_Produto[] = new String[5];
		int vet_QTD[] = new int[5];
		double vet_Preço[] = new double[5];
		double vet_Percentual[] = new double[5];
		//double percentual;
		double pTotal = 0;
		int qtdTotal = 0;
		
		for (int i=0; i<5; i++) {
			 System.out.printf("\n** Preencher as informações de estoque **\n");
			 System.out.printf("Informe o nome do produto: ");
			 //vet_Produto[i] = ler.nextLine();
			 System.out.printf("Informe a quantidade em estoque do produto: ");
			 vet_QTD[i] = ler.nextInt();
			 System.out.printf("Informe o preço do produto: ");
			 vet_Preço[i] = ler.nextDouble();
		}
		
		for (int i=0; i<5; i++) {
			qtdTotal = qtdTotal + vet_QTD[i];
		}
		
		for (int i=0; i<5; i++) {
			vet_Percentual[i] = ((vet_QTD[i]-qtdTotal)/qtdTotal)*100;
			//percentual = ((vet_QTD[i]-qtdTotal)/qtdTotal)*100;
			System.out.printf("\nO produto "+ (i+1) +" corresponde a "+ vet_Percentual[i] +" dos produtos em estoque.");
		}
	}

}