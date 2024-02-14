package list;

import java.util.ArrayList;
import java.util.Arrays;

public class quiz005 {//이해x
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black","White", "Green","Red"));
		/*String removedColor = colors.remove(0);
		System.out.println("Removed color is "+removedColor);
		
		colors.remove("White");
		System.out.println(colors);
		
		colors.clear();
		System.out.println(colors);
		*/
		
		boolean contains = colors.contains("Black");
		System.out.println(contains);
		
		int index = colors.indexOf("Blue");
		System.out.println(index);
		
		index = colors.indexOf("Red");
		System.out.println(index);
	}

}
