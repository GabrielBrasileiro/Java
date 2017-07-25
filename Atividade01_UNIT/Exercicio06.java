public class Exercicio06 {

	public static void main(String[] args) {
	
		int i = 1;
		int j = 0;
	
		System.out.print(j + ", ");
		System.out.print(i + ", ");
		
		while ( i <= 100 ) {
			
			i = i + j;
			j = i - j;
			
			System.out.print(i + ", ");
			
			i++;
			
		}
			
	}
		
}