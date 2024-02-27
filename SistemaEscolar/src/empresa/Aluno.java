package empresa;

public class Aluno {
	String nome, curso;
	Avaliacao prova;
	
	Aluno(String nome, String curso, Avaliacao prova){
		this.nome = nome;
		this.curso = curso;
		this.prova = prova;
	}
	
	void info() {
		System.out.println("O nome do aluno é: "+nome);
		System.out.println("O curso do aluno é: "+curso);
		System.out.println("A média aritimetica do aluno é: "+prova.mediaAritimetica());
		System.out.println("A média ponderada do aluno é: "+prova.mediaPonderada());
	}
}
