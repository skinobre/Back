

/* Um comerciante está curioso para saber o preço médio que vendeu as 3 últimas caixas de bombons e contratou você para desenvolver um programa que resolva isso.

Como você ainda não aprendeu a receber parâmetros, você pediu ao comerciante os 3 últimos preços que ele vendeu as caixas de bombons para incluir dentro do código-fonte do programa (mas prometeu arrumar isso assim que aprendesse).

O comerciante lhe passou os seguintes valores: 5, 8, 12. Desenvolva um programa que calcula a média desses números.

1. Crie um arquivo chamado "PrecoMedioBombom.java" e coloque o seguinte código-fonte dentro dele: 
2. Agora temos os preços atribuidos às variáveis dentro de nosso programa. Inclua um comentário de linha acima das variáveis para ficar mais claro para outros programadores que por acaso precisem trabalhar neste código-fonte no futuro.*/

public class PrecoMedioBombom {

	public static void main(String[] args) {
		// preços das últimas 3 vendas realizadas
		int preco1 = 5;
		int preco2 = 8;
		int preco3 = 12;
		
//3. Calcule a média dos preços e atribua o resultado em outra variável.
		// calculo para tirar a média
		int mediaPrecos = (preco1 + preco2 + preco3) / 3;
		
//4. Imprima na tela os 3 preços e a média calculada. Use sequências de escape em algum lugar para praticar.
		//mostrar resultados
		System.out.println("\"Sistema de Calculo de Media\"");
		System.out.println("Preco 1: " + preco1);
		System.out.println("Preco 2: " + preco2);
		System.out.println("Preco 3: " + preco3);
		System.out.println("\nMedia dos precos:\n" + mediaPrecos);
	}

}
