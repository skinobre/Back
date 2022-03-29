/*Você foi contratado para fazer um programa que descobre se um ano é bissexto ou não. O usuário irá informar o valor de um ano e seu programa irá imprimir na tela se é ou não um ano bissexto.

Para saber se um ano é bissexto ou não precisamos de saber algumas regrinhas:

    São bissextos todos os anos múltiplos de 400, por exemplo: 1600, 2000, 2400, ...
    São bissextos todos os múltiplos de 4 e não múltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, ...
    Não são bissextos todos os demais anos.*/
import java.util.Scanner;    
public class exercicio3 {


	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um Ano: ");
		int ano = entrada.nextInt();
		
		
		if (ano % 400 == 0) {
			System.out.print("O ano "+ano+" é um ano bissexto!");
		}else if(ano % 4 == 0){
			if(ano % 100 != 0){
				System.out.print("O ano "+ano+" é um ano bissexto!");	
			}else{
				System.out.print("O ano "+ano+" é um ano bissexto!");
			}
			
		}else{
			System.out.print("O ano "+ano+" não é um ano bissexto!");
		}
	
	
	}



}

