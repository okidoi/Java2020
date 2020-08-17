package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(20.3);
		System.out.println(caixaA.abrir());

		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(20);
		System.out.println(caixaB.abrir());

		CaixaNumero<Float> caixaC = new CaixaNumero<>();
		caixaC.guardar(21.3F);
		System.out.println(caixaC.abrir());		
	}
	
}
