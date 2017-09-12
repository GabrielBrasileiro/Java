package NumerosPrimos;

public class NumerosPrimos {
	
	static int total= 10000;
	
	public static void main(String[] args) {
		
		int v[] = new int[total];
		
		for(int i = 2; i < total; i++) {
			
			v[i] = i;
			
		}
		
		for(int i = 2; i < total; i++) {
			
			if(v[i] != 0) {
				
				for(int j = 2 * i; j < total; j += i) {
					
					v[j] = 0;
					
				}
				
			}
			
		}
		
		for(int i = 2; i < total; i++) {
			
			if(v[i] != 0) {
				
				System.out.print(v[i] + "-");
				
			}
			
		}
		
	}

}
