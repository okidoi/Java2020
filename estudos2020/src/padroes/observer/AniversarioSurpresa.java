package padroes.observer;

public class AniversarioSurpresa {

	
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservador(namorada);
		
		//Criando outro interessado(Observador através de lambda)
		porteiro.registrarObservador(ob -> {
			System.out.println("Surpresa via Lambda: " + ob.getMomento());  //esta é a implementação do único metodo (chegou) da interface funcional ObservadorChegadaAniversariante 
		});
		
		
		
		porteiro.monitorar();
	}
}
