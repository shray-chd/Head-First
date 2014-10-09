import java.util.ArrayList;

public class tester {
	
	int age=30;
	String firstName="Sparsh";
	String lastName="Chadha";
	public ArrayList<Tools> toolList = new ArrayList<Tools>();
	
	public void setUpTools(){
		
		Tools t1 = new Tools();
		t1.setToolName("QTP");
		t1.expInTool(3);
		
		Tools t2 = new Tools();
		t2.setToolName("Test Link");
		t2.expInTool(3);
		
		Tools t3 = new Tools();
		t3.setToolName("Selenium");
		t3.expInTool(2);
		
		toolList.add(t1);
		toolList.add(t2);
		toolList.add(t3);			
		
	}
	
	public void printTools(){
		
		for(Tools cell : toolList){
			System.out.println(cell.nameOfTool);			
		}		
	}
	
	public void printToolsAndYears(){
		
		for (Tools cell : toolList)
			System.out.println(cell.nameOfTool+":"+cell.noOfYears);
	}
	
	
}
	
	
	
