//Quest�o 4 (Lista 01 AT) - J�ssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;

public class NumeroMagico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int valor = (int) (Math.random() * 100);
		int num = 0;
		
		//System.out.printf("\nN�mero sorteado: " + valor + "\n");
		System.out.printf("\n** Adivinhe o n�mero **\n");
		System.out.printf("\nObs.: Digite um n�mero acima de 100 para sair do jogo.\n");
		
		while ((num != valor) && (num <= 100)) {
			System.out.printf("\nInforme um n�mero inteiro entre 0 e 100:");
			num = ler.nextInt();
			
			if (num == valor) {
				System.out.printf("# Parab�ns voc� acertou o n�meo sorteado!! #");
			}else {
				if(num <= 100)
					System.out.printf("O n�mero sorteado n�o foi esse, tente novamente.");
				else
					System.out.printf("Fim do jogo | O n�mero sorteado foi "+ valor);
			}
		}
	}

}
