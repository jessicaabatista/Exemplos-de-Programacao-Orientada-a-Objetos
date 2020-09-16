import java.io.Serializable;
import java.util.Arrays;

public class Time implements Serializable{
	
	String nome;
	Tecnico tecnico;
	Jogador[] jogadores = new Jogador[12];
	double receitaAnual;

	public Time() {
		// TODO Auto-generated constructor stub
	}
	
	public Time(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
	}
	
	public Time(String nome, Tecnico tecnico, Jogador[] jogadores, double receitaAnual) {
		// TODO Auto-generated constructor stub		
		this.nome = nome;
		this.tecnico = tecnico;
		this.jogadores = jogadores;
		this.receitaAnual = receitaAnual;
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", tecnico=" + tecnico + ", jogadores=" + Arrays.toString(jogadores)
				+ ", receitaAnual=" + receitaAnual + "]\n";
	}
	
	public void adicionarJogador(Jogador jogador) {
		for (int i=0; i<jogadores.length; i++) {
			if (jogadores[i] == null) {
				jogadores[i] = jogador;
				break;
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}

	public double getReceitaAnual() {
		return receitaAnual;
	}

	public void setReceitaAnual(double receitaAnual) {
		this.receitaAnual = receitaAnual;
	}

}
