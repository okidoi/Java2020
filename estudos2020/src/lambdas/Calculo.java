package lambdas;


@FunctionalInterface        //For�a a ter um �nico metodo abstrato. Caso insista, j� teremos erro de compila��o 
public interface Calculo {
	

	public abstract double executar (double a, double b);
	
	
	//este metodo nao atrapalha a interface funcional
	public default String outroMetodo() {
		return "outro metodo";
	}
	
	public static String outroMetodo2() {
		return "conteudo estatico";
	}

}
