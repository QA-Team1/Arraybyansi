
public class ThirdSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NumberArray[] = new int[] {10,40,20,50,30};
		int Dnumber , size ;
		size = NumberArray.length;		
		System.out.println("Elements of originial array");
		for(int i=0; i<NumberArray.length; i++) {
			System.out.print(NumberArray[i] + " ");
		}
		for(int i=0; i<NumberArray.length; i++) {
			for(int j=i+1; j<NumberArray.length; j++) {
				if(NumberArray[i] < NumberArray[j]) {
					Dnumber = NumberArray[i];
					NumberArray[i] = NumberArray[j];
					NumberArray[j] = Dnumber;
				}
			}
			
		}
		System.out.println();
		System.out.println("Elements of Descending Number of array");
		for(int i=0; i<NumberArray.length; i++) {
			System.out.print(NumberArray[i] + " ");


	}
		System.out.println();
		System.out.println("Second Smallest number is "   +NumberArray[size-3]);

}
}
