package utilities;

import com.github.javafaker.Faker;

public class RandomDataUtility {
	static Faker faker;
	public static String getNewUserName() {
		 faker= new Faker();
		 String username= faker.name().username();
		 return username;
	}
	
	public static String getNewUserPassword() {
		 faker= new Faker();
		 String password= faker.name().username();
		 return password;
	}
	
	public static String getUserCategory() {
		 faker= new Faker();
		 String category= faker.name().username();
		 return category;
	}
	
	

}
