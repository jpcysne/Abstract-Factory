package br.unifor.massa;

import br.unifor.lasanha.Lasanha;
import br.unifor.pasta.Pasta;

public abstract class MenuEspecialFactory {
	
	public abstract Lasanha cozinharLasanhaFrango();

	public abstract Lasanha cozinharLasanha4Queijos();
	
	public abstract Lasanha cozinharLasanhaBolonhesa();
	
	public abstract Pasta cozinharPastaBolonhesa();


}
