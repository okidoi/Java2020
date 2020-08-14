package lambdas;


@FunctionalInterface        //Força a ter um único metodo abstrato. Caso insista, já teremos erro de compilação 
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
