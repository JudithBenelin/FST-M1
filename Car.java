package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(){
		tyres =4;
		doors=4; }
		
		public void displaycharecteristics() {
			System.out.println("The color of the car is : " + color);
			System.out.println("The transmission of the car is " + transmission);
			System.out.println("The make of the car is " + make);
			System.out.println("Number of tyres : " + tyres);
			System.out.println("Number of doors : " + doors);
			
		}
		
		public void accelarate() {
			System.out.println("Car is moving forward.");
		}
		
		public void brake() {
			System.out.println("Car has stopped.");
		}
	

}
