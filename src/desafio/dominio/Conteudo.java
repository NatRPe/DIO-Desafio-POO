package desafio.dominio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d; 
	//constante double, pode ser usada fora da classe, só as filahs têm acesso
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp(); 
	// é abstrata, não pode ser instanciada

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
