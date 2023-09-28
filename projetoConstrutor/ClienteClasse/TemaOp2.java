package projetoConstrutor.ClienteClasse;

public class TemaOp2 {
	private long id;
	private String nome;
	private double aluguel;
	private String corTolha;
	
	public TemaOp2(long id, String nome, double aluguel, String corTolha) {
		super();
		this.id = id;
		this.nome = nome;
		this.aluguel = aluguel;
		this.corTolha = corTolha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public String getCorTolha() {
		return corTolha;
	}

	public void setCorTolha(String corTolha) {
		this.corTolha = corTolha;
	}
	
	

}
