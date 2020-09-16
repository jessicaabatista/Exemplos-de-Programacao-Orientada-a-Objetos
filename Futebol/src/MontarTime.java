import java.io.FileNotFoundException;
import java.io.IOException;

public class MontarTime {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Jogador jogador1 = new Jogador();
		jogador1.setNome("Neymar");
		jogador1.setApelido("CaiCai");
		jogador1.setIdade(21);
		jogador1.setNumCamisa(10);
		jogador1.setPosicao("Atacante");
		jogador1.setTimeAnterior("Barcelona");
		
		Jogador jogador2 = new Jogador ("Romario", "Baixinho", 40, "Atacande", 11, "Vasco");
		
		System.out.println(jogador1);
		System.out.println(jogador2);
		
		Tecnico tecnico = new Tecnico();
		tecnico.setNome("Tite");
		tecnico.setApelido("Tite");
		tecnico.setIdade(55);
		tecnico.setSalario(500000.00);
		
		System.out.println(tecnico);
		
		Time selecao = new Time ("Basil");
		selecao.setReceitaAnual(10000000.00);
		selecao.adicionarJogador(jogador1);
		selecao.adicionarJogador(jogador2);
		selecao.setTecnico(tecnico);
		
		System.out.println(selecao);
		
		BDFutebol salvarTime = new BDFutebol();
		salvarTime.salvaDados(selecao);

	}

}
