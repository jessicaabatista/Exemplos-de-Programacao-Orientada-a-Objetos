//Questão 4 (Lista 01 AT) - Jéssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;

public class NumeroMagico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int valor = (int) (Math.random() * 100);
		int num = 0;
		
		//System.out.printf("\nNúmero sorteado: " + valor + "\n");
		System.out.printf("\n** Adivinhe o número **\n");
		System.out.printf("\nObs.: Digite um número acima de 100 para sair do jogo.\n");
		
		while ((num != valor) && (num <= 100)) {
			System.out.printf("\nInforme um número inteiro entre 0 e 100:");
			num = ler.nextInt();
			
			if (num == valor) {
				System.out.printf("# Parabéns você acertou o númeo sorteado!! #");
			}else {
				if(num <= 100)
					System.out.printf("O número sorteado não foi esse, tente novamente.");
				else
					System.out.printf("Fim do jogo | O número sorteado foi "+ valor);
			}
		}
	}

}
