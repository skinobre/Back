public class promocaoAritimetica {
	
	public static void main (String[] args) {
		int x = 10;
		long y = 20;
		/*int z = x + y;   = não compila pois a variavel da linha 4 
		que é de valor int se promove a valor long (que é maior que int)
		e a soma de valores long não cabem em valor int*/
		
		
		//O correto é salvar em uma variavel de valor long 
		long z = x + y;
		
		
		// soma de valores inteiro com decimais
		long a = 10;
		float b = 20f;
		// deve salvar em uma variavel de valor flutuante (decimal)
		float c = a * b;
		
		
		
		
	
	
	}





}
