package escalas.calculo.temperatura;

//Classe da escala de temperatura Celcius
public class CelciusClass {
	
	//Calculo de Celcius para Fahrenheit
	public int converterCelciusParaFahrenheit(int valorCelcius) {
		int celcius = valorCelcius;
		int valorAuxi = (celcius/5)*9;
		int valorFahrenheit = - valorAuxi - ((-32/9)*1);
		
		return valorFahrenheit;		
		
	}
	
	

}
