package DogMaker;

import java.util.Scanner;

public class DogDemo {
	
	static Dog dog;
	
	static String breed;
	static String color;
	static String name;
	
	static int age;
	static int weight;
	
	static int user_input;
	
	public static void main(String[] args) {
		
		displayInstructions();
		
	}
	
	public static void displayInstructions() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Create a Dog");
		System.out.println();

		System.out.print("Breed: ");
		
		breed = in.nextLine();
		
		System.out.println();
		System.out.print("Color: ");
		
		color = in.nextLine();
		
		System.out.println();
		System.out.print("Name: ");
		
		name = in.nextLine();
		
		System.out.println();
		System.out.print("Age: ");
		
		age = in.nextInt();
		
		System.out.println();
		System.out.print("Weight: ");
		
		weight = in.nextInt();
		
		createDog();
	}

	public static void createDog() {
		
		dog = new Dog(breed, color, name, age, weight);

		displayState();

	}

	public static void displayState() {
		
		dog.printState();

		displayOptions();
		
	}
	
	public static void displayOptions() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. Feed");
		System.out.println("2. Play");
		System.out.println("3. Rest");
		System.out.println("4. Calm");
		System.out.println();
		
		user_input = in.nextInt();
		
		switch(user_input) {
			
			case 1:
				dog.feed();
				break;

			case 2:
				dog.play();
				break;
				
			case 3:
				dog.rest();
				break;
				
			case 4:
				dog.calm();
				break;
			
		}
		
		displayState();
		
	}
	
}