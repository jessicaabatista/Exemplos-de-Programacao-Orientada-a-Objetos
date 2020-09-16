//Questão 2 (Lista 01 AT) - Jéssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double altura, peso, IMC;
		
		System.out.printf("Informe a altura em metros: ");
		altura = ler.nextDouble();
		System.out.printf("Informe o peso em kg: ");
		peso = ler.nextDouble();
		
		IMC = (peso/(Math.pow(altura,2)));
		System.out.printf("IMC = "+ IMC);

	}

}
