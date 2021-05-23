package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet821 {

	public static ArrayList<Character> stringInts= new ArrayList<>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));	
	
	public static void main(String[] args) 
	{
		System.out.println("index of" + "Str".indexOf(""));
		int[] weights = new int[] {1,2,3,1,1};
		System.out.println(shipWithinDays(weights, 4));
		
//		String[] parseStrings = parsePathDataStrings("M36 48L12 24 36 0v48z");
//		int i =5;
//		switch(i)
//		{
//		case 5:
//			{
//			System.out.println("5");
//			break;
//			}
//		case 6 : 
//			{
//				System.out.println("6");
//				break;
//			}
//		}
		
	}
	
	private static String[] parsePathDataStrings(String src)
    {
        List<String> strs = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        char[] ca = src.toCharArray();
        for (int i = 0; i < ca.length; i++)
        {
            char c = ca[i];
            if ('e' == c)
            {
                sb.append(c);
                if (i < ca.length - 1 && ca[i + 1] == '-')
                {
                    i++;
                    sb.append(ca[i]);
                }
            }
            else if (Character.isLetter(c))
            {
                if (sb != null && sb.length() > 0)
                {
                    strs.add(sb.toString());
                }
                strs.add(Character.toString(c));
                sb = new StringBuilder();
            }
            else if ('.' == c || Character.isDigit(c))
            {
                sb.append(c);
            }
            else
            {
                if (sb != null && sb.length() > 0)
                {
                    strs.add(sb.toString());
                }
                sb = new StringBuilder();
                if ('-' == c)
                {
                    sb.append(c);
                }
            }
        }
        if (sb != null && sb.length() > 0)
        {
            strs.add(sb.toString());
        }
        return strs.toArray(new String[strs.size()]);
    }
	
	public static int shipWithinDays(int[] weights, int D) {
        
        int highestWeight = findHighest(weights);
        int currentWeight =0;
        int numberOfDays = 0;
        for(int i =0; i < weights.length; i++)
        {
            currentWeight += weights[i];
            if(currentWeight > highestWeight)
            {
                i--;
                currentWeight = 0;
                numberOfDays++;
            }
            if(numberOfDays > D-1){
                i=-1;
                highestWeight++;
                currentWeight = 0;
                numberOfDays=0;
            }
        }
        return highestWeight;
        
    }
    
    private static int findHighest(int[] weights)
    {
        int currentMax = 0;
        for(int i =0 ; i< weights.length; i++)
        {
            if(weights[i] > currentMax)
            {
                currentMax = weights[i];
            }
        }
        
        return currentMax;
    }
	
	
	
	

}
