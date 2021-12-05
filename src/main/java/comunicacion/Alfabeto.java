package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma {

	private static ArrayList<String> letras = new ArrayList<String>();
	private String interpretacion;
	
	public Alfabeto(String origen, ArrayList<String> letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.size();
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String str = "";
		for (int i=0; i<letras.size(); i++) {
			if (i == letras.size()-1) {
				str+=letras.get(i);
			}
			else {
				str+=letras.get(i) + ", ";
			}
		}
		return str;
	}

	public ArrayList<String> getLetras() {
		return letras;
	}

	public void setLetras(ArrayList<String> letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
		
}
