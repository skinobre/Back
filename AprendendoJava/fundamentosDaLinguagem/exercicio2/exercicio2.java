/* Um professor universitário precisa de um programa para calcular a área de um círculo a partir do raio. Isso irá economizar bastante tempo dele ao elaborar exercícios para seus alunos.

O programa tem outros requisitos importantes para o professor: incluir uma opção para exibir (ou não) a fórmula usada para calcular a área e sempre exibir o resultado com casas decimais e também em inteiro.

O professor ficou sabendo que você está estudando Java e decidiu contratar seus serviços. Então, mãos à obra!

1. Para calcular a área de um círculo, deve-se multiplicar o raio ao quadrado por PI. Sabe-se que o valor de PI é uma constante igual a 3.14.*/


public class exercicio2 {

	public static void main (String[] args) {
		// definindo as variaveis pi e raio
		
		float pi = 3.14f;
		// raio - informado pelo professor
		float raio = 5.3f;
		
		//Área é igual ao raio ao quadrado multiplicado por Pi
		float area = (raio * raio) * pi;
		
		System.out.println("Resultado: "+ area);
		
		/* 2. Compile e execute o programa. 
		Apesar de ainda não ter finalizado todo o trabalho,
		 é uma boa prática compilar e executar seus programas com frequência,
		  assim o risco de bugs é bem menor.

		3. Inclua o código para conversão da área para o tipo inteiro
		 e também para imprimir o resultado em inteiro na tela. */
		 
		 int area2 = (int) area; // modelo de conversão casting
		System.out.println ("Resultado sem casas decimais: " + area2);
		
	
	}


}
