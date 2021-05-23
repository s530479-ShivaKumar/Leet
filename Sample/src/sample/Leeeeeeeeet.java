package sample;

import java.util.Calendar;
import java.util.Date;

public class Leeeeeeeeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
//		System.out.println(s.toLowerCase());
		
		System.out.println(divide(10,-3));
		
		System.out.println("abcdefg".indexOf("def"));
		System.out.println("".split(" ").length);
		
        Calendar c = Calendar.getInstance(); 
        
        // set Month 
        // MONTH starts with 0 i.e. ( 0 - Jan) 
        c.set(Calendar.MONTH, 11); 
  
        // set Date 
        c.set(Calendar.DATE, 05); 
  
        // set Year 
        c.set(Calendar.YEAR, 1996); 
  
        // creating a date object with specified time. 
        Date dateOne = c.getTime(); 
  
        System.out.println("Date 1: "
                           + dateOne); 
  
        // creating a date of object 
        // storing the current date 
        Date currentDate = new Date(); 
  
        System.out.println("Date 2: "
                           + currentDate); 
  
        // compares 
        System.out.println("On Comparison: "
                           + dateOne 
                                 .compareTo(currentDate)); 
        
        System.out.println(0x00700001);
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    

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
    
//    public static boolean canConstruct(String ransomNote, String magazine) {
//         char[] CharArray = magazine.toCharArray();
////         CharArray.
//        
//        
//    }
    
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        for(int ii : nums)
        	System.out.println(ii);
        return i + 1;
    }

}
