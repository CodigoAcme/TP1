
public class Colt extends Arma{
	
	public Colt(){
			
		this.capacidad = 6;
		this.municion = 6;
		this.alcance = 10;
		this.daño = 2;
		this.tiempoDeRecarga = 0;
		
	}
	
	public void recarga(Personaje recargando){
		
		municion = capacidad;
		
	}

}
