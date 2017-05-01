package Palindrome_Number;

public class Solution {

	public static boolean isPalindrome(int x) {
		int y = x;
		if(x == 0)
			return true;
		if (x < 0 ||x%10 == 0) {
			return false;
		}
		int res = 0;
		while (x > 0) {
			res = res * 10 + x % 10;
			x /= 10;
		}
		return res == y;
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome(0));
	}

}
