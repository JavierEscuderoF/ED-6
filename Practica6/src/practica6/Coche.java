package practica6;

public class Coche {
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String m) {
		matricula = m;
	}

	public String getCombustible(){
		return combustible;
	}

	public void setCombustible(String c){
		combustible = c;
	}	

	public String getModelo(){
		return modelo;
	}

	public void setModelo(String mo){
		modelo = mo;
	}

	public String getFabricante(){
		return fabricante;
	}

	public void setFabricante(String f){
		fabricante = f;
	}
	
	static final double CONSTANTE_CONSUMO_GASOLINA = 1.337;

	static final double CONSTANTE_CONSUMO_DIESEL = 1.052;

	public String gasolina()
	{
		String resultadoGasolina = "";
		if(combustible == "Gasolina")
		{
			String modelo = "Corsa";
			String fabricante = "Opel";
			System.out.println("es un " + modelo + fabricante + " y gasta " + CONSTANTE_CONSUMO_GASOLINA + " euros por litro.");
		}
		return resultadoGasolina;
	}

	public String diesel()
	{
		String resultadoDiesel = "";
		if(combustible == "Diesel")
		{
			String modelo = "Ibiza";
			String fabricante = "Seat";
			System.out.println("es un " + modelo + fabricante + " y gasta " + CONSTANTE_CONSUMO_DIESEL + " euros por litro.");
		}
		return resultadoDiesel;
	}

	public String hibrido()
	{
		String resultadoHibrido = "";
		if(combustible == "Híbrido")
		{
			String modelo = "Ibiza";
			String fabricante = "Seat";
			System.out.println("es un " + modelo + fabricante + " y no necesita combustible.");
		}
		return resultadoHibrido;
	}
	
	public String consultaCoche() {
		String resultado = "";
		if (combustible == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += gasolina();
		} else if (combustible == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += diesel();
		} else if (combustible == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += hibrido();
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}


}