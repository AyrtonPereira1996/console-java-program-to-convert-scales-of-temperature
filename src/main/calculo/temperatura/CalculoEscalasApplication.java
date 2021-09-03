package main.calculo.temperatura;

import java.util.Scanner;
import java.util.regex.Pattern;

import escalas.calculo.temperatura.CelciusClass;
import escalas.calculo.temperatura.FahrenheitClass;
import escalas.calculo.temperatura.KelvinClass;

public class CalculoEscalasApplication {

//	variaveis que responsaveis por controlar o fluxo do programa
	boolean repetirPrograma = false; // variavel que controla o programa como um todo
	boolean repetirConversao = false; // variavel que controla o programa realizar uma determinada conversao
	boolean repetirEscolhaConversaoEscalaEspecifica = false; // variavel que controla o acesso aos menus de cada escala

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
		String respOpcaoInteger;
		String respOpcaoString;
		int respConversao;
		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("------- Bem-vindo -------");
			System.out.println(
					"Programa para cálculo de escalas de temperatura! \nAqui poderás fazer o cálculo das três escalas de temperatura -> Celsius, Kelvin e Fahrenheit");

			System.out.println("-------------------------");
			System.out.println(
					"\nEscolha a escala para converter de seguida pressione|ENTER|!(EX. 1)\n1.Celsius\n2.Kelvin\n3.Fahrenheit");
			System.out.print("Sua resposta:");
			respOpcaoInteger = entrada.next();
			

