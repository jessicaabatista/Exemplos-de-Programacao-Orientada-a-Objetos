//Questão 1 (Lista 01 AT) - Jéssica Alves Batista - ADS 2018 IFBA
//import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner ler = new Scanner(System.in);
		double dTotal, qtdCombustivel, mConsumo;
		
		//System.out.printf("Informe a distância total percorrida em KM: ");
		dTotal = Double.parseDouble(args[0]);
		//System.out.printf("Informe a quantidade de combustivel usado em litro: ");
		qtdCombustivel = Double.parseDouble(args[1]);
		
		mConsumo = (dTotal/qtdCombustivel);
		System.out.printf("A média de consumo de combustivel foi de "+ mConsumo +"km/L");
	}

}

//Comandos via cmd: 
//Digite: cd
//Localize a pasta contendo o arquivo .java, ex: C:\Program Files\Lista1
//Digite: javac Consumo.java
//Digite: java Consumo "distância" "quantidade"
