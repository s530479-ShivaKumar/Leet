package sample;

import java.util.HashMap;
import java.util.Map;

public class Aclass {
	
	public static void main(String[] args) {
		
		Map<String, String> m = new HashMap<String, String>();
		String s = null;
		
		System.out.println(s == null);
		System.out.println(s.isEmpty());
		
		System.out.println(m.putIfAbsent("1", "one"));
		System.out.println(m.putIfAbsent("1", "one"));
		System.out.println(s.equals("abc"));
		
		int[] a = new int[5];
		System.out.println(a[2]);
		
//		System.out.println(IntStream.range(0, 5).mapToObj(mapper));
		
		System.out.println("ABC".equalsIgnoreCase(null));
		int[] digits = {9,9,9};
		int[] answer = plusOne(digits);
		System.out.println(plusOne(digits));
	}
	
	public static int[] plusOne(int[] digits) {
		for(int i=digits.length-1; i>=0; i--)
		{
			if(digits[i] + 1 > 9)
			{
				digits[i] = 0;
				if(i == 0) {
					int[] digitsplus = new int[digits.length + 1];
					digitsplus[0] = 1;
					for(int k = 0; k<digits.length;k++)
					{
						digitsplus[k+1] =  digits[k];
					}
					
					return digitsplus;
				}
			}
			else
			{
				digits[i] = digits[i] +1;
				break;
			}
		}
		return digits;
    }

}
