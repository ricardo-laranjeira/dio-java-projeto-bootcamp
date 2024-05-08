package org.bootcamp;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Java", "Primeiros passo com Java", 8);
		Curso curso2 = new Curso("Java", "JUnit", 4);
		
		Mentoria mentoria = new Mentoria("Mercado trabalho Java", "Visao do mercado de trabalho", LocalDate.now());
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Curso completo de Java");
		
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev paulo = new Dev("Paulo Henrique");
		paulo.inscreverBootcamp(bootcamp);
		System.out.println("Paulo - conteudos inscritos: " + paulo.getConteudosInscritos());
		paulo.progredir();
		paulo.progredir();
		paulo.progredir();
		System.out.println("Paulo - conteudos inscritos: " + paulo.getConteudosInscritos());
		System.out.println("Paulo - conteudos concluidos: " + paulo.getConteudosConcluidos());		
		System.out.println("Paulo XP: " + paulo.calcularTotalXP());
		
		Dev luiz = new Dev("Luiz Henrique");		
		luiz.inscreverBootcamp(bootcamp);
		System.out.println("Luiz - conteudos inscritos: " + luiz.getConteudosInscritos());
		luiz.progredir();
		System.out.println("Luiz - conteudos inscritos: " + luiz.getConteudosInscritos());
		System.out.println("Luiz - conteudos concluidos: " + luiz.getConteudosConcluidos());
		System.out.println("Luiz XP: " + luiz.calcularTotalXP());
	}

}
