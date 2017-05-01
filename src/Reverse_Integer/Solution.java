package Reverse_Integer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static int reverse(int x) {

		/*long result = 0;
		int y = 0;
		if (x < 0) {
			y = -x;
		} else {
			y = x;
		}
		List<Integer> list = new ArrayList<Integer>();
		while (y > 0) {
			int z = y / 10;
			list.add(y - 10 * z);
			y /= 10;
		}
		for (int i = 0; i < list.size(); i++) {
			int temp = 1;
			for (int j = 0; j < list.size() - i - 1; j++) {
				temp *= 10;
			}
			result += list.get(i) * temp;
			System.out.println(result);
			if (result > Integer.MAX_VALUE) {
				return 0;
			}
		}

		if (x < 0)
			return (int) -result;
		return (int) result;*/
		/*long result =0;
        while(x != 0)
        {
            result = (result*10) + (x%10);
            System.out.println(result);
            if(result > Integer.MAX_VALUE) return 0;
            if(result < Integer.MIN_VALUE) return 0;
            x = x/10;
        }
        return (int)result;*/
		long result = 0;
		int y;
		if(x < 0){
			y = -x;
		}else{
		    y = x;
		}
		while(y > 0){
			result = result*10 + y%10;
			if(result > Integer.MAX_VALUE ){
				return 0;
			}
			y /= 10;
		}
		if(x < 0)
		return (int)-result;
		return (int)result;
	}

	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}

}
