package escalas.calculo.temperatura;

//Classe da escala de temperatura Kelvin
public class KelvinClass {

	// Calculo de Kelvin para Celsius
	public int converterKelvinParaCelsius(int valorKelvin) {
		int resultadoCelsius = 0;
		
		if(valorKelvin < 0) {
			resultadoCelsius = valorKelvin + 273;
		} else if (valorKelvin > 0) {
			resultadoCelsius = - valorKelvin + 273;
		}
		
		if(resultadoCelsius < 273) {
			resultadoCelsius *= -1;
		} else if (resultadoCelsius > 273) {
			resultadoCelsius *= +1;
		}
		
		return resultadoCelsius;
	}

	// calculo de Kelvin para Fahrenheit
	public int converterKelvinParaFahrenheit(int valorKelvin) {
		int valorAuxi = ((valorKelvin - 273) / 5) * 9;
		int resultadoFahrenheit = 0;

		if (valorAuxi < 0) {
			resultadoFahrenheit = 32 - valorAuxi;
		} else if (valorAuxi > 0) {
			resultadoFahrenheit = 32 + valorAuxi;
		}

		return resultadoFahrenheit;
	}

}
