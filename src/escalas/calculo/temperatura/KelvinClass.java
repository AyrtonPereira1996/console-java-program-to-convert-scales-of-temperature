package escalas.calculo.temperatura;

//Classe da escala de temperatura Kelvin
public class KelvinClass {

	// Calculo de Kelvin para Celsius
	public int converterKelvinParaCelsius(int valorKelvin) {
		int resultadoCelsius = (int) (valorKelvin - 273.15);
		
		return resultadoCelsius;
	}

	// calculo de Kelvin para Fahrenheit
	public int converterKelvinParaFahrenheit(int valorKelvin) {
		int resultadoFahrenheit = (int) (((valorKelvin * 9) / 5) - 459.67);

		return resultadoFahrenheit;
	}

}
