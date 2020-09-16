//Questão 8 (Lista 01) - Jéssica Alves Batista - ADS 2018 IFBA
import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String nome, idade, saldo_Conta, v_Pagar;
		
		System.out.printf("\n** Lendo Informações **\n");
		System.out.printf("Informe o nome: ");
		//nome = ler.nextLine();
		System.out.printf("Informe a idade: ");
		//idade = ler.nextLine();
		System.out.printf("Informe o saldo da conta: ");
		//saldo_Conta = ler.nextLine();
		System.out.printf("Informe o valor a ser pago: ");
		//v_Pagar = ler.nextLine();
		
		//args = ("Jéssica", "12312312312", "321", "abc")
		//via prompt de comando: java Argumentos ("Jéssica", "12312312312", "321", "abc")
		
		double saldoConta = Double.parseDouble(saldo_Conta);
		double vPagar = Double.parseDouble(v_Pagar);
		
		if (vPagar > saldoConta){
			System.out.printf("ERRO: Saldo insuficiente para pagar as contas.");
		}else{
			System.out.printf("APROVADO: Saldo suficiente para pagar as contas.");
		}
	}

}
