package leetcode.easy;

/**
 * @author Mohit Dodhia
 */
public class PalindromeNumber {
	public static void main(String[] args) {
		boolean isPalindrome = new PalindromeNumber().isPalindrome(0);
		
		System.out.println(isPalindrome);
	}
	
	public boolean isPalindrome(int x) {
		int remainder = 0;
		int reversedNumber = 0;
		int originalNumber = x;
		
		if (x >= 0) {
			while (x > 0) {
				remainder = x % 10;
				reversedNumber = reversedNumber * 10 + remainder;
				x /= 10;
			}
			
			return originalNumber == reversedNumber ? true : false;
		}
		
		return false;
	}
}
