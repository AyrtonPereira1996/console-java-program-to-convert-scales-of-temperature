package escalas.calculo.temperatura;

//Classe da escala de temperatura Kelvin
public class KelvinClass {
	
	//Calculo de Kelvin para Celsius
	public int converterKelvinParaCelsius(int valorKelvin) {
		int kelvin = valorKelvin;
		int resultadoCelsius = - kelvin + 273;
		
		return resultadoCelsius;
	}
	
	// calculo de Kelvin para Fahrenheit 
	public int converterKelvinParaFahrenheit(int valorKelvin) {
		int kelvin = valorKelvin;	
		int valorAuxi = ((kelvin - 273)/5) * 9;
		int resultadoFahrenheit = 0;
		
		if(valorAuxi < 0) {
			resultadoFahrenheit = 32 - valorAuxi;
		} else if (valorAuxi > 0) {
			resultadoFahrenheit = 32 + valorAuxi;
		}
		
		return resultadoFahrenheit;
	}

}
