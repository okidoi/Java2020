package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class DesafioFilter {

	public static void main(String[] args) {

		//Pessoa(String nome, Integer idade, String cidade, Character sexo, Double peso, Double altura) {
		Pessoa p1 = new Pessoa("João", 30, "Porto Alegre", 'M', 61.9, 1.80);
		Pessoa p2 = new Pessoa("Larissa", 25, "Porto Alegre", 'F', 84.9, 1.30);
		Pessoa p3 = new Pessoa("Rafael", 70, "Porto Alegre", 'M', 83.9, 1.50);
		Pessoa p4 = new Pessoa("Jorge", 56, "Porto Alegre", 'M', 70.9, 1.67);
		Pessoa p5 = new Pessoa("Lurdes", 68, "Porto Alegre", 'F', 46.9, 1.78);
		Pessoa p6 = new Pessoa("Silvia", 50, "Porto Alegre", 'F', 80.9, 1.54);
		Pessoa p7 = new Pessoa("Rogério", 20, "Rio de Janeiro", 'M', 80.9, 1.60);
		Pessoa p8 = new Pessoa("Renato", 24, "Rio de Janeiro", 'M', 80.9, 1.56);
		Pessoa p9 = new Pessoa("Eduardo", 15, "Porto Alegre", 'M', 60.9, 1.74);
		
		Pessoa p10 = new Pessoa("Marcelo", 18, "Rio de Janeiro", 'M', 64.2, 1.76);
		Pessoa p11 = new Pessoa("Roberto", 19, "Rio de Janeiro", 'M', 65.9, 1.43);
		Pessoa p12 = new Pessoa("Valentina", 07, "Rio de Janeiro", 'M', 15.9, 1.30);
		Pessoa p13 = new Pessoa("Liana", 48, "Porto Alegre", 'M', 120.9, 1.92);
		Pessoa p14 = new Pessoa("Daniel", 47, "Brasilia", 'M', 100.9, 1.87);
		Pessoa p15 = new Pessoa("Ana", 53, "Brasilia", 'M', 59.0 , 1.83);
		
		
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
		
		Predicate<Pessoa> homem = p -> p.getSexo().equals('M');
		Predicate<Pessoa> mulher = p -> !p.getSexo().equals('M');
		Predicate<Pessoa> adulto = p -> p.getIdade() >= 18;
		Predicate<Pessoa> idoso = p -> p.getIdade() >= 60;
		
		Predicate<Pessoa> gaucho = p -> p.getCidade().equalsIgnoreCase("Porto Alegre");
		Predicate<Pessoa> carioca = p -> p.getCidade().equalsIgnoreCase("Rio de Janeiro");
		
		
		
		Predicate<Pessoa> obeso =
				p -> {
					double IMC = (p.getPeso()/ (double) Math.pow(p.getAltura(), 2));
					System.out.println(p.getNome() + " IMC: " + IMC);
					return IMC > 30? true: false;
				} ;
				
		Function<Pessoa, String> dados = 
				p -> {
					return p.getNome() + " você está gordinho! " + "Aos " + p.getIdade() + " anos você deveria estar melhor ";
				};
		
		pessoas.stream()
			.filter(homem)
			.filter(obeso)			
			.filter(adulto)
			.filter(idoso)
			.filter(gaucho)

			.map(dados)
			.forEach(System.out::println);

	}
}
