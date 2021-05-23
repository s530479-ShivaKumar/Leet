package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String[] args) {
		
		Set<Integer> s =  new HashSet<Integer>();
		s.add(5);
		System.out.println(s);
		
		if(true)
		{
			int iiii = 10;
		}
//		System.out.println(s.remove(o));
		
//		Employee e1 = new Employee("Shiva", 10);
//		Employee e2 = new Employee("Kumar", 20);
//		
//		List<Employee> listEmp = new ArrayList<Employee>();
//		listEmp.add(e1);
//		listEmp.add(e2);
//		
//		Employee emp = listEmp.stream().filter(e -> e.name.equals("Shivaaa")).findFirst().orElse(null);
//		
////		System.out.println(emp);
		
		Map<String, Set<Integer>> mp = new HashMap<String, Set<Integer>>();
		mp.put("a", new HashSet<>(Arrays.asList(1,2,3)));
		mp.put("b", new HashSet<>(Arrays.asList(4,5,6)));
		
//		boolean bl = Collections.<Integer>emptySet().add(new Integer(6));
//		System.out.println(bl);
//		mp.put("c", "Cat");
//		mp.put("d", "Dog");
//		mp.put("e", "egg");
//		mp.computeIfAbsent("e", a -> "elephant");
//		for(Entry<String, String> a : mp.entrySet())
//		{
//			System.out.println(a.getValue());
//		}
//		Collection.
//		Collections.emptySet<Integer>();
//		Set<Integer> abc = new HashSet<Integer>();
		mp.computeIfAbsent("c", abc-> mp.getOrDefault("c", Collections.<Integer>emptySet())).add(5);
		
//		mp.put(null, "nullValue");
//		mp.fo
		
//		mp.computeIfAbsent("e", k -> "elephant");
		
//		mp.getOrDefault("c", "Empty");
		Collections.emptyMap();
		
		System.out.println("SHIVAaaaaaaaaaaaaaaaaaa");
		System.out.println(mp.get("c"));
		
//		for(String s : mp.keySet())
//		{
//			System.out.println(mp.get(s));
//		}
		
//		System.out.println(mp. );

		List<String> lists =  new ArrayList<String>();
		lists.add("abc");
		lists.add("def");
		lists.add("ghi");
		lists.add("jkl");
//		System.out.println("dfsdfsdfshiva");
//		System.out.println(lists);
//		System.out.println("dfsdfsdfshiva");
		
		String a = "Shiva Kumar";
		String replaced = a.replace("Shivachary", "Kumar");
//		System.out.println(a);
//		System.out.println(replaced);
		
//		System.out.println(lists.stream().map(x -> x).collect(Collectors.joining(";")));
//		System.out.println(mp.keySet().stream().map(x -> mp.get(x)).collect(Collectors.joining("--")));
		
		
		
		Study st1 = new Study("s1", new Patient("p1"));
		Study st2 = new Study("s2", new Patient("p1"));
		Study st3 = new Study("s1", new Patient("p1"));
		Study st4 = new Study("s4", new Patient("p3"));
		
		List<Study> studies = null;
//		studies.add(st1);
//		studies.add(st2);
//		studies.add(st3);
//		studies.add(st4);
//		System.out.println(studies);
		
		String aaaa = "";
//		System.out.println(aaaa.isEmpty());
//		
//		System.out.println(studies.stream().map(study -> study.getP()).distinct().collect(Collectors.toList()));
	}
	

}
