package Cancion;
/**
 * Clase para construir canciones y sus metodos
 * @author David
 * @version 1.0.2022
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores

	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	/**
	 * Es un costructor con los siguentes parametros:
	 * @param titulo
	 * @param duracion int seg
	 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
	/**
	 * Es un contructor con los siguientes parametros:
	 * @param titulo
	 * @param grupo
	 * @param duracion int seg
	 * @param sonando true or false
	 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
	/**
	 * Es un metodo que nos reproduce una cancion
	 * @return nos devuelve si una cancion esta reproduciondose o no
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
	/**
	 * Es un metodo que para la cancion y se deja de reproducir
	 * @return nos devuelve si la cancion esta parada o no
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
	/**
	 * Es un metodo en el cual le pasas una cancion y te dice si es la misma que otra
	 * @param cancion
	 * @return Nos devuelve si la cancion es la misma que otra
	 */
	
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
 /**
  * Es un metodo al que le pasamos un array de canciones
  * @param canciones
  * @return nos devuelve cual es la mas larga
  */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	/**
	 * Es un metodo al que le pasamos un array de canciones y un titulo
	 * @param canciones
	 * @param titulo
	 * @return Nos cambia a la siguiente cancion del array
	 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override 
	public String toString() { 
	return "Datos de la canción [titulo=" + titulo + ", autor=" +  grupo + ", duracion=" + duracion + ", sonando=" + sonando 
	+ "]"; 
	}

}
