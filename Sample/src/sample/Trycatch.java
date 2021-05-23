package sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Trycatch {

	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMMddHHmmss");
		String dateString = "20210429203850";
		try {
			System.out.println(format.parse(dateString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("Result of method "+ method());
		int[] array = {1,2,3,4,5,};
		
		List<String> list = new ArrayList<String>();
		
		list.add("String1");
		list.add("String2");
		list.add("String3");
		list.add("String4");
		list.add("String5");
		list.add("String6");
		list.add("String7");
		list.add("String8");
		list.add("String8");
		
//		System.out.println(list);
		
		Comparator<String> c = (str1,str2) -> str2.compareTo(str1);
		
		Collections.sort(list, c);
		
		System.out.println(list);
		
		Map<String, String> serToConMap = new HashMap<String, String>();
		
		
		serToConMap.put("String1", "Container1");
		serToConMap.put("String2", "Container2");
		serToConMap.put("String3", "Container3");
		serToConMap.put("String4", "Container4");
		serToConMap.put("String5", "Container5");
		serToConMap.put("String6", "Container6");
		serToConMap.put("String7", "Container7");
		serToConMap.put("String8", "Container8");
		
		System.out.println(serToConMap.computeIfAbsent("String10", k -> "Container10"));
		
		list.stream().map(s -> serToConMap.get(s)).collect(Collectors.toList());
		
//		System.out.println(list.stream().map(serToConMap :: get));
		
		
	}
	
	public List<String> getList()
	{
		List<String> list = new ArrayList<String>();
		
		list.add("String1");
		list.add("String2");
		list.add("String3");
		list.add("String4");
		list.add("String5");
		list.add("String6");
		list.add("String7");
		list.add("String8");
		
//		System.out.println(list);
		
		
		Map<String, String> serToConMap = new HashMap<String, String>();
		
		
		serToConMap.put("String1", "Container1");
		serToConMap.put("String2", "Container2");
		serToConMap.put("String3", "Container3");
		serToConMap.put("String4", "Container4");
		serToConMap.put("String5", "Container5");
		serToConMap.put("String6", "Container6");
		serToConMap.put("String7", "Container7");
		serToConMap.put("String8", "Container8");
		
		list.stream().map(s -> serToConMap.get(s)).collect(Collectors.toList());
		
//		return list.stream().map(serToConMap :: get);
		return null;
		
	}
	
	public static int method()
	{
		try
		{
			System.out.println("Executing try");
			return 1;
		}
		catch(Exception e)
		{
			System.out.println("Executing catch");
			return 0;
		}
		finally 
		{
			System.out.println("Executing finally");
			
		}
	}

}
