package main.calculo.temperatura;

import java.util.Scanner;

import escalas.calculo.temperatura.CelciusClass;
import escalas.calculo.temperatura.FahrenheitClass;
import escalas.calculo.temperatura.KelvinClass;

public class CalculoEscalasApplication {

//	Metodo constructor da classe CalculoEscalasApplication
	public CalculoEscalasApplication() {

//	Instancias das classes de escalas de temperatura
		CelciusClass escalaCelsius = new CelciusClass();
		FahrenheitClass escalaFahrenheit = new FahrenheitClass();
		KelvinClass escalaKelvin = new KelvinClass();

//		 Variaveis que serao usadas ao longo do programa para receber valores a serem
//		 convertidos  e entradas para opcoes
		int valorCelsius;
		int valorKelvin;
		int valorFahrenheit;
		int valorFahrenheitConvertido;
		int valorCelsiusConvertido;
		int valorKelvinConvertido;
		int respOpcao;
		int respConversao;
		Scanner entrada = new Scanner(System.in);

		System.out.println("------- Bem-vindo -------");
		System.out.println(
				"Programa para cálculo de escalas de temperatura! \nAqui poderás fazer o cálculo das três escalas de temperatura -> Celsius, Kelvin e Fahrenheit");

		System.out.println("-------------------------");

		System.out.println(
				"\nEscolha a escala para converter de seguida pressione|ENTER|!(EX. 1)\n1.Celsius\n2.Kelvin\n3.Fahrenheit");
		System.out.print("Sua resposta:");
		respOpcao = entrada.nextInt();
		System.out.println("-------------------------");

		
		
//		Estrutura decisoria para escolha da escala para a conversão
		switch (respOpcao) {

		case 1:
			System.out.println("Escolha a conversão que deseja");
			System.out.println("1.Celcius -> Fahrenheit \n2.Celcius -> Kelvin ");
			System.out.print("Sua resposta:");
			respConversao = entrada.nextInt();
			
//			Estrutura decisoria interna para conversao de celcius para outras escalas
			switch (respConversao) {
			case 1:
				System.out.println("-------------------------");
				System.out
						.print("Será feita conversão de Celsius para Fahrenheit\nIntroduza a temperatura em celsius: ");
				valorCelsius = entrada.nextInt();
				valorFahrenheitConvertido = escalaCelsius.converterCelciusParaFahrenheit(valorCelsius);
				System.out.print("Celsius: " + valorCelsius + "º\nFahrenheit: " + valorFahrenheitConvertido);

				break;

			case 2:
				System.out.println("-------------------------");
				System.out.print("Será feita conversão de Celsius para Kelvin\nIntroduza a temperatura em celsius: ");
				valorCelsius = entrada.nextInt();
				valorKelvinConvertido = escalaCelsius.converterCelciusParaKelvin(valorCelsius);
				System.out.print("Celsius: " + valorCelsius + "º\nKelvin: " + valorKelvinConvertido);

				break;

			default:
				System.err.print("Escolha inválida. O que pretende fazer?\n");
				System.out.print(
						"1.Voltar ao menu de conversões de celsius\n2.Voltar ao menu inicial\n3.Sair do programa");
				respConversao = entrada.nextInt();
				switch (respConversao) {
				case 1:
//					 permitira ir ao menu para escolher que tipo de conversao quer
					break;
				case 2:
//					permitira ir ao menu inicial para escolher que tipo de escala
					break;

				case 3:
//					temrinaa o programa
					break;
				default:
					System.err.println("Resposta incorrecta. Abandonando o programa");
					break;
				}

				break;
			}
			break;

//			Estrutura decisoria interna para conversao de Kelvin para outras escalas
		case 2:
			System.out.println("Escolha a conversão que deseja");
			System.out.println("1.Kelvin -> Fahrenheit\n2.Kelvin -> Celsius");
			System.out.print("Sua resposta:");

			respConversao = entrada.nextInt();

			switch (respConversao) {
			case 1:
				System.out.println("-------------------------");
				System.out
						.print("Será feita conversão de Kelvin para Fahrenheit\nIntroduza a temperatura em Kelvin: ");
				valorKelvin = entrada.nextInt();
				valorFahrenheitConvertido = escalaKelvin.converterKelvinParaFahrenheit(valorKelvin);
				System.out.print("Kelvin: " + valorKelvin + "º\nFahrenheit: " + valorFahrenheitConvertido);

				break;

			case 2:
				System.out.println("-------------------------");
				System.out.print("Será feita conversão de Kelvin para Celsius\nIntroduza a temperatura em Kelvin: ");
				valorKelvin = entrada.nextInt();
				valorCelsiusConvertido = escalaKelvin.converterKelvinParaCelsius(valorKelvin);
				System.out.print("Kelvin: " + valorKelvin + "º\nCelsius: " + valorCelsiusConvertido);

				break;

			default:
				System.err.println("Escolha inválida. O que pretende fazer?\n");
				System.out.println(
						"1.Voltar ao menu de conversões de Kelvin\n2.Voltar ao menu inicial\n3.Sair do programa");
				respConversao = entrada.nextInt();
				switch (respConversao) {
				case 1:
					// permitira ir ao menu para escolher que tipo de conversao quer
					break;
				case 2:
					// permitira ir ao menu inicial para escolher que tipo de escala
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

		

//			Estrutura decisoria interna para conversao de Fahrenheit para outras escalas	
		case 3:
			System.out.println("Escolha a conversão que deseja");
			System.out.println("1.Fahrenheit -> Celsius \n2.Fahrenheit -> Kelvin ");
			System.out.print("Sua resposta:");
			respConversao = entrada.nextInt();

			switch (respConversao) {
			case 1:
				System.out.println("-------------------------");
				System.out
						.print("Será feita conversão de Fahrenheit para Celsius\nIntroduza a temperatura em Fahrenheit: ");
				valorFahrenheit = entrada.nextInt();
				valorCelsiusConvertido = escalaFahrenheit.converterFahrenheitParaCelcius(valorFahrenheit);
				System.out.print("Fahrenheit: " + valorFahrenheit + "º\nCelsius: " + valorCelsiusConvertido);

				break;

			case 2:
				System.out.println("-------------------------");
				System.out.print("Será feita conversão de Fahrenheit para Kelvin\nIntroduza a temperatura em Fahrenheit: ");
				valorFahrenheit = entrada.nextInt();
				valorKelvinConvertido = escalaFahrenheit.converterFahrenheitParaKelvin(valorFahrenheit);
				System.out.print("Celsius: " + valorFahrenheit + "º\nKelvin: " + valorKelvinConvertido);

				break;

			default:
				System.err.println("Escolha inválida. O que pretende fazer?\n");
				System.out.println(
						"1.Voltar ao menu de conversões de Fahrenheit\n2.Voltar ao menu inicial\n3.Sair do programa");
				respConversao = entrada.nextInt();
				switch (respConversao) {
				case 1:
					// permitira ir ao menu para escolher que tipo de conversao quer
					break;
				case 2:
					// permitira ir ao menu inicial para escolher que tipo de escala
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


		
		default:
			break;
		}

	}
}
