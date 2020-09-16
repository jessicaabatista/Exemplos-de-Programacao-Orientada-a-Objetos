//Questão 3 (Lista 01) - Jéssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		 
	    int n1, n2;
	 
	    System.out.printf("\n** Teste de maior número **\n");
	    System.out.printf("Informe o primeiro número para o teste: ");
	    n1 = ler.nextInt();
	    System.out.printf("Informe o primeiro número para o teste: ");
	    n2 = ler.nextInt();
	 
	    if(n1>n2) {
	       	System.out.printf("\n+--Resultado--+\n");
	    	System.out.printf("O maior número é: \n"+ n1);
	    }else {
	    	System.out.printf("\n+--Resultado--+\n");
	    	System.out.printf("O maior número é: "+ n2);
	    }
	}
}

