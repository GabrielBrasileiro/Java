public class Exercicio05 {
		
	public static void main(String[] args) {
		       
		long fatorial = 1;
			 	
		 for (int n = 1; n <= 40; n++) {
		        	
		           fatorial *= n;
		            
		            System.out.println("Fatorial de " + n + " = " + fatorial);
		            
		}
		 
		 /* O valor final ultrapassa o que a declaração aguenta, ou seja o valor alocado na
		  * memória é estourado */
		 	
	}

}