package empresa;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Avaliacao prova1 = new Avaliacao();
		Avaliacao prova2 = new Avaliacao(7,4,2);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota da prova 1");
		prova1.nota1 = entrada.nextDouble();
		System.out.println("Digite a nota da prova 2");
		prova1.nota2 = entrada.nextDouble();
		System.out.println("Digite a nota da prova 3");
		prova1.nota3 = entrada.nextDouble();
		
		System.out.printf("A média aritimetica é: %.2f\n", prova1.mediaAritimetica());
		System.out.printf("A média ponderada é: %.2f\n\n",prova1.mediaPonderada());
		
		System.out.printf("A média aritimetica é: %.2f\n", prova2.mediaAritimetica());
		System.out.printf("A média ponderada é: %.2f\n\n\n",prova2.mediaPonderada());
		
		Aluno aluno1 = new Aluno("Guilherme","Sistemas de Informação",new Avaliacao(10,8,7));
		
		aluno1.info();
	}
}
