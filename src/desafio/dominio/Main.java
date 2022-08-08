package desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descri��o curso javascript");
		curso2.setCargaHoraria(8);
		
		//polimorfismo
		Conteudo conteudo = new Curso();
		Conteudo conteudo1 = new Mentoria();
		//Conteudo conteudo2 = new Conteudo(); // d� erro pq conteudo � abstrato
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descri��o mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCa = new Dev();
		devCa.setNome("Ca");
		devCa.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos: " + devCa.getConteudosInscritos());
		devCa.progredir();
		devCa.progredir();
		devCa.progredir();
		System.out.println("Conte�dos Concluidos: " + devCa.getConteudosConcluidos());
		System.out.println("XP: " + devCa.calcularTotalXp());
		
		
		System.out.println("-------");
		
		Dev devJo = new Dev();
		devJo.setNome("Jo");
		devJo.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos: " + devJo.getConteudosInscritos());
		devJo.progredir();
		System.out.println("Conte�dos Concluidos: " + devJo.getConteudosConcluidos());
		System.out.println("XP: " + devJo.calcularTotalXp());
		
		
		
	}

}
