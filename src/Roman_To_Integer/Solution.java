package Roman_To_Integer;

public class Solution {

	public static int romanToInt(String s) {
		int[] num = new int[s.length()];
		for (int x = 0; x < s.length(); x++) {
			switch (s.charAt(x)) {
			case 'M':
				num[x] = 1000;
				break;
			case 'D':
				num[x] = 500;
				break;
			case 'C':
				num[x] = 100;
				break;
			case 'L':
				num[x] = 50;
				break;
			case 'X':
				num[x] = 10;
				break;
			case 'V':
				num[x] = 5;
				break;
			case 'I':
				num[x] = 1;
				break;
			}
		}

		int sum = 0;
		for (int x = 0; x < num.length - 1; x++) {
			if (num[x] < num[x + 1]) {
				sum-=num[x];
			}else{
				sum+=num[x];
			}

		}

		return sum+num[num.length-1];
	}

	public static void main(String[] args) {
		String str = "MMMDLXXXVI";
		System.out.println(romanToInt(str));
	}

}
