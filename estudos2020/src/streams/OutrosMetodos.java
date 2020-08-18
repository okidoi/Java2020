package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 8.0);
		Aluno a2 = new Aluno("Patricia", 7.0);
		Aluno a3 = new Aluno("Lurdes", 7.9);
		Aluno a4 = new Aluno("Pedro", 9.3);
		Aluno a5 = new Aluno("Gabi", 9.6);
		Aluno a6 = new Aluno("Ana", 6.7);
		Aluno a7 = new Aluno("Pedro", 9.3);  //repetido de prop�sito
		Aluno a8 = new Aluno("Gabi", 9.6);   //repetido de prop�sito
		Aluno a9 = new Aluno("Joao", 8.6);   //repetido de prop�sito
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9);
		
		System.out.println("distinct... ");
		
		//Para que distinct funcione � necessario implementar o equal e o hashcode na classe alunos
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)  //1� pula os 2 primeiros alunos 
			.limit(5) //depois limita a 5 o resultado 
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()	
			.skip(2) //pula os 2 primeiros elementos
			.takeWhile(a -> a.nota >=7) //at� que ele encontra um que n�o satisfa�a essa condi��o
			.forEach(System.out::println);		
	}

}
