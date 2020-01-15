
public class MultiplicationChart {

	public static void main(String[] args) {
	
		for(int i=1; i<=1; i++) {	
			for(int j=1;j<=9;j++) {
				System.out.print("    "+j*i);						
			}
			System.out.println("");
			System.out.println("----------------------------------------------");
			
		}
		
		
		for(int i=1; i<=9; i++) {			
			System.out.print(i+" |");			
			for(int j=1;j<=9;j++) {
				System.out.print("   "+j*i);
			}
			System.out.println("");
			
		}

	}

}
