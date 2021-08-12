package escalas.calculo.temperatura;

//Classe da escala de temperatura Fahrenheit
public class FahrenheitClass {

	// calculo de Fahrenheit para celcius
	public int converterFahrenheitParaCelcius(int valorFahrenheit) {
		int resultadoCelcius = (valorFahrenheit - 32) * 5/9;

		return resultadoCelcius;
	}

	// calculo de Fahrenheit para Kelvin
	public int converterFahrenheitParaKelvin(int valorFahrenheit) {
		int resultadoKelvin = (int) (valorFahrenheit + 459.67) * 5/9;

		return resultadoKelvin;
	}
}
