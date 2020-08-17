package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//Subject
public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> observadores
	= new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
		
	}
	
	
	public void monitorar() {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			
			System.out.println("Aniversariante já chegou?");
			valor = entrada.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				//Criar evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				//notificar observadores				
				observadores.stream()
				.forEach(ob -> ob.chegou(evento));
				
				valor = "sair"; //para sair
				
				
			}else {
				System.out.println("Alarme false");
			}
			
			
		}
	}
	

}
