package sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MapStuff {
	public static void main(String[] args) {
		HashMap<String, String> mp = new HashMap<>();
		mp.put("S1", "K1");
		
		Stream<List<String>> namesOriginalList = Stream.of(
				Arrays.asList("Edward", "Jerry"), 
				Arrays.asList("Shiva", "Dhruv"),
				Arrays.asList("Kushal", "Ankush"));
			//flat the stream from List<String> to String stream
			Stream<String> flatStream = namesOriginalList
				.flatMap(strList -> strList.stream());

			flatStream.forEach(System.out::println);
			
			

		Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa", "Dark");
		Stream<String> firstNameWithD = names4.filter(i -> i.startsWith("D"));
//		if(firstNameWithD.isPresent()){
//			System.out.println("First Name starting with D="+firstNameWithD.get()); //David
//		}


	}
}
