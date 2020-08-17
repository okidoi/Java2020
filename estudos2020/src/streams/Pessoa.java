package streams;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private String cidade;
	private Character sexo;
	private Double peso;
	private Double altura;
	
	public Pessoa(String nome, Integer idade, String cidade, Character sexo, Double peso, Double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	
	

}
