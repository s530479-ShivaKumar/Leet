package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
//		System.out.println(MainClass.fractionToDecimal(33, 8));
		System.out.println(MainClass.isPalindrome(".,"));
	}
	
	private static String fractionToDecimal(int numerator, int denominator) {
	    if (numerator == 0) {
	        return "0";
	    }
	    StringBuilder fraction = new StringBuilder();
	    // If either one is negative (not both)
	    if (numerator < 0 ^ denominator < 0) {
	        fraction.append("-");
	    }
	    // Convert to Long or else abs(-2147483648) overflows
	    long dividend = Math.abs(Long.valueOf(numerator));
	    long divisor = Math.abs(Long.valueOf(denominator));
	    fraction.append(String.valueOf(dividend / divisor));
	    long remainder = dividend % divisor;
	    if (remainder == 0) {
	        return fraction.toString();
	    }
	    fraction.append(".");
	    Map<Long, Integer> map = new HashMap<>();
	    while (remainder != 0) {
	        if (map.containsKey(remainder)) {
	            fraction.insert(map.get(remainder), "(");
	            fraction.append(")");
	            break;
	        }
	        map.put(remainder, fraction.length());
	        remainder *= 10;
	        fraction.append(String.valueOf(remainder / divisor));
	        remainder %= divisor;
	    }
	    return fraction.toString();
	}
	
	public static boolean isPalindrome(String s) {
        if(s == null || s.length() ==0)
        {
            return false;
        }
        else
        {
            s= s.toLowerCase();
        }
    
        int j = s.length() -1;
        
        
        for (int i=0;i<j; i++,j--)
        {
            int ithValue = -1;
            int jthValue = -1;
            while(i <= j)
            {
                ithValue = s.charAt(i);
                if(( ithValue >= 'a' && ithValue <= 'z') || ( ithValue >= '0' && ithValue <= '9'))
                {
                    break;
                
                }
                else
                {
                    i++;
                }
                
            }

            while(j >= i)
            {
                jthValue = s.charAt(j);
                if(( jthValue >= 'a' && jthValue <= 'z') || ( jthValue >= '0' && jthValue <= '9'))
                {
                    break;
                
                }
                else
                {
                    j--;
                }
                
            }
            
            if(jthValue == -1)
            {
            	jthValue = ithValue;
            }
            
            if(ithValue != jthValue)
            {
                return false;
            }
            
        }
        return true;
    }
	
	

}
