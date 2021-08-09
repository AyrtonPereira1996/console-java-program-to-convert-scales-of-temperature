package main.calculo.temperatura;

import java.util.Scanner;

import escalas.calculo.temperatura.CelciusClass;
import escalas.calculo.temperatura.FahrenheitClass;
import escalas.calculo.temperatura.KelvinClass;

public class CalculoEscalasApplication {

	// Metodo constructor da classe CalculoEscalasApplication
	public CalculoEscalasApplication() {
	
		// Instancias das classes de escalas de temperatura
		CelciusClass escalaCelsius = new CelciusClass();
		FahrenheitClass escalaFahrenheit = new FahrenheitClass();
		KelvinClass escalaKelvin = new KelvinClass();
		
		// Variaveis que serao usadas ao longo do programa para receber valores a serem convertidos
		int valorCelsius;
		int valorKelvin;
		int valorFahrenheit;
		int valorFahrenheitConvertido;
		int valorCelsiusConvertido;
		int valorKelvinConvertido;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("------- Bem-vindo -------");
		System.out.println("Programa para cálculo de escalas de temperatura! \nAqui poderás fazer o cálculo das três escalas de temperatura -> Celsius, Kelvin e Fahrenheit");
		
		System.out.println("-------------------------");
		
		System.out.println("\nEscolha a escala para converter de seguida pressione|ENTER|!(EX. 1)\n1.Celsius\n2.Kelvin\n3.Fahrenheit");
		System.out.print("Sua resposta:");
		int respOpcao = entrada.nextInt();
		System.out.println("-------------------------");
		
		switch (respOpcao) {
		
		case 1:
			System.out.println("Escolha a conversão que deseja");
			System.out.println("1.Celcius -> Fahrenheit \n2.Celcius -> Kelvin ");
			System.out.print("Sua resposta:");
			int respConversao = entrada.nextInt();
			
			switch (respConversao) {
			case 1:
				System.out.println("-------------------------");
				System.out.print("Será feita conversão de Celsius para Fahrenheit\nIntroduza a temperatura em celsius: ");
				valorCelsius = entrada.nextInt();
				valorFahrenheitConvertido = escalaCelsius.converterCelciusParaFahrenheit(valorCelsius);
				System.out.print("Celsius: " + valorCelsius + "º\nFahrenheit: " + valorFahrenheitConvertido);
				
				break;
				
			case 2:
				System.out.println("-------------------------");
				System.out.print("Será feita conversão de Celsius para Fahrenheit\nIntroduza a temperatura em celsius: ");
				valorCelsius = entrada.nextInt();
				valorKelvinConvertido = escalaCelsius.converterCelciusParaKelvin(valorCelsius);
				System.out.print("Celsius: " + valorCelsius + "º\nKelvin: " + valorKelvinConvertido);
				
				break;

			default:
				System.err.println("Escolha inválida. O que pretende fazer?\n");
				System.out.println("1.Voltar ao menu de conversões de celsius\n2.Voltar ao menu inicial\n3.Sair do programa");
				respConversao = entrada.nextInt();
				switch (respConversao) {
				case 1:
					// permitira ir ao menu para escolher que tipo de conversao quer
					break;
				case 2:
					//permitira ir ao menu inicial para escolher que tipo de escala
					break;
					
				case 3:
					// temrinaa o programa
					break;
				default:
					System.err.println("Resposta incorrecta. Abandonando o programa");
					break;
				}
				
				break;
			}
			break;
		
		case 2:
			System.out.println("Escolha a conversão que deseja");
			System.out.println("1.Kelvin -> Celsius \n2.Kelvin -> Fahrenheit ");
			break;
			
		case 3:
			System.out.println("Escolha a conversão que deseja");
			System.out.println("1.Fahrenheit -> Celsius \n2.Fahrenheit -> Kelvin ");
			break;

		default:
			break;
		}
		
	}
}
