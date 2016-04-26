package br.unifor.massa;

import br.unifor.lasanha.Lasanha;
import br.unifor.lasanha.LasanhaBolonhesa;
import br.unifor.pasta.Pasta;
import br.unifor.pasta.PastaBolonhesa;

public class Chefe2Factory extends MassaBolonhesaFactory {


	public Lasanha cozinharLasanhaBolonhesa() {
		
		return new LasanhaBolonhesa();
	}


	public Pasta cozinharPastaBolonhesa() {
		
		return new PastaBolonhesa();
	}

}
