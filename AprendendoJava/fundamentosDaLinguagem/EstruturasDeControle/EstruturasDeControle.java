import java.util.Scanner;
public class EstruturasDeControle {
	
	
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: "); // não utilizando o "ln" apos o print para não quebrar a linha de entrada de dados
		String nome = entrada.nextLine ();
		
		System.out.print("Peso: "); 
		int peso = entrada.nextInt ();
				
		System.out.print("Altura: "); 
		double altura = entrada.nextDouble ();		
		
		//calculando e salvando o resultado em uma variavel imc
		double imc = peso / (altura * altura);
		
		System.out.println("IMC de " + nome + " é: " + imc);
		
		
		System.out.println("===Estruturas de controle===");
		System.out.println("==if=====else if=====else==");
		
		
		if (imc < 18.5) {
			System.out.println("abaixo do peso");
		} else if (imc < 25) {
			System.out.println("peso ideal");
		} else if (imc < 30) {
			System.out.println("acima do peso");
		} else if (imc < 40) {
			System.out.println("obesidade grau 1 ou 2");
		} else {
			System.out.println("obesidade grau 3");
		}
		
		
		
	
	
	
	}





}
