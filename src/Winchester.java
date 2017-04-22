
public class Winchester extends Arma{

	public Winchester(){
		
		this.capacidad = 2;
		this.municion = 2;
		this.alcance = 4;
		this.daño = 3;
		this.tiempoDeRecarga = 1;
		
	}
	
	public void recarga(Personaje recargando){
		
		municion = capacidad;
		recargando.tiempoEspera = tiempoDeRecarga;
		
	}
	
}