			if (respOpcaoInteger.trim().equals("1") || respOpcaoInteger.trim().equals("2") || respOpcaoInteger.trim().equals("3")) {
//				Estrutura decisoria para escolha da escala para a conversão
				switch (respOpcaoInteger) {

				case "1":
					do {
						System.out.println("-------------------------");
						System.out.println("Escolha a conversão que deseja");
						System.out.println("1.Celcius -> Fahrenheit \n2.Celcius -> Kelvin ");
						System.out.print("Sua resposta:");
						respConversao = entrada.nextInt();

//									Estrutura decisoria interna para conversao de celcius para outras escalas
						switch (respConversao) {
						case 1:
							do {

								System.out.println("-------------------------");
								System.out.print(
										"Será feita conversão de Celsius para Fahrenheit\nIntroduza a temperatura em celsius: ");
								valorCelsius = entrada.nextInt();
								valorFahrenheitConvertido = escalaCelsius.converterCelciusParaFahrenheit(valorCelsius);
								System.out.print(
										"Celsius: " + valorCelsius + "º\nFahrenheit: " + valorFahrenheitConvertido);

								System.out.print("\n\nQuer converter de novamente? [S para sim e N para Não]");
								respOpcaoString = entrada.next();

								if (respOpcaoString.equalsIgnoreCase("s")) {
									repetirConversao = true;

								} else if (respOpcaoString.equalsIgnoreCase("n")) {
									System.out.println(
											"Deseja voltar ao menu de conversão de celsius para outras escalas? [S para sim e N para Não]");
									respOpcaoString = entrada.next();

									if (respOpcaoString.equalsIgnoreCase("s")) {
										repetirConversao = false;
										repetirEscolhaConversaoEscalaEspecifica = true;

									} else if (respOpcaoString.equalsIgnoreCase("n")) {
										System.out.println("Deseja voltar ao menu inicial? [S para sim e N para Não]");
										respOpcaoString = entrada.next();

										if (respOpcaoString.equalsIgnoreCase("s")) {
											repetirConversao = false;
											repetirEscolhaConversaoEscalaEspecifica = false;
										} else if (respOpcaoString.equalsIgnoreCase("n")) {
											System.out.println("O programa irá terminar");
											hasOver(true);
										}
									}

								}

							} while (repetirConversao == true);
							break;

						case 2:
							do {

								System.out.println("-------------------------");
								System.out.print(
										"Será feita conversão de Celsius para Kelvin\nIntroduza a temperatura em celsius: ");
								valorCelsius = entrada.nextInt();
								valorKelvinConvertido = escalaCelsius.converterCelciusParaKelvin(valorCelsius);
								System.out.print("Celsius: " + valorCelsius + "º\nKelvin: " + valorKelvinConvertido);
								System.out.print("\n\nQuer converter de novamente? [S para sim e N para Não]");
								respOpcaoString = entrada.next();

								if (respOpcaoString.equalsIgnoreCase("s")) {
									repetirConversao = true;

								} else if (respOpcaoString.equalsIgnoreCase("n")) {
									System.out.println(
											"Deseja voltar ao menu de conversão de kelvin para outras escalas? [S para sim e N para Não]");
									respOpcaoString = entrada.next();

									if (respOpcaoString.equalsIgnoreCase("s")) {
										repetirConversao = false;
										repetirEscolhaConversaoEscalaEspecifica = true;

									} else if (respOpcaoString.equalsIgnoreCase("n")) {
										System.out.println("Deseja voltar ao menu inicial? [S para sim e N para Não]");
										respOpcaoString = entrada.next();

										if (respOpcaoString.equalsIgnoreCase("s")) {
											repetirConversao = false;
											repetirEscolhaConversaoEscalaEspecifica = false;
										} else if (respOpcaoString.equalsIgnoreCase("n")) {
											System.out.println("O programa irá terminar");
											hasOver(true);
										}
									}

								}

							} while (repetirConversao == true);
							break;

						default:
							System.err.print("Escolha inválida.");
							hasOver(true);

							break;
						}

						;

					} while (repetirEscolhaConversaoEscalaEspecifica == true);

					break;

//					Estrutura decisoria interna para conversao de Kelvin para outras escalas
				case "2":
					do {
						System.out.println("-------------------------");
						System.out.println("Escolha a conversão que deseja");
						System.out.println("1.Kelvin -> Fahrenheit\n2.Kelvin -> Celsius");
						System.out.print("Sua resposta:");

						respConversao = entrada.nextInt();

						switch (respConversao) {
						case 1:
							do {

								System.out.println("-------------------------");
								System.out.print(
										"Será feita conversão de Kelvin para Fahrenheit\nIntroduza a temperatura em Kelvin: ");
								valorKelvin = entrada.nextInt();
								valorFahrenheitConvertido = escalaKelvin.converterKelvinParaFahrenheit(valorKelvin);
								System.out.print(
										"Kelvin: " + valorKelvin + "º\nFahrenheit: " + valorFahrenheitConvertido);

								System.out.print("\n\nQuer converter de novamente? [S para sim e N para Não]");
								respOpcaoString = entrada.next();

								if (respOpcaoString.equalsIgnoreCase("s")) {
									repetirConversao = true;

								} else if (respOpcaoString.equalsIgnoreCase("n")) {
									System.out.println(
											"Deseja voltar ao menu de conversão de kelvin para outras escalas? [S para sim e N para Não]");
									respOpcaoString = entrada.next();

									if (respOpcaoString.equalsIgnoreCase("s")) {
										repetirConversao = false;
										repetirEscolhaConversaoEscalaEspecifica = true;

									} else if (respOpcaoString.equalsIgnoreCase("n")) {
										System.out.println("Deseja voltar ao menu inicial? [S para sim e N para Não]");
										respOpcaoString = entrada.next();

										if (respOpcaoString.equalsIgnoreCase("s")) {
											repetirConversao = false;
											repetirEscolhaConversaoEscalaEspecifica = false;
										} else if (respOpcaoString.equalsIgnoreCase("n")) {
											System.out.println("O programa irá terminar");
											hasOver(true);
										}
									}

								}

							} while (repetirConversao == true);
							break;

						case 2:
							do {

								System.out.println("-------------------------");
								System.out.print(
										"Será feita conversão de Kelvin para Celsius\nIntroduza a temperatura em Kelvin: ");
								valorKelvin = entrada.nextInt();
								valorCelsiusConvertido = escalaKelvin.converterKelvinParaCelsius(valorKelvin);
								System.out.print("Kelvin: " + valorKelvin + "º\nCelsius: " + valorCelsiusConvertido);

								System.out.print("\n\nQuer converter de novamente? [S para sim e N para Não]");
								respOpcaoString = entrada.next();

								if (respOpcaoString.equalsIgnoreCase("s")) {
									repetirConversao = true;

								} else if (respOpcaoString.equalsIgnoreCase("n")) {
									System.out.println(
											"Deseja voltar ao menu de conversão de celsius para outras escalas? [S para sim e N para Não]");
									respOpcaoString = entrada.next();

									if (respOpcaoString.equalsIgnoreCase("s")) {
										repetirConversao = false;
										repetirEscolhaConversaoEscalaEspecifica = true;

									} else if (respOpcaoString.equalsIgnoreCase("n")) {
										System.out.println("Deseja voltar ao menu inicial? [S para sim e N para Não]");
										respOpcaoString = entrada.next();

										if (respOpcaoString.equalsIgnoreCase("s")) {
											repetirConversao = false;
											repetirEscolhaConversaoEscalaEspecifica = false;
										} else if (respOpcaoString.equalsIgnoreCase("n")) {
											System.out.println("O programa irá terminar");
											hasOver(true);
										}
									}

								}

							} while (repetirConversao == true);
							break;

						default:
							System.err.println("Escolha inválida.");
							hasOver(true);
							break;
						}
					} while (repetirEscolhaConversaoEscalaEspecifica == true);
					break;

//					Estrutura decisoria interna para conversao de Fahrenheit para outras escalas	
				case "3":
					do {
						System.out.println("-------------------------");
						System.out.println("Escolha a conversão que deseja");
						System.out.println("1.Fahrenheit -> Celsius \n2.Fahrenheit -> Kelvin ");
						System.out.print("Sua resposta:");
						respConversao = entrada.nextInt();

						switch (respConversao) {
						case 1:
							do {

								System.out.println("-------------------------");
								System.out.print(
										"Será feita conversão de Fahrenheit para Celsius\nIntroduza a temperatura em Fahrenheit: ");
								valorFahrenheit = entrada.nextInt();
								valorCelsiusConvertido = escalaFahrenheit
										.converterFahrenheitParaCelcius(valorFahrenheit);
								System.out.print(
										"Fahrenheit: " + valorFahrenheit + "º\nCelsius: " + valorCelsiusConvertido);

								System.out.print("\n\nQuer converter de novamente? [S para sim e N para Não]");
								respOpcaoString = entrada.next();

								if (respOpcaoString.equalsIgnoreCase("s")) {
									repetirConversao = true;

								} else if (respOpcaoString.equalsIgnoreCase("n")) {
									System.out.println(
											"Deseja voltar ao menu de conversão de Fahrenheit para outras escalas? [S para sim e N para Não]");
									respOpcaoString = entrada.next();

									if (respOpcaoString.equalsIgnoreCase("s")) {
										repetirConversao = false;
										repetirEscolhaConversaoEscalaEspecifica = true;

									} else if (respOpcaoString.equalsIgnoreCase("n")) {
										System.out.println("Deseja voltar ao menu inicial? [S para sim e N para Não]");
										respOpcaoString = entrada.next();

										if (respOpcaoString.equalsIgnoreCase("s")) {
											repetirConversao = false;
											repetirEscolhaConversaoEscalaEspecifica = false;
										} else if (respOpcaoString.equalsIgnoreCase("n")) {
											System.out.println("O programa irá terminar");
											hasOver(true);
										}
									}

								}

							} while (repetirConversao == true);
							break;

						case 2:

							do {
								System.out.println("-------------------------");
								System.out.print(
										"Será feita conversão de Fahrenheit para Kelvin\nIntroduza a temperatura em Fahrenheit: ");
								valorFahrenheit = entrada.nextInt();
								valorKelvinConvertido = escalaFahrenheit.converterFahrenheitParaKelvin(valorFahrenheit);
								System.out.print("Celsius: " + valorFahrenheit + "º\nKelvin: " + valorKelvinConvertido);

								System.out.print("\n\nQuer converter de novamente? [S para sim e N para Não]");
								respOpcaoString = entrada.next();

								if (respOpcaoString.equalsIgnoreCase("s")) {
									repetirConversao = true;

								} else if (respOpcaoString.equalsIgnoreCase("n")) {
									System.out.println(
											"Deseja voltar ao menu de conversão de Fahrenheit para outras escalas? [S para sim e N para Não]");
									respOpcaoString = entrada.next();

									if (respOpcaoString.equalsIgnoreCase("s")) {
										repetirConversao = false;
										repetirEscolhaConversaoEscalaEspecifica = true;

									} else if (respOpcaoString.equalsIgnoreCase("n")) {
										System.out.println("Deseja voltar ao menu inicial? [S para sim e N para Não]");
										respOpcaoString = entrada.next();

										if (respOpcaoString.equalsIgnoreCase("s")) {
											repetirConversao = false;
											repetirEscolhaConversaoEscalaEspecifica = false;
										} else if (respOpcaoString.equalsIgnoreCase("n")) {
											System.out.println("O programa irá terminar");
											hasOver(true);
										}
									}

								}

							} while (repetirConversao == true);
							break;

						default:
							System.err.println("Escolha inválida.");
							hasOver(true);
							break;
						}

					} while (repetirEscolhaConversaoEscalaEspecifica == true);
					break;

				default:
					System.out.println("Erro");
					break;
				}

			} else if (Pattern.matches("[a-zA-Z]+", respOpcaoInteger)) { //Verifica se a String respOpcaoInteger recebeu algum letra
				try {
					Thread.sleep(200);
					System.out.println("Resposta INCORRECTA! \n\nResponda 1 para Celsius, 2 para Kelvin e 3 para Fahrenheit!\n");
					
					System.out.println("O programa será reiniciado dentro de estantes! ");
					Thread.sleep(800);
					
					System.out.print("\n\nReiniciando o programa");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(" .");

						if (i == 2)
							System.out.print(" BYE!\n\n");
					}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				
			}

		} while (!repetirPrograma);

	}

//	Metodo que e chamado quando queremos terminar o programa
	private void hasOver(boolean answer) {
		if (answer == true) {

			try {
				Thread.sleep(800);
				repetirPrograma = true;

				System.out.print("\n\nSaindo do programa");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(500);
					System.out.print(" .");

					if (i == 2)
						System.out.print(" BYE!");
				}

			} catch (InterruptedException e) {
				System.err.println(e);

			}
			System.exit(0);
		} else if (answer == false) {
			repetirPrograma = false;
		}
	}
}