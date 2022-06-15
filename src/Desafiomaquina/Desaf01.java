/**
 * 
 */
package Desafiomaquina;

/**
 * @author Key
 *
 */
public class Desaf01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int cod;
		double lavP = 0;
		double lavN = 0;
		double lavR = 0;
		double lavE = 0;
		double lavC = 0;
		int nome = 0, est1 = 0, est2 = 0, est3 = 0, est4 = 0, est5 = 0;
		int volt = 0, tempo1 = 0, tempo2 = 0, tempo3 = 0, tempo4 = 0, tempo5 = 0;
		int kg = 0;
		double agua = 0;
		String marca = "";


		do {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("     MENU DE SIMULAÇÃO - MÁQUINA    ");
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("                                      ");
			System.out.println("1 - Configurar a máquina de lavar");
			System.out.println("2 - Simular a máquina de lavar");
			System.out.println("0 - Sair");
			System.out.println("Digite o código:");
			cod = teclado.nextInt();

			switch (cod) {
			case 1: {
				System.out.println("======================================");
				System.out.println("  CONFIGURAÇÃO DA MÁQUINA DE LAVAR");
				System.out.println("======================================");
				System.out.println("                                      ");
				System.out.println("Digite a Marca da Máquina:");
				marca = teclado.nextLine();
				marca = teclado.nextLine();
				
				System.out.println("Voltagem: (220v ou 110v): ");
				volt = teclado.nextInt();
				
				System.out.println("Escolha o Modelo da Máquina (kg): 5, 7, 10 ou 15");
				nome = teclado.nextInt();
				if (nome == 5) {
					kg = 5;
				} else if (nome == 7) {
					kg = 7;
				}else if (nome == 10) {
					kg = 10;
				}else if (nome == 15) {
					kg = 15;
				}
				
				System.out.println("Modelo escolhido: " + marca +" "  +kg +" "+ volt);
									
				System.out.println("                                      ");
				System.out.println("Duração do Estágio 1 - Lavação Pesada:");
				est1 = teclado.nextInt();
				tempo1 = (est1*1000)/5;
				System.out.println("Duração do Estágio 2 - Lavação Normal:");
				est2 = teclado.nextInt();
				tempo2 = (est2*1000)/5;
				System.out.println("Duração do Estágio 3 - Lavação Rápida:");
				est3 = teclado.nextInt();
				tempo3 = (est3*1000)/5;
				System.out.println("Duração do Estágio 4 - Enxague:");
				est4 = teclado.nextInt();
				tempo4 = (est4*1000)/5;
				System.out.println("Duração do Estágio 5 - Centrifuga:");
				est5 = teclado.nextInt();
				tempo5 = (est5*1000)/5;
				break;
			}
			case 2: {
				if (nome == 5 || nome == 7 || nome == 10 || nome == 15) {
					if (volt == 110 || volt == 220) {
					System.out.println("======================================");
					System.out.println("  SIMULAÇÃO DA MAQUINA DE LAVAR");
					System.out.println("======================================");
					System.out.println("                                      ");
					System.out.println("Simulando o Modelo: "+marca+" - Top " + nome + "kg - " + kg + "kg - Voltagem: " + volt);
					System.out.println("                                      ");
					System.out.println("======================================");
					System.out.println("  QUAL ESTÁGIO VOCÊ DESEJA COMEÇAR?");
					System.out.println("======================================");
					System.out.println("1 - Lavação Pesada");
					System.out.println("2 - Lavação Normal");
					System.out.println("3 - Lavação Leve");
					System.out.println("4 - Enxague");
					System.out.println("5 - Centrifuga");
					System.out.println("Selecione o estágio inicial:");
					int est = teclado.nextInt();
					switch (est) {

					case 1: {
						for (int i = 0; i < 5; i++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com Água: " + agua + "%");							
							Thread.sleep(1000);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavP = lavP + 20;
							System.out.println("Estágio 1 - Em Lavação Pesada: " + lavP + "%");														
							Thread.sleep(tempo1);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavN = lavN + 20;
							System.out.println("Estágio 2 - Em Lavação Normal: " + lavN + "%");							
							Thread.sleep(tempo2);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavR = lavR + 20;
							System.out.println("Estágio 3 - Em Lavação Leve: " + lavR + "%");							
							Thread.sleep(tempo3);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavE = lavE + 20;
							System.out.println("Estágio 4 - Em Enxague " + lavE + "%");							
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavC = lavC + 20;
							System.out.println("Estágio 5 - Em Centrifuga: " + lavC + "%");							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simulação Finalizada");
						break;
					}
					case 2: {
						lavN = 0;
						lavR = 0;
						lavE = 0;
						lavC = 0;
						agua = 0;
						for (int i = 0; i < 5; i++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com Água: " + agua + "%");
							Thread.sleep(1000);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavN = lavN + 20;
							System.out.println("Estágio 2 - Em Lavação Normal: " + lavN + "%");
							
							Thread.sleep(tempo2);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavR = lavR + 20;
							System.out.println("Estágio 3 - Em Lavação Leve: " + lavR + "%");
							
							Thread.sleep(tempo3);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavE = lavE + 20;
							System.out.println("Estágio 4 - Em Enxague " + lavE + "%");
							
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavC = lavC + 20;
							System.out.println("Estágio 5 - Em Centrifuga: " + lavC + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simulação Finalizada");
						break;
					}
					case 3: {
						lavR = 0;
						lavE = 0;
						lavC = 0;
						agua = 0;
						for (int i = 0; i < 5; i++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com Água: " + agua + "%");
							Thread.sleep(1000);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavR = lavR + 20;
							System.out.println("Estágio 3 - Em Lavação Leve: " + lavR + "%");
							
							Thread.sleep(tempo3);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavE = lavE + 20;
							System.out.println("Estágio 4 - Em Enxague " + lavE + "%");
							
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavC = lavC + 20;
							System.out.println("Estágio 5 - Em Centrifuga: " + lavC + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simulação Finalizada");
						break;
					}
					case 4: {
						lavE = 0;
						lavC = 0;
						agua = 0;
						for (int i = 0; i < 5; i++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com Água: " + agua + "%");
							Thread.sleep(1000);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavE = lavE + 20;
							System.out.println("Estágio 4 - Em Enxague " + lavE + "%");
							
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavC = lavC + 20;
							System.out.println("Estágio 5 - Em Centrifuga: " + lavC + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simulação Finalizada");
						break;
					}
					case 5: {						
						lavC = 0;						
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavC = lavC + 20;
							System.out.println("Estágio 5 - Em Centrifuga: " + lavC + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simulação Finalizada");
						System.out.println("                                      ");
						break;
					}
					}
					break;
					} else {
						System.out.println("                                      ");
						System.out.println("                                      ");
						System.out.println("!!!!Escolha Máquina do catálago!!!!");
						System.out.println("                                      ");
						System.out.println("                                      ");
					}
				} else{
					System.out.println("                                      ");
					System.out.println("                                      ");
					System.out.println("!!!!Escolha Máquina do catálago!!!!");
					System.out.println("                                      ");
					System.out.println("                                      ");
				}								
				}				
			}		
		} while (cod != 0);
		System.out.println("Programa Finalizado!");
	}


}




		
		
	
