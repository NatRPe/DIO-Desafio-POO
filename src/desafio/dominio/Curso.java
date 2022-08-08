package desafio.dominio;

class Curso  extends Conteudo {
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
	public Curso() { 	}
	

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [Título =" + getTitulo() + ", Descricao =" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}

}
