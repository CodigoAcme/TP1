package dominio;

import java.util.LinkedList;
/**Clase Alianza. Se ocupa de formar un lista de aliados y 
 * se le asigna un nombre representavo
 */
public class Alianza {

	String nombre; df
	LinkedList<Personaje> aliados;

	public Alianza(String nombre) {
		this.nombre = nombre;sad
		this.aliados = new LinkedList <Personaje>();
	}

	public LinkedList<Personaje> getAliados() {
		return aliados;
	}

	public void setAliados(LinkedList<Personaje> aliados) {
		this.aliados = aliados;
	}

	public String obtenerNombre(){
		return nombre;
	}
	/**Método eliminarPersonaje.
	 * @param pj es el personaje que eliminaremos de nuestra Alianza.
	 */
	public void eliminarPersonaje(Personaje pj){
		aliados.remove(pj);
	}
	/**Método añadirPersonaje.
	 * @param pj es el personaje que se unirá a una Alianza.
	 */
	public void aÃ±adirPersonaje(Personaje pj){
		aliados.add(pj);
	}
}
