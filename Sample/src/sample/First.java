/**
 * 
 */
package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author SM071458
 *
 */
//enum Day {
//	MONDAY("M"), TUESDAY("T");
//}
public class First {
	static void someFunction(String s) 
    { 
        System.out.println(s); 
    } 

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		System.out.println(myList.stream());
		List<String> list = new ArrayList<String>(); 
        list.add("Geeks"); 
        list.add("For"); 
        list.add("GEEKS"); 
  
        // call the static method 
        // using double colon operator 
//        list.forEach(First::someFunction);
//        List number = Arrays.asList(2,3,4,5);
//        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 
//        	  
//        System.out.println(even);
        
     // create a list of integers 
        List<Integer> number = Arrays.asList(2,3,4,5); 
      
        // demonstration of map method 
        List<Integer> square = number.stream().map(x -> x*x). 
                               collect(Collectors.toList()); 
        System.out.println(square); 
      
        // create a list of String 
        List<String> names = 
                    Arrays.asList("Reflection","Collection","Stream"); 
      
        // demonstration of filter method 
        List<String> result = names.stream().filter(s->s.startsWith("S")). 
                              collect(Collectors.toList()); 
        System.out.println(result); 
      
        // demonstration of sorted method 
        List<String> show = 
                names.stream().sorted().collect(Collectors.toList()); 
        System.out.println(show); 
      
        // create a list of integers 
        List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
      System.out.println("hee");
      System.out.println(numbers);
        // collect method returns a set 
        Set<Integer> squareSet = 
             numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
        System.out.println(squareSet); 
        System.out.println("hee");
        System.out.println(numbers);
        // demonstration of forEach method 
        number.stream().map(x->x*x).forEach(y->System.out.println(y)); 
        System.out.println("hee");
        System.out.println(numbers);
        // demonstration of reduce method 
        int even = 
           number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 
      
        System.out.println(even);
        System.out.println(numbers);
        
        List<Integer> numbers2 = Arrays.asList();
        System.out.println(numbers2.stream()
                .map( n -> n.toString()).collect(Collectors.joining(",")));
		
	}

}
