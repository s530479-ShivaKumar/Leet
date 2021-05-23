package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practiceeee {

	public static void main(String[] args) {
//		System.out.println(Practiceeee.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(Math.floor((double)(123)/10)%10);
		
		System.out.println(Practiceeee.get(6));
		
		System.out.println("ab".substring(0, 1));
		
		System.out.println(repeatedSubstringPattern("abaababaab"));
		
		String[] strs = {"a"};
		
		String str = "1234";
		
		System.out.println(longestCommonPrefix(strs));
		
		System.out.println(convertToInt(str));
		
		System.out.println(convertToString(1543345));
		
//		System.out.println(5/0);
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		
		ListNode ll1 = new ListNode(5);
		ListNode ll2 = new ListNode(6);
		ListNode ll3 = new ListNode(4);
		ll1.next = ll2;
		ll2.next = ll3;
		
		System.out.println(new Solution().addTwoNumbers(l1, ll1).val);
		System.out.println("shiva");
		
//		System.out.println(divide(-2147483648, -1));
		
		
		
//		System.out.println(lll.val);
		
//		System.out.println("ab".substring(3));
		
		
		
		
	}
	
    public static int divide(int dividend, int divisor) {
        
        boolean overflow = true;
        int count = 1;
        int dvd = dividend;
        int div = divisor;
        int scndDiv = divisor;
        if(dividend<0) {
        	dividend = -dividend;
        }
        if(dividend <0 || divisor <0) {
        	return Integer.MIN_VALUE;
        }
        if(divisor<0) {
        	divisor = -divisor;
        	scndDiv = divisor;
        }
        	while(overflow) {
        		if(dividend >= divisor) {
        			divisor+=scndDiv;
        			count++;
        		}
        		else
        		{
        			overflow = false;
        		}	
        	}
        
        if((dvd<0 && div>0) || (dvd>0 && div<0))
        {
        	return -(count-1);
        }
        else {
        	return count-1;
        }
        
    }
	public static String get(int n)
	{
		int no = 1;
		String result = "1";
		while(no<n)
		{
			result = test(result);
			no++;
		}
		return result;
	}
	
    public static int lengthOfLongestSubstring(String s) {
        // char[] arr = s.
        String temp = "";
        int result = 0;
        
        for(int i =0; i<s.length();i++)
        {
            if(temp.indexOf(s.charAt(i)) < 0)
            {
            	temp +=s.charAt(i);
            }
            else
            {
            	temp = temp.substring(temp.indexOf(s.charAt(i)) + 1) +s.charAt(i);
            }
            
            if(temp.length()>result) {
            	result = temp.length();
            }
        }
        return result;
    }
    
    private static String test(String st)
    {
    	String result = "";
    	int count =1;
    	char presentchar = st.charAt(0);
    	char nextchar;
    	int frequency = 1;
    	
    		for(int i=1;i<st.length();i++)
    		{
    			nextchar = st.charAt(i);
    			if(nextchar == presentchar)
    			{
    				frequency++;
    			}
    			else
    			{
    				result+= Integer.toString(frequency)+presentchar;
    				presentchar = nextchar;
    				frequency=1;
    				
    			}
    		}
    		return result+frequency+presentchar;
    }
    
    public static boolean repeatedSubstringPattern(String s) {
        char firstOccurance = s.charAt(0);
        char[] chars = s.toCharArray();
        
        for(int i =chars.length-1; i>chars.length/2;i--)
        {
        	String result = "";
        	if(chars[i] == firstOccurance)
        	{
        		String repeatedString = s.substring(i);
        		
        		if(s.length() % (repeatedString.length()) !=0)
                {
                    continue;
                }
        		
        		int times = s.length()/(repeatedString.length());
        		
        		for(int j=0;j<times;j++){
                    result+=repeatedString;
                }
        		
        		if(s.equals(result))
        		{
        			return true;
        		}
        	}
        }
        	return false;
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 0) return result;
        int smallestWord = Integer.MAX_VALUE;
        for(String str : strs)
        {
            if(str.length()<smallestWord){
                smallestWord = str.length();
            }
        }
        
        
        for(int i=0; (i <smallestWord && smallestWord>0); i++)
        {
            char compareChar = strs[0].charAt(i);
            
            for(String s : strs)
            {
            	if(s.charAt(i) == compareChar)
            	{
            		result = s.substring(0,i+1);
            	}
            	else
            	{
            		return s.substring(0,i);
            	}
            }
            
        }
        return result;
    }
    
    public String multiply(String num1, String num2) {
    	
        int n1 = convertToInt(num1);
        int n2 = convertToInt(num2);
        int multiply = n1*n2;
        
        return convertToString(multiply);
        
    }
    
    public static int convertToInt(String s)
    {
//        char[] digits = {'0','1','2','3','4','5','6','7','8','9'};
        int sum = 0;
        int zeroAscii = (int) '0';
        for(char ch : s.toCharArray())
        {
        	int i = (int)ch;
        	sum = (sum*10) + (i-zeroAscii);
        }
        
        return sum;
    }
    
    public static String convertToString(int i)
    {
    	String result = "";
    	while(i>0)
    	{
    		result = i%10 + result;
    		i = i/10;
    	}
    	return result;
    }
    
}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
 class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int carry = 0;
	        ListNode result = new ListNode(0);
	        while(l1.next != null || l2.next != null)
	        {
	            
	            int a = l1.val;
	            int b = l2.val;
	            
	            int sum = a + b + carry;
	            if(sum >=10)
	            {
	                carry = 1;
	                sum = sum%10;
	                
	            }
	            else
	            {
	                carry = 0;
	            }
	            ListNode singleNode = new ListNode(sum);
	            result.next = singleNode;
	            result = result.next;
	            l1=l1.next;
	            l2 = l2.next;
	            
	        }
	        return result.next;
	        
	    }
	    
	    private int getNumber(ListNode ll1)
	    {
	        int n = 0;
	        while(ll1 != null && ll1.next != null)
	        {
	            n = (n*10) + ll1.val;
	            ll1 = ll1.next;
	        }
	        
	        return n*10 + ll1.val;
	    }
	    
//	    private int getReverse(int a)
//	    {
//	    	int rev = 0;
//	    	while(a>0)
//	    	{
//	    		rev= rev*10 + a%10;
//	    		a = a/10;
//	    	}
//	    }
	}
 
