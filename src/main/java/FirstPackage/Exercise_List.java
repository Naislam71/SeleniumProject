package FirstPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exercise_List {
	
	public static void main(String[] args) {
		
		//Syntax
//		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();
		
	//	ClassName obj = new ClassName();
//	ArrayList<String> str = new ArrayList<String>();
		
	List<String> str = new ArrayList<String>();
	
	
	str.add("Nazmul");
	str.add("Sumayla");
	str.add("Atia");
	str.add("mamun");
	str.add("Hasan");
	str.add("Eva");
	str.add("Nilufar");
	str.add("Selina");
	str.add("AShraf");
	str.add("Mamun");
	
		System.out.println(str);
		
		System.out.println(str.size());
		System.out.println(str.add("Ayaan"));
		System.out.println(str);
		System.out.println(str.size());
		System.out.println(str.remove(10));
		System.out.println(str.size());
		System.out.println(str.add("Emad"));
		System.out.println(str.get(3));
		System.out.println(str.contains("gftgfyt"));
		
		System.out.println("++++++++++++++++++++++");
	
	//	Starting point ; Condition; Increment/Decrement
		
		for (int i = 0; i<=10 ; i++  ) {
			
			System.out.println(str.get(i));
			
		}
		
		System.out.println("==============================");
		
		for(String each : str) {
			System.out.println(each);
			
		}
		
		
		List<Integer> num = new LinkedList<Integer>();
		
		Set< String> abc = new TreeSet<String>();
		
	}
	

	
	

}
