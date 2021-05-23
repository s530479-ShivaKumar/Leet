package sample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tracking {

	public static void main(String[] args) {
//		Collection<Integer> col = Collection<Integer>();
		String s = "shivaKumar";
		final int abc;
		int bcd = 10;
		abc = bcd;
		
		System.out.println(s.subSequence(0, 20));
//		col.add(5);
//		
//		System.out.println(col);
		Map<String, Set<Integer>> sopMap = new HashMap<String, Set<Integer>>();
		System.out.println(sopMap);
		Integer[] ids = {1,2,3,4};
		Set<Integer> sett = new HashSet<Integer>(Arrays.asList(ids));
		sopMap.put("one", sett);
		
		System.out.println(sopMap);
		
		Set<Integer> intSet = sopMap.getOrDefault("onee", Collections.emptySet());
//		intSet.add(5);
		sopMap.clear();
		System.out.println(intSet);
		System.out.println(sopMap);
		
		int scrollHeight =10;
		int modifiedSeriesNum =3;
		
		System.out.println(scrollHeight / modifiedSeriesNum * Math.min(3, modifiedSeriesNum) + 1);
		
		System.out.println(20/3);
	}

}
