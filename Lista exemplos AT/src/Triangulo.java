//Quest�o 5 (Lista 01 AT) - J�ssica Alves Batista - ADS 2018 IFBA
//import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner ler = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.printf("\n** Teste Tri�ngulo **\n");
		//System.out.printf("Informe o valor do primeiro lado: ");
		a = Double.parseDouble(args[0]);
		//System.out.printf("Informe o valor do segundo lado: ");
		b = Double.parseDouble(args[1]);
		//System.out.printf("Informe o valor do terceiro lado: ");
		c = Double.parseDouble(args[2]);
		
		if (((b-c) < a) && (a < (b+c)) && ((a-c) < b) && (b < (a+c)) && ((a-b) < c) && (c < (a+b)))
			System.out.printf("# Com esses valores pode-se formar um tri�ngulo #");
		else
			System.out.printf("# Com esses valores n�o � possivel formar um tri�ngulo #");
	}

}

//Comandos via cmd: 
//Digite: cd
//Localize a pasta contendo o arquivo .java, ex: C:\Program Files\Lista1
//Digite: javac Triangulo.java
//Digite: java Triangulo "a" "b" "c"
