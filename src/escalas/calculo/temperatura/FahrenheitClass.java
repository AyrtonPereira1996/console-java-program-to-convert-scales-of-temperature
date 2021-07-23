package escalas.calculo.temperatura;

//Classe da escala de temperatura Fahrenheit
public class FahrenheitClass {
	
	// calculo de Fahrenheit para celcius
	public int converterFahrenheitParaCelcius(int valorFahrenheit) {
		int fahrenheit = valorFahrenheit;
		int resultadoCelcius = (((fahrenheit-32)/9)*5);
		
		return resultadoCelcius;
	}
	
	// calculo de Fahrenheit para Kelvin 
	public int converterKelvinParaFahrenheit(int valorFahrenheit) {
		int fahrenheit = valorFahrenheit;	
		int valorAuxi = ((valorFahrenheit - 32)/9)*5;
		int resultadoKelvin = 0;
		
		if (valorAuxi < 0) {
		resultadoKelvin = 273 - valorAuxi;	
		} else if (valorAuxi > 0) {
			resultadoKelvin = 273 + valorAuxi;
		}
			
		return resultadoKelvin;
	}
}
