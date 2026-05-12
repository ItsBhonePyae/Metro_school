package JavaLectures;

public class email_check {

	public static void main(String[] args) {
		String email[]={"Ursa.Collins.@anuverplaice.co.uk", "George.Green.+anuverplaice.com", "Leanne.Young.@newmail1919.co.uk",
				"Mary.Ulrich.%sumwere19.com", "Zane.Quaid.&myschul2018.co.uk","Nancy.Oakley.@anuverplaice.com",
				"Aaron.Zachary.@somewer2000.co.uk", "Francis.Ulrich.%newmail1919.co.uk", "Thomas.Adams.@newmail1919.co.uk",
				"Zane.Adams.*myschul2018.co.uk", "Zane.Pearson.@anuverplaice.co.uk", "Wilma.Lawrence.%anuverplaice.com",
				"Zane.Montgomerie.@anuverplaice.co.uk", "Victoria.Drew.+newmail1919.co.uk", "Mary.Rawson.@newmail1919.co.uk", 
				"Mary.Winston.@newhere2019.com", "Wilma.Rawson.@myschul2018.co.uk", "Thomas.Evans.@mycoleg2010.co.uk",
				"Yvette.Turner.@sumwere19.com", "Aaron.Valdez.%anuverplaice.co.uk", "Jason.Pearson.@sumwere19.com",
				"Yvette.King.@mycoleg2010.co.uk", "Thomas.Green.@newmail1919.co.uk", "Nancy.Turner.&sumwere19.com",	
				"Mary.Green.%sumwere19.com", "Karla.Turner.@anuverplaice.com", "Colin.Oakley.@newhere2019.com",
				"Thomas.Xiong.@newmail1919.co.uk", "Ursa.King.@mycoleg2010.co.uk", "Leanne.Zachary.@ewhere2019.com",	
				"Zane.Lawrence.@sumwere19.com", "Zane.Oakley.@myschul2018.com", "Xavier.Ulrich.@myschul2018.co.uk",
				"Steven.Zachary.@mycoleg2010.co.uk", "Ursa.Collins.@newmail1919.co.uk","Colin.Nelson.@somewer2000.co.uk",
				"Colin.Turner.@newmail1919.co.uk", "Olive.Rawson.@newhere2019.com", "Yvette.Hiatt.+somewer2000.co.uk",
				"Jason.Forrest.*mycoleg2010.co.uk"};

		
		

		int invalid_count=0;

		for(int i=0;i<email.length;i++) {
			String input = email[i];
			boolean valid=false;
			char[] input_arr=input.toCharArray();
			for(int j=0;j<input_arr.length;j++) {
				if(input_arr[j]=='@') {
					valid=true;
				break;
				}
			
			}
			if(!valid) {
				invalid_count++;
			}
			
		}
		System.out.println("There are a total of " + invalid_count+" invalid email.");
	}

}
