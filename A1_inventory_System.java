package TSW_sensei_assignment;

public class A1_inventory_System {
	static String[][] inventory = 	{{"Apple","700$"},
									{"Orange","500$"},
									{"Mango","600$"},
									{"Ginger","800$"},
									{"Blueberry","900$"},
									{"Potato","550$"},
									{"Tomato","450$"}};
	
	static int size1 = inventory[1].length;
		
	//Insert
	
	public String[][] insert(String[][] new_arr,int index,String item,String price){
		
		for(int i= 0,j=0;i<new_arr.length;i++) {
			if(i==index) {
				new_arr[i][0] = item;
				new_arr[i][1] = price;
			}
			else {
				new_arr[i][0] = inventory[j][0];
				new_arr[i][1] =inventory[j][1];
			j++;
			}
		}
		return new_arr;
	}
		
	//Delete
	
	public String[][] delete(String[][] after_delete,int index) {
		
		for(int i= 0,j=0,k=0;i<after_delete.length;i++) {
			if(i != index) {
				after_delete[i][0] = inventory[j+k][0];
				after_delete[i][1] = inventory[j+k][1];
			}
			else {
				after_delete[i][0] = inventory[index+1][0];
				after_delete[i][1] = inventory[index+1][1];
			k++;
			}
		j++;
		}
		
	return after_delete;
	}

	//Search & Update
	
	public String[][] search_and_update(String[][] inventory,String oldvalue,String newvalue,String newprice) {
		boolean found = false;
		for(int i= 0;i<inventory.length;i++) {
			if(inventory[i][0].toLowerCase().contains(oldvalue.toLowerCase())) {
				inventory[i][0] = newvalue;
				inventory[i][1] = newprice;
				found = true;
			}
			}
		if(found) {
			return inventory;
		}
		else {
			System.out.println(oldvalue+ " not found in array.");
		}
	return inventory;
	}



}
