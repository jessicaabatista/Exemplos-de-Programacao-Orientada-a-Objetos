import java.io.Serializable;

public class Tecnico implements Serializable{
	
	String nome;
	int idade;
	String apelido;
	double salario;

	public Tecnico() {
		// TODO Auto-generated constructor stub
	}
	
	public Tecnico (String nome) {
		this.nome = nome;
	}
	
	public Tecnico (String nome, int idade, String apelido, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.apelido = apelido;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Tecnico \n" + "Nome: " + nome + "\nSalário: " + salario;
	}

}
