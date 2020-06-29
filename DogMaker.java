package dogbreeder;

class DogMaker {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.assignBreed("Dalmation");
		dog1.assignColor("Spotted");
		dog1.assignName("Princess");
		dog1.assignAge(3);
		dog1.assignWeight(20);
		
		dog2.assignBreed("Dachshund");
		dog2.assignColor("Black");
		dog2.assignName("Fido");
		dog2.assignAge(5);
		dog2.assignWeight(8);
		
		dog1.displayState();
		dog2.displayState();
		
	}
	
}