package educative;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(findMaxSumSubArray(2, new int[] {2, 3, 4, 1, 5}));
//		System.out.println(findMinSubArray(15, new int[] {5,1,3,5,10,7,4,9,2,8}));
		char[] arr = new char[5];
		System.out.println(arr);
		arr[0] = 'a';
		System.out.println(arr);
		System.out.println(LongestSubStringKDistinct("araaci", 1));
	}
	
	public static int findMaxSumSubArray(int target, int[] nums)
	{
        int subArraySum = 0;
		int startOfSubArray = 0;
		int result = 0;
		
		for(int endOfSubArray = 0; endOfSubArray < nums.length; endOfSubArray++)
		{
			subArraySum+= nums[endOfSubArray];
			
			while(subArraySum >= target)
			{
                result = endOfSubArray - startOfSubArray +1;
				subArraySum-= nums[startOfSubArray];
				startOfSubArray++;
				
			}
            
		}
		
		return result;
	}
	
	public static int findMinSubArray(int target, int[] nums)
	{
        int subArraySum = 0;
		int startOfSubArray = 0;
		int result = 999999;
		
		for(int endOfSubArray = 0; endOfSubArray < nums.length; endOfSubArray++)
		{
			subArraySum+= nums[endOfSubArray];
			
			while(subArraySum >= target)
			{
                result = Math.min(result, endOfSubArray - startOfSubArray +1);
				subArraySum-= nums[startOfSubArray];
				startOfSubArray++;
			}
		}
		
		return result;
	}
	
	public static int LongestSubStringKDistinct(String str, int k)
	{
		int start =0;
//		int end = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		Set<Character> set = new HashSet<>();
		int result = 0;
		
		for(int end =0 ; end< str.length(); end++)
		{
			char c = str.charAt(end);
			map.put(c, map.getOrDefault(c, 0) + 1);
			
			while(map.size() > k)
			{
//				result = Math.max(result, end -start + 1);
				char startChar = str.charAt(start);
				map.put(startChar, map.get(startChar) -1);
				if(map.get(startChar) ==0)
				{
					map.remove(c);
				}
				start++;
				result = Math.max(result, end -start +1);
			}
		}
		return result;
	}
}
