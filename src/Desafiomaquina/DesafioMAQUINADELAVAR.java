/**
 * 
 */
package Desafiomaquina;

import java.util.Scanner;

/**
 * @author Key
 *
 */
public class DesafioMAQUINADELAVAR {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);{
			
		
		String mod = "";
		String nome = "";
		int kg = 0;
		int volt = 0;
		int opcao;
		double lavPesada = 0;
		double lavNormal = 0;
		double lavLeve = 0;
		double lavEnxague = 0;
		double lavCentrifugacao = 0;
		int estagio1 = 0, estagio2 = 0, estagio3 = 0, estagio4 = 0, estagio5 = 0;
		int tempo1 = 0, tempo2 = 0, tempo3 = 0, tempo4 = 0, tempo5 = 0;
	

		do {
			System.out.println("======================================");
			System.out.println("     MENU DE SIMULACAO - MAQUINA    ");
			System.out.println("======================================");
			System.out.println("                                      ");
			System.out.println("1 - Configurar a maquina de lavar");
			System.out.println("2 - Simular a maquina de lavar");
			System.out.println("0 - Sair");
			System.out.println("Digite a opcao desejada:");
			opcao= teclado.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("======================================");
				System.out.println("  CONFIGURAÇÃO DA MAQUINA DE LAVAR");
				System.out.println("======================================");
				System.out.println("                                      ");
				System.out.println("Digite o Modelo da Maquina:");
				mod = teclado.nextLine();
				mod = teclado.nextLine();
				
				System.out.println("Digite o Nome da Maquina:");
				nome = teclado.nextLine();
				
				System.out.println("Voltagem: (220v ou 110v): ");
				volt = teclado.nextInt();
				
				System.out.println("Escolha o Modelo da Máquina (kg): 5, 7, 10 ou 15");
				kg = teclado.nextInt();
				if (kg == 5) {
					kg = 5;
				} else if (kg == 7) {
					kg = 7;
				}else if (kg == 10) {
					kg = 10;
				}else if (kg == 15) {
					kg = 15;
				}
			
				System.out.println("Modelo escolhido: " + mod +" " +nome+" "  +kg+ "kg" + "  "  + volt+  "volt");
				
				
				System.out.println("Digite o Tempo de lavacao:");					
				System.out.println("                                      ");
				System.out.println("Tempo do Estagio 1 - Lavacao Pesada:");
				estagio1 = teclado.nextInt();
				tempo1 = (estagio1*1000)/5;
				System.out.println("Tempo do Estagio 2 - Lavacao Normal:");
				estagio2 = teclado.nextInt();
				tempo2 = (estagio2*1000)/5;
				System.out.println("Tempo do Estagio 3 - Lavacao Leve:");
				estagio3 = teclado.nextInt();
				tempo3 = (estagio3*1000)/5;
				System.out.println("Tempo do Estagio 4 - Enxague:");
				estagio4 = teclado.nextInt();
				tempo4 = (estagio4*1000)/5;
				System.out.println("Tempo do Estagio 5 - Centrifugacao:");
				estagio5 = teclado.nextInt();
				tempo5 = (estagio5*1000)/5;
				break;
			}
			case 2: {
					if (kg == 5 || kg == 7 || kg == 10 || kg == 15) {
					if (volt == 110 || volt == 220) {
					System.out.println("======================================");
					System.out.println("  SIMULACAO DA MAQUINA DE LAVAR");
					System.out.println("======================================");
					System.out.println("                                      ");
					System.out.println("Simulando o Modelo: " + mod +" - Top " + kg + "kg - " + "Voltagem:" + volt);
					System.out.println("                                      ");
					System.out.println("======================================");
					System.out.println("  QUAL ESTAGIO VOCÊ DESEJA COMECAR?");
					System.out.println("======================================");
					System.out.println("1 - Lavacao Pesada");
					System.out.println("2 - Lavacao Normal");
					System.out.println("3 - Lavacao Leve");
					System.out.println("4 - Enxague");
					System.out.println("5 - Centrifuga");
					System.out.println("Digite o ciclo que deseja comecar:");
					int est = teclado.nextInt();
					
					switch (est) {
					case 1: {
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavPesada = lavPesada + 20;
							System.out.println("Estagio 1 - Em Lavacao Pesada: " + lavPesada + "%");														
							Thread.sleep(tempo1);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavNormal = lavNormal + 20;
							System.out.println("Estagio 2 - Em Lavacao Normal: " + lavNormal + "%");							
							Thread.sleep(tempo2);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavLeve = lavLeve + 20;
							System.out.println("Estagio 3 - Em Lavacao Leve: " + lavLeve + "%");							
							Thread.sleep(tempo3);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavEnxague = lavEnxague + 20;
							System.out.println("Estagio 4 - Em Enxague " + lavEnxague + "%");							
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavCentrifugacao = lavCentrifugacao + 20;
							System.out.println("Estagio 5 - Em Centrifugacao: " + lavCentrifugacao + "%");							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simulacao Finalizada");
						break;
					}
					
					case 2: {
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavNormal = lavNormal + 20;
							System.out.println("Estagio 2 - Em Lavacao Normal: " + lavNormal + "%");
							Thread.sleep(tempo2);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavLeve = lavLeve + 20;
							System.out.println("Estagio 3 - Em Lavacao Leve: " + lavLeve + "%");
							
							Thread.sleep(tempo3);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavEnxague = lavEnxague + 20;
							System.out.println("Estagio 4 - Em Enxague " + lavEnxague + "%");
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavCentrifugacao = lavCentrifugacao + 20;
							System.out.println("Estagio 5 - Em Centrifuga: " + lavCentrifugacao + "%");
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simulacao Finalizada");
						break;
						
					}
					case 3: {
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavLeve = lavLeve + 20;
							System.out.println("Estagio 3 - Em Lavacao Leve: " + lavLeve + "%");
							Thread.sleep(tempo3);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavEnxague = lavEnxague + 20;
							System.out.println("Estagio 4 - Em Enxague " + lavEnxague + "%");
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavCentrifugacao = lavCentrifugacao + 20;
							System.out.println("Estagio 5 - Em Centrifuga: " + lavCentrifugacao + "%");
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simulacao Finalizada");
						break;
						
					}
					case 4: {
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavEnxague = lavEnxague + 20;
							System.out.println("Estagio 4 - Em Enxague " + lavEnxague + "%");
							Thread.sleep(tempo4);
						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavCentrifugacao = lavCentrifugacao + 20;
							System.out.println("Estagio 5 - Em Centrifuga: " + lavCentrifugacao + "%");
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simulacao Finalizada!");
						break;
						
					}
					case 5: {						
						lavCentrifugacao = 0;						
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavCentrifugacao = lavCentrifugacao + 20;
							System.out.println("Estagio 5 - Em Centrifuga: " + lavCentrifugacao + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simulacao Finalizada!");
						System.out.println("                                      ");
						break;
					}						
					
							            }
			        } 
			        System.out.println("Ate logo..."
			        		+ "");
					}else {
						System.out.println("                            ");
						System.out.println("                            ");
						System.out.println("Escolha uma maquina da lista");
						System.out.println("                            ");
						System.out.println("                            ");
					}
			}
			}
		}while (opcao !=0); 
		System.out.println("                            ");
		System.out.println("                            ");
		System.out.println("Finalizado!");
		System.out.println("                            ");
		System.out.println("                            ");
		}
	}
}

	

	
		
		
		
	

				
		
		

		
			

		
	
		
	


	




