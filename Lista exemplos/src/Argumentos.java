//Questão 1 (Lista 01) - Jéssica Alves Batista - ADS 2018 IFBA
public class Argumentos {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		 
		System.out.printf("Nome: "+ args[0]);
		System.out.printf("\nCPF: "+ args[1]);
				
	}		 
}

//args = ("Jéssica", "12312312312", "321", "abc")
//via prompt de comando: java Argumentos ("Jéssica", "12312312312", "321", "abc")

/*
//Questão 2
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Argumentos {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 
		FileWriter arq = new FileWriter("c:\\Resultado.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	 
	    gravarArq.printf("Nome: "+ args[0]);
	    gravarArq.printf("\nCPF: "+ args[1]);
	    	 
	    arq.close();
				
	}		 
}*/