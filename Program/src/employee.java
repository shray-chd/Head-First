import java.util.*;


public class employee {
	
	public static void main (String[] args){
		
		developer dev1 = new developer();
		tester test1 = new tester();
		
		dev1.setUpTools();
		dev1.printTools();
		dev1.printToolsAndYears();
		
		test1.setUpTools();
		test1.printTools();
		test1.printToolsAndYears();
		
	}
	
	

}
