package br.unifor.massa;

import br.unifor.lasanha.Lasanha;
import br.unifor.lasanha.Lasanha4Queijos;
import br.unifor.lasanha.LasanhaBolonhesa;
import br.unifor.lasanha.LasanhaFrango;
import br.unifor.pasta.Pasta;
import br.unifor.pasta.PastaBolonhesa;

public class Chefe2SabadoFactory extends MenuEspecialFactory {

	public Lasanha cozinharLasanhaFrango() {
		
		return new LasanhaFrango();
	}


	public Lasanha cozinharLasanha4Queijos() {
		
		return new Lasanha4Queijos();
	}


	public Lasanha cozinharLasanhaBolonhesa() {
		
		return new LasanhaBolonhesa();
	}


	public Pasta cozinharPastaBolonhesa() {
		
		return new PastaBolonhesa();
	}

}
