//Questão 4 (Lista 01) - Jéssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		 
	    int n;
	    
	    System.out.printf("** Ordem Decrescente **\n");
	    System.out.printf("Informe um número: ");
	    n = ler.nextInt();
	    
	    System.out.printf("\n\n** Exinbindo a ordem **");
	    for (int i = n; i >= 0; i--) {
	    	System.out.printf("\n"+i);
	    }
	}

}
