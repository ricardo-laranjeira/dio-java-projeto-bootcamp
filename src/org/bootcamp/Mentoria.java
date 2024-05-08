package org.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate dataMentoria;
	
	public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
		super(titulo, descricao);
		this.dataMentoria = dataMentoria;
	}
	
	public LocalDate getDataMentoria() {
		return dataMentoria;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", dataMentoria=" + dataMentoria + "]";
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

}
