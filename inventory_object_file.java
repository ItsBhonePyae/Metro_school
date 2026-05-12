package TSW_sensei_assignment;
import java.util.Scanner;
public class inventory_object_file {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A1_inventory_System a1 = new A1_inventory_System();
		String[][] inventory = A1_inventory_System.inventory;
		
		int size1 = A1_inventory_System.size1;
		
		for(int i=0;i<inventory.length;i++) {
			System.out.println("Item: " + inventory[i][0]+ "\tprice: " +inventory[i][1]);
		}
		
		while(true) {
			String[][] new_arr= new String[inventory.length+1][size1];		
			String [][] after_delete = new String[inventory.length-1][size1];	
	
			boolean delete_status = false;
			boolean insert_status = false;

			System.out.print("\n1.Insert" + "\n2.Delete" + "\n3.Search & Update"+"\n4.Exit"+"\nDetermine the functin: " );
			String function = sc.nextLine();
		
			//Insert
			
			if(function.toLowerCase().contains("insert")||function.contains("1")) {
				System.out.print("Enter a row number to insert an element: ");
				int index = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter an item to insert: ");
				String item = sc.nextLine();
				System.out.print("Enter the price of it: ");
				String price = sc.nextLine();
				insert_status = true;
				new_arr=a1.insert(new_arr,index,item,price);
			}
		
			//Delete
		
			else if(function.toLowerCase().contains("delete")||function.contains("2")) {
				System.out.print("Enter a row number to be deleted: ");
				int delete_index = sc.nextInt();
				sc.nextLine();
				delete_status = true;
				after_delete=a1.delete(after_delete,delete_index);
				
			}
	
			//Search & Update
			
			else if(function.toLowerCase().contains("search")||function.toLowerCase().contains("update")||function.contains("3")) {
				System.out.print("Enter an item to search: ");
				String oldvalue = sc.nextLine();
				System.out.print("Enter an item to update: ");
				String newvalue = sc.nextLine();
				System.out.print("Enter the price of an updated item: ");
				String newprice = sc.nextLine();
				
				inventory=a1.search_and_update(inventory,oldvalue, newvalue, newprice);
	
			}
			else if(function.toLowerCase().contains("exit")||function.toLowerCase().contains("4")) {
				break;
			}
			
			
		if(insert_status) {
			inventory  = new_arr;
			}
		else if(delete_status) {
			inventory = after_delete;
		}
		for(int i = 0; i < inventory.length; i++) {
		    System.out.println("Item: " + inventory[i][0] + "\tprice: " + inventory[i][1]);
		}
		
		}
	}

}
