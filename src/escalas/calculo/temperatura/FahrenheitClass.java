package escalas.calculo.temperatura;

//Classe da escala de temperatura Fahrenheit
public class FahrenheitClass {
	
	// calculo de Fahrenheit para celcius
	public int converterFahrenheitParaCelcius(int valorFahrenheit) {
		int fahrenheit = valorFahrenheit;
		int resultadoCelcius = (((fahrenheit-32)/9)*5);
		
		return resultadoCelcius;
	}

}
