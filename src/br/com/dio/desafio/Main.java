/**
 * 
 */
package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

/**
 * @author Gaucho
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descrição do curso de Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de Angular");
		curso2.setDescricao("Descrição do curso de Angular");
		curso2.setCargaHoraria(16);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição da Mentoria de Java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Everton");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println(dev1.getNome() + " conteúdos inscritos: " + "\n" + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("\n" + dev1.getNome() + " conteúdos concluídos: " + "\n " + dev1.getConteudosConcluidos());
		System.out.println("\n" + dev1.getNome() + " conteúdos inscritos: " + dev1.getConteudosInscritos());
		System.out.println("\nXP: " + dev1.calcularTotalXp());
		
		System.out.println("\n*---------------------------------------------------------------------------------*");
		
		Dev dev2 = new Dev();
		dev2.setNome("Ana");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("\n" + dev2.getNome() +" conteúdos inscritos: " + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("\n" + dev2.getNome() + " conteúdos concluídos: " + dev2.getConteudosConcluidos());
		System.out.println("\nXP: " + dev2.calcularTotalXp());
		
	}

}
