import java.io.Serializable;

public class Jogador implements Serializable{
	
	String nome;
	String apelido;
	int idade;
	String posicao;
	int numCamisa;
	String timeAnterior;

	public Jogador() {
		// TODO Auto-generated constructor stub
	}
	public Jogador(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
	}
	public Jogador(String nome, String apelido, int idade, String posicao, int numCamisa, String timeAnterior) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.apelido = apelido;
		this.idade = idade;
		this.posicao = posicao;
		this.numCamisa = numCamisa;
		this.timeAnterior = timeAnterior;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public int getNumCamisa() {
		return numCamisa;
	}
	public void setNumCamisa(int numCamisa) {
		this.numCamisa = numCamisa;
	}
	public String getTimeAnterior() {
		return timeAnterior;
	}
	public void setTimeAnterior(String timeAnterior) {
		this.timeAnterior = timeAnterior;
	}
	
	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", apelido=" + apelido + ", idade=" + idade + ", posicao=" + posicao
				+ ", numCamisa=" + numCamisa + ", timeAnterior=" + timeAnterior + "]\n";
	}
	

}
