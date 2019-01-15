
public class HCF {

	public static void main(String[] args) {
		System.out.println(highestCommonFactor(35, 30));
		System.out.println(highestCommonFactor(25, 20));

	}
	
	public static int highestCommonFactor(int x, int y) {
		int numFactor = 0;
		
		if(x == 0 || y == 0) {
			return 0;
		}
		
		int maximumNumber = Math.max(x, y);
		
		for(int i = 1; i <= maximumNumber; i++) {  // initialise for loop from 0 to avoid exception error
			if(x%i==0 && y%i==0) {
				numFactor = i;
			}
		}
		
		return numFactor;
		
	}
}
