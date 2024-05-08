package org.bootcamp;

public class Curso extends Conteudo {	
	
	private int cargaHoraria;
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);		
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}

}
