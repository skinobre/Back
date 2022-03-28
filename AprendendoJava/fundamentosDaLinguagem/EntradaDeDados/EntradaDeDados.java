import java.util.Scanner;

public class EntradaDeDados {
	
	
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome:");
		
		String nome = entrada.nextLine();		<----Exemplo
		
		System.out.println("Oi " + nome);*/
		
		
		//exercicio para calcumar imc de um cliente
		
		System.out.print("Nome: "); // não utilizando o "ln" apos o print para não quebrar a linha de entrada de dados
		String nome = entrada.nextLine ();
		
		System.out.print("Peso: "); 
		int peso = entrada.nextInt ();
				
		System.out.print("Altura: "); 
		double altura = entrada.nextDouble ();		
		
		//calculando e salvando o resultado em uma variavel imc
		double imc = peso / (altura * altura);
		
		System.out.println("IMC de " + nome + " é: " + imc);
	}




}
