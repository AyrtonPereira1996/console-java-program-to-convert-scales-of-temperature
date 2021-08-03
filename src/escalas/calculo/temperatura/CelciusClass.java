package escalas.calculo.temperatura;

//Classe da escala de temperatura Celcius
public class CelciusClass {

	// Calculo de Celcius para Fahrenheit
	public int converterCelciusParaFahrenheit(int valorCelcius) {
		int resultadoFahrenheit = 0;
		int valorAuxi = (valorCelcius / 5) * 9;

		if (valorAuxi < 0) {
			resultadoFahrenheit = valorAuxi - 32;
		} else if (valorAuxi > 0) {
			resultadoFahrenheit = -valorAuxi - 32;
		}

		return resultadoFahrenheit;

	}

	// Calculo de Celcius para Kelvin
	public int converterCelciusParaKelvin(int valorCelcius) {
		int resultadoKelvin = valorCelcius + 273;
		return resultadoKelvin;
	}

}
