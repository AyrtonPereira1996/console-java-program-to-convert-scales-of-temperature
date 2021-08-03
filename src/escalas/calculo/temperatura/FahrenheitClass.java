package escalas.calculo.temperatura;

//Classe da escala de temperatura Fahrenheit
public class FahrenheitClass {

	// calculo de Fahrenheit para celcius
	public int converterFahrenheitParaCelcius(int valorFahrenheit) {
		int valorAuxi = ((valorFahrenheit - 32) / 9) * 5;
		int resultadoCelcius = valorAuxi;

		return resultadoCelcius;
	}

	// calculo de Fahrenheit para Kelvin
	public int converterFahrenheitParaKelvin(int valorFahrenheit) {
		int resultadoKelvin = 0;
		int valorAuxi = ((valorFahrenheit - 32) / 9) * 5;
		
		if (valorAuxi < 0) {
			resultadoKelvin = valorAuxi - 273;
		} else if (valorAuxi > 0) {
			resultadoKelvin = -valorAuxi - 273;
		}

		return resultadoKelvin;
	}
}
