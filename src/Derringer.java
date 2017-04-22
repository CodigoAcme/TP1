
public class Derringer extends Arma{
	
	private int cantidadDisparos;

	public Derringer(){
		
		this.capacidad = 2;
		this.municion = 2;
		this.alcance = 1.5;
		this.daño = 1;
		this.tiempoDeRecarga = 0;
		this.cantidadDisparos = 8;
		
	}
	
	public int getCantidadDisparos(){
		return this.cantidadDisparos;
	}
	
	public void recarga(Personaje recargando){
		this.cantidadDisparos-= this.capacidad;
		if(cantidadDisparos == 0){
			recargando.nombreArma = "";
		}
		municion = capacidad;
	}
	
}
