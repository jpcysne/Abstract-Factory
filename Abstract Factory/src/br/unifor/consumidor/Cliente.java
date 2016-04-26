package br.unifor.consumidor;

import java.util.Scanner;

import br.unifor.massa.Chefe1Factory;
import br.unifor.massa.Chefe2Factory;
import br.unifor.massa.Chefe2SabadoFactory;
import br.unifor.massa.Massa;
import br.unifor.massa.MassaBolonhesaFactory;
import br.unifor.massa.MassaTradicionalFactory;
import br.unifor.massa.MenuEspecialFactory;

public class Cliente {
	
	private static Massa pedido(String semana){
		
		Massa massa= new Massa();
		
		MassaTradicionalFactory mtf=null;
		MassaBolonhesaFactory mbf = null;
		MenuEspecialFactory mef = null;
		
		
		switch (semana) {
		case "segunda":
			mtf= new Chefe1Factory();
			
			massa.setLasanha(mtf.cozinharLasanhaFrango());
			massa.setPasta(mtf.cozinharBolonhesa());
			
			break;
			
		case "terca":
			mbf= new Chefe2Factory();
			
			massa.setLasanha(mbf.cozinharLasanhaBolonhesa());
			massa.setPasta(mbf.cozinharPastaBolonhesa());
			
			break;
			
		case "quarta":
			mtf= new Chefe1Factory();
			
			massa.setLasanha(mtf.cozinharLasanhaFrango());
			massa.setPasta(mtf.cozinharBolonhesa());
			
			break;
			
		case "quinta":
			mbf= new Chefe2Factory();
			
			massa.setLasanha(mbf.cozinharLasanhaBolonhesa());
			massa.setPasta(mbf.cozinharPastaBolonhesa());
			
			break;
			
		case "sexta":
			mtf= new Chefe1Factory();
			
			massa.setLasanha(mtf.cozinharLasanhaFrango());
			massa.setPasta(mtf.cozinharBolonhesa());
			
			break;
			
		case "sabado":
			mef= new Chefe2SabadoFactory();
			
			massa.setLasanha(mef.cozinharLasanha4Queijos());
			massa.setPasta(mef.cozinharPastaBolonhesa());
			break;
			
		case "Domingo":
			System.out.println("Estamos Fechado!");
			break;	
		}
		
		return massa;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String semana = s.nextLine();
		Massa m1 = pedido(semana);
		
		System.out.println(m1);
	}

}
