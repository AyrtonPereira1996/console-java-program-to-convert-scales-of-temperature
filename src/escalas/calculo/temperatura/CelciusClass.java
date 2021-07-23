package escalas.calculo.temperatura;

//Classe da escala de temperatura Celcius
public class CelciusClass {
	
	//Calculo de Celcius para Fahrenheit
	public int converterCelciusParaFahrenheit(int valorCelcius) {
		int celcius = valorCelcius;
		int valorAuxi = (celcius/5)*9;
		int resultadoFahrenheit = - valorAuxi - (32/9);
		
		return resultadoFahrenheit;		
		
	}
	
	//Calculo de Celcius para Kelvin
	public int converterCelciusParaKelvin(int valorCelcius) {
		int celcius = valorCelcius;
		int resultadoKelvin = celcius + 273;
		
		return resultadoKelvin;
	}
	
	

}
