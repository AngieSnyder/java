
public class CodingChallenge3App {

	public static void main(String[] args) {
		int [] a = {1,2,6};
		int [] b = {6,1,2,3};
		int [] c = {13,6,1,2,3};
		
		if (firstLast6(a)) {
			System.out.println("Yes!!! True");
			
		}
		else {
			System.out.println("NO...False!");
		}
		if (firstLast6(b)) {
			System.out.println("Yes!!! True");
			
		}
		else {
			System.out.println("NO...False!");
		}
		if (firstLast6(c)) {
			System.out.println("Yes!!! True");
			
		}
		else {
			System.out.println("NO...False!");
		}
				
	}
				
	public static boolean firstLast6(int[] nums) {
		if (nums[0]==6  || nums[nums.length-1]==6)
			return true;
		return false;
	}
		

}
