package sample;

import java.util.HashSet;
import java.util.Set;

/**
 * Java enum with constructor for example.
 * Constructor accept one String argument action
 */
enum TrafficSignal{
    //this will call enum constructor with one String argument
    RED("wait"), GREEN("go"), ORANGE("slow down");
  
    private String action;
  
    public String getAction(){
        return this.action;
    }
  
    // enum constructor - can not be public or protected
    TrafficSignal(String action){
        this.action = action;
    }
}

/**
 *
 * Java Enum example with constructor. 
 * Java Enum can have constructor but it can not
 * be public or protected
 *
 * @author http://java67.com
 */
public class EnumExample{

    public static void main(String args[]) {
    	
    	String ssssst = "shiva;";
    	
    	ssssst.concat("Kumar");
    	
    	System.out.println(ssssst.substring(0, ssssst.length()-1));
    	
    	Set<String> arSet = new HashSet<String>();
    	String st = null;
//    	arSet.add("shiva");
//    	arSet.add("kumar");
    	if(!arSet.isEmpty()) {
    		st = arSet.stream().findFirst().get();
    	}
    	
    	System.out.println(st);
    	StringBuilder sb = new StringBuilder("ShivaKumar");
    	System.out.println(sb);
      
//      //let's print name of each enum and there action
//      // - Enum values() examples
//      TrafficSignal[] signals = TrafficSignal.values();
//    
//      for(TrafficSignal signal : signals){
//          //Java name example - Java getter method example
//          System.out.println("name : " 
//                             + signal.name() 
//                             + " action: " 
//                             + signal.getAction());
//      } 
    
    } 
  
}
