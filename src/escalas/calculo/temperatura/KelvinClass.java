package escalas.calculo.temperatura;

//Classe da escala de temperatura Kelvin
public class KelvinClass {
	
	//Calculo de Kelvin para Celsius
	public int converterKelvinParaCelsius(int valorKelvin) {
		int kelvin = valorKelvin;
		int resultadoCelsius = - kelvin + 273;
		
		return resultadoCelsius;
	}

}
