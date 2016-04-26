package br.unifor.massa;

import br.unifor.lasanha.Lasanha;
import br.unifor.lasanha.LasanhaFrango;
import br.unifor.pasta.Pasta;
import br.unifor.pasta.Pasta4Queijos;
import br.unifor.pasta.PastaBolonhesa;
import br.unifor.pasta.PastaFrango;

public  class Chefe1Factory extends MassaTradicionalFactory{


	public Lasanha cozinharLasanhaFrango() {
		
		return new LasanhaFrango();
	}


	public Pasta cozinharBolonhesa() {
		
		return new PastaBolonhesa();
	}


	public Pasta cozinhar4Queijos() {
		
		return new Pasta4Queijos();
	}


	public Pasta cozinharFrango() {
		
		return new PastaFrango();
	}


	
}



