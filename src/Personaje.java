
public abstract class Personaje {
	
	protected int salud;
	protected Arma arma;
	protected String nombreArma;
	protected int tiempoEspera;
	protected double posicion;
	
	public boolean ataca(Personaje atacado){
		
		if(tiempoEspera == 0){
			return arma.dispara(this, atacado, Math.abs(atacado.posicion-this.posicion));
		}
		else{
			this.tiempoEspera -= 1;
			return false;
		}
			
	}
	
	public void recibirDaño(int daño){
		
		salud-=daño;

	}
	
	public void obtenerArma(String arma){
		
		nombreArma = arma;
		if(arma.equals("Winchester"))
		{
			
			this.arma = new Winchester();
		
		}
		if(arma.equals("Derringer"))
		{
			
			this.arma = new Derringer();
		
		}
		if(arma.equals("Colt"))
		{
			
			this.arma = new Colt();
		
		}
		tiempoEspera = 0;
		
	}

	public int getTiempoEspera() {
		return tiempoEspera;
	}

	public void setTiempoEspera(int tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}

}
