/* Seu programa será instalado nos equipamentos que identificam a velocidade dos veículos na via e decidem se merecem uma multa ou se podem passar sem problemas. O secretário do departamento passou as seguintes regras:

    Se o veículo for um carro de passeio e a velocidade do veículo for 10% maior que a velocidade permitida na via, o veículo deve ser multado.
    Se o veículo for um caminhão e a velocidade do veículo for 5% maior que a velocidade permitida na via, o veículo deve ser multado.

O programa deve receber as informações de velocidade máxima permitida e a velocidade do veículo através do teclado do computador. No futuro eles pretendem melhorar isso para não precisar que alguém fique o tempo todo digitando as informações.

1. Crie um programa chamado "MultaVeiculo" e inclua o código que recebe os parâmetros do usuário.*/

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tipo do veiculo (passeio, caminhao)");
		String tipoVeiculo = entrada.nextLine();
		
		System.out.println("Velocidade maxima da via");
		int velocidadeMaxima = entrada.nextInt();
		
		System.out.println("Velocidade do veiculo");
		int velocidadeVeiculo = entrada.nextInt();
		
		// veiculo de passeio com velocidade maior que 10% da velocidade da via
		// e caminhao com velocidade maior que 5% deve receber multa
		//Observação: para comparar uma string, nós usamos um método chamado equals.
		if (tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) {
			System.out.println("Multa");			
		} else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05) {
			System.out.println("Multa");
		}
	}

}

/* 4. Ao criar condições em programas, o ideal é que ela seja simples de ler e entender, no entanto, como você ainda está estudando Java, faça o if e else if virarem apenas um if, usando o operador de comparação OR (||). Substitua o trecho de código do if pelas linhas abaixo:


// veiculo de passeio com velocidade maior que 10% da velocidade da via
// e caminhao com velocidade maior que 5% deve receber multa
if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1)
		|| (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)) {
	System.out.println("Multa");
}*/
