
public abstract class Arma {
	
	protected int daño;
	protected double alcance;
	protected int capacidad;
	protected int municion;
	protected int tiempoDeRecarga;
	
	public boolean dispara(Personaje dispara, Personaje disparado, double distanciaEnemigo){
		
		if(dispara.nombreArma.equals("")){
		
			if(distanciaEnemigo <= alcance){
				
				disparado.recibirDaño(daño);
				municion-=1;
				if(capacidad == 0){
					recarga(dispara);
				}
				return true;
				
			}
		}
		
		return false;
	}
	
	public abstract void recarga(Personaje recargando);

}


