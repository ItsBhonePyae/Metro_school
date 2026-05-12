package JavaLectures;

public class Reading_books {

	public static void main(String[] args) {
		String[][] libraryRecord =  {{"105MS" , "Marcus", "Smith", "25"},
                {"103AZ" , "Anthony" , "Zarrent" , "5" },
                {"108MW" , "Matt" , "White" , "12" },
                {"112DB" , "Denise" , "Bilton" , "58" },
                {"124MK" , "Malcolm" , "Kelly" , "26" },
                {"116UK" , "Uzere" , "Kevill" , "29" },
                {"127AL" , "Abduraheim" , "Leahy" , "94" },
                {"124LS" , "Laura" , "Sampras" , "50" },
                {"121AP" , "Azra" , "Potter" , "61" },
                {"115AC" , "Anthony" , "Calik" , "10" },
                {"117PI" , "Pablo" , "Iilyas" , "49" },
                {"113MM" , "Mark" , "Montgomerie" , "67" },
                {"130FH" , "Felicity" , "Heath" , "11" },
                {"132JA" , "Jill" , "Alexander" , "61" },
                {"123SG" , "Sara" , "Grimstow" , "9" },
                {"134KD" , "Kevin" , "Dawson" , "74" },
                {"122AB" , "Andrew" , "Bertwistle" , "42" },
                {"125JF" , "Jaide" , "Feehily" , "55" },
                {"128JS" , "Justin" , "Slater" , "68" },
                {"126CG" , "Colleen" , "Grohl" , "39" }};
		int sum = 0;
		int gold =0,silver=0,bronze=0;
		int gold_index=0,silver_index=0,bronze_index=0;
		
		System.out.print("the IDs of pupils who have read fewer than ten books: ");
		for(int i=0;i<libraryRecord.length;i++) {
			
				int num = Integer.parseInt(libraryRecord[i][3]);
				sum = sum+num;
				if (num<10) {
					System.out.print(libraryRecord[i][0]+"\t");
				}		
				if(num>gold) {
					bronze=silver;
					bronze_index=silver_index;
					
					silver=gold;
					silver_index = gold_index;
				
					gold = num;
					gold_index= i;
				}
				else if (num>silver) {
					bronze = silver;
					bronze_index = silver_index;
					
					silver = num;
					silver_index = i;
				}
				else if(num>bronze) {
					bronze = num;
					bronze_index = i;
				}
				
				
				
		
		}
		
		
		double aver = sum/libraryRecord.length;
		System.out.println("\nTotal: "+ sum);
		System.out.println("Average: " + aver);
		System.out.println("Gold Medalist: " +libraryRecord[gold_index][1]+" "+libraryRecord[gold_index][2] + " with " + gold +" books.");
		System.out.println("Silver Medalist: " +libraryRecord[silver_index][1]+" "+libraryRecord[silver_index][2] + " with " + silver +" books.");
		System.out.println("Bronze Medalist: " +libraryRecord[bronze_index][1]+" "+libraryRecord[bronze_index][2] + " with " + bronze +" books.");
	}

}
