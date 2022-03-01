package model.entities;

public class Jogador {

	private String name;
	private String posicao;
	private Integer idade;
	private String timeAtual;
	private Integer golsMarcados;
	
	public Jogador(String name, String posicao, Integer idade, String timeAtual, Integer golsMarcados) {
		this.name = name;
		this.posicao = posicao;
		this.idade = idade;
		this.timeAtual = timeAtual;
		this.golsMarcados = golsMarcados;
	}
	
	public Jogador() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTimeAtual() {
		return timeAtual;
	}

	public void setTimeAtual(String timeAtual) {
		this.timeAtual = timeAtual;
	}

	public Integer getGolsMarcados() {
		return golsMarcados;
	}

	public void setGolsMarcados(Integer golsMarcados) {
		this.golsMarcados = golsMarcados;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Position: " + posicao + ", Team: " + timeAtual + ", Age: " + idade + ", Gols: " + golsMarcados;
	}
	
}
