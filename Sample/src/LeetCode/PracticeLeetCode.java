package LeetCode;

public class PracticeLeetCode {

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] {2,3,4,5,18,17,6}));
		int[] a = new int[10];
		System.out.println(a[5]);
		
	}
	
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int length = height.length;
        int initial =0;
        int last = length-1;
        
        while(initial<last)
        {
            maxArea = Math.max(maxArea, (Math.min(height[initial], height[last])* (last-initial)));
            
            if(initial < last)
            {
                initial++;
            }
            else
            {
                last--;
            }
        }
        return maxArea;
    }
}
