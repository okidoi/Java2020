package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {


	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 8.0);
		Aluno a2 = new Aluno("Patricia", 7.0);
		Aluno a3 = new Aluno("Lurdes", 8.0);
		Aluno a4 = new Aluno("Pedro", 10);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Predicate<Aluno> reprovado = aprovado.negate(); 
	
		//OBS: Match é uma função TERMINADORA então não posso fazer depois um MAP por exemplo. 
		System.out.println("Todos os alunos foram aprovados? " + alunos.stream().allMatch(aprovado));
		System.out.println("Pelo menos um dos alunos foi aprovado? " + alunos.stream().anyMatch(aprovado));
		System.out.println("Nenhum aluno foi reprovado? " + alunos.stream().noneMatch(reprovado));
		
	}
}
