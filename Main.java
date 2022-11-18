import java.util.HashMap;
import java.util.Scanner;

class Inventory{
	String serialNum;
	String name;
	int dollars;
	
	public Inventory(String _serialNum, String _name, int _dollars){
		this.serialNum = _serialNum;
		this.name = _name;
		this.dollars = _dollars;
	}
	
	@Override
	
	public String toString(){
		return name+","+serialNum+","+dollars;
	}
}

public class Main{
	public static void main(String[] args){
		HashMap<String,Inventory>  items =  new HashMap<String,Inventory>();
		Scanner in = new Scanner(System.in);
		int input, dollars;
		String name, serialNum;
		
		WhileLoop: while(true){
			System.out.println("Press 1 to add an item.");
			System.out.println("Press 2 to delete an item.");
			System.out.println("Press 3 to update an item.");
			System.out.println("Press 4 to show all the items.");
			System.out.println("Press 5 to quit the program.");
			input = in.nextInt();
			switch(input){
				case(1):
					System.out.println("Enter the name:");
					name = in.next();
					System.out.println("Enter the serial number:");
					serialNum = in.next();
					System.out.println("Enter the value in dollars (whole number):");
					dollars = in.nextInt();
					items.put(serialNum,new Inventory(serialNum,name,dollars));
					break;
				case(2):
					System.out.println("Enter the serial number:");
					serialNum = in.next();
					items.remove(serialNum);
					break;
				case(3):
					System.out.println("Enter the serial number of the item to change:");
					serialNum = in.next();
					System.out.println("Enter the new name:");
					items.get(serialNum).name = in.next();
					System.out.println("Enter the new value in dollars (whole number):");
					items.get(serialNum).dollars = in.nextInt();
					break;
				case(4):
					for(String i : items.keySet()){
						System.out.println(items.get(i));
					}
					break;
				case(5):
					
					break WhileLoop;
			}
		}
	}
}