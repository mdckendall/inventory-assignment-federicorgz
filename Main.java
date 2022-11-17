import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		HashMap<String,Object[]>  items =  new HashMap<String,Object[]>();
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
					items.put(serialNum,new Object[]{name,dollars});
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
					items.get(serialNum)[0] = in.next();
					System.out.println("Enter the new value in dollars (whole number):");
					items.get(serialNum)[1] = in.nextInt();
					break;
				case(4):
					for(String i : items.keySet()){
						System.out.println(items.get(i)[0]+","+i+","+items.get(i)[1]);
					}
					break;
				case(5):
					
					break WhileLoop;
			}
		}
	}
}