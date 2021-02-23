package handson;
import java.util.*;
import java.util.Map.Entry; 



public class Question2 {

	public static void main(String[] args) {
		
		
		TreeMap <String,String> tmap = new TreeMap <String,String> ();

		  
		  tmap.put("A", "Shreya");
		  tmap.put("B", "Riya");
		  tmap.put("C", "Rohan");
		  tmap.put("D", "Priya");

		  System.out.println("Orginal-" + tmap);
		  System.out.println("Reverse-" + tmap.descendingKeySet());
	}

}
