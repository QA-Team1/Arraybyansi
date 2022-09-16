
public class CountEvenandOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int []{2,5,3,9,11,4,8,13};
		int even_count=0;
		int odd_count=0;
		 
		System.out.println("elment of orignal number");
		
		for(int i=0; i<nums.length; i++){
			if(nums[i] % 2 == 0) {
				even_count ++;
			}
			else
			    odd_count ++;
				
		}
		System.out.println("Number of Even numbers: " +even_count);
		System.out.println("Number of Odd numbers:" +odd_count);

	}

}
