import java.util.Scanner;

class Greeting {
	
	//static String greeting_english, greeting_spanish, greeting_french;
	
	static String[] greetings = new String[3];
	static Scanner user_input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//greeting_english = "Hello World!";
		//greeting_spanish = "Hola Mundo!";
		//greeting_french = "Bonjour le Monde!";
		
		greetings[0] = "Hello World!";
		greetings[1] = "Hola Mundo!";
		greetings[2] = "Bonjour le Monde!";

		//greet(greetings[2]);
		
		displayUI();

	}
	
	public static void displayUI() {
		
		System.out.println();
		System.out.println("1. English");
		System.out.println("2. Spanish");
		System.out.println("3. French");
		System.out.println();
		
		int i = user_input.nextInt();
		
		greet(greetings[(i - 1)]);
		
	}
	
	public static void greet(String greeting) {
		
		System.out.println(greeting);
		
	}
	
}


// introduce array objects : my_array[i];
// introduce integers : -2,147,483,648 to 2,147,483,647
// introduce scanner objects : System.in

// write ui function

// pass ui as array index to greet function