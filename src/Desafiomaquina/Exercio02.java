/**
 * 
 */
package Desafiomaquina;

import java.util.Scanner;

/**
 * @author Key
 *
 */
public class Exercio02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);{

        int matricula = -1;
        float pesoMaior = 0;
        int matriculaPesoMaior = 0;
        int quantidadeMulheres = 0;
        float mediaIdadeMulheres = 0;
        int totalIdadeMulheres = 0;
        float pesoMenor = 100000;
        int matriculaPesoMenor = 0;
       
        while (matricula != 0) {
           
           
                System.out.println("Digite a matricula");
                matricula = teclado.nextInt();
               
            if (matricula != 0) {
               
                System.out.println("Digite o nome");
                String nome = teclado.nextLine();
                nome = teclado.nextLine();
               
                System.out.println("Digite o peso");
                float peso = teclado.nextFloat();
               
                System.out.println("Digite a idade");
                int idade = teclado.nextInt();
               
                System.out.println("Digite o sexo");
                String sexo = teclado.nextLine();
                sexo = teclado.nextLine();
               
                //letra a
                if (peso > pesoMaior) {
                    pesoMaior = peso;
                    matriculaPesoMaior = matricula;
                }
               
                if (sexo.equals("F")) {
                    quantidadeMulheres = quantidadeMulheres + 1;
                    totalIdadeMulheres = totalIdadeMulheres + idade;
                }
               
                if ((sexo.equals("M")) && (peso < pesoMenor)) {
                    pesoMenor = peso;
                    matriculaPesoMenor = matricula;
                }
            }
        }
       
       
        mediaIdadeMulheres = totalIdadeMulheres / quantidadeMulheres;
        System.out.println("a) O maior peso é: " + pesoMaior + " Matricula:" +
        matriculaPesoMaior);
        System.out.println("b) A media de idades das mulheres:" + mediaIdadeMulheres);
        System.out.println("c) O menor peso dos homens é: " + pesoMenor + " Matricula: " + matriculaPesoMenor);        
    }

}
	}


