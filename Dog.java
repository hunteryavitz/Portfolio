package dogbreeder;

class Dog {
	
	
	String breed, color, name;
	
	int age, weight;
	
	void assignBreed(String dog_breed) {
		
		breed = dog_breed;
		
	}
	
	void assignColor(String dog_color) {
		
		color = dog_color;
		
	}
	
	void assignName(String dog_name) {
		
		name = dog_name;
		
	}
	
	void assignAge(int dog_age) {
		
		age = dog_age;
		
	}
	
	void assignWeight(int dog_weight) {
		
		weight = dog_weight;
		
	}
	
	void displayState() {
		
		System.out.println();
		System.out.println("Breed: " + breed);
		System.out.println("Color: " + color);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		
	}
	
}