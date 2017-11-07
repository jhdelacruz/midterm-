import java.util.Scanner;
public class simpleCalculator {

	public static void main(String[] args) {
	do {
		try {
		getMenu();		
	
	Scanner keyboard = new Scanner (System.in);
	int choice;
	choice = keyboard.nextInt();
				

	switch (choice) {
	
	case 1: getAddition(); break;
	case 2: getSubtraction(); break;
	case 3: getMultiplication(); break;
	case 4: getDivision(); break;
	case 5: System.out.print("Thank you for using Jared's Handy Calculator"); return;  
	
	default: System.out.print("Not a correct option. Please enter a number between 1 and 5");
	}

	}
	catch (Exception e) {
		System.out.println("Not a correct option. Please enter a number between 1 and 5");

	}
	} while (true);
	}
	
	
	
		


static void getAddition() {
	
	try {
		
	Scanner readInput = new Scanner (System.in);
	System.out.println(" ");
	   
	System.out.println("Please enter two floats to add, separated by a space: ");
		
		float a = readInput.nextFloat();
		float b = readInput.nextFloat();
			
		float sum = a + b;
		
	  System.out.printf("The result of adding %5.2f and %5.2f is: %5.2f", a, b, sum); 
		  
		}
	
		
	catch (Exception e) {
		System.out.print("You have entered invalid floats, please re-enter");
		
	}

	
getExit();

	}




static void getSubtraction() {
	
	try {
	Scanner readInput = new Scanner (System.in);
	
		System.out.println("Please enter two floats to subtract, separated by a space: ");
		
		float a = readInput.nextFloat();
		float b = readInput.nextFloat();
		float minus = a - b;
		
	  System.out.printf("The result of subtractiong %5.2f and %5.2f is: %5.2f", a, b, minus); 
						
	  } 
	catch (Exception e) {
		System.out.print("You have entered invalid floats, please re-enter");


	}

	
	System.out.println(" ");
	System.out.println("Press enter to continue");
	Scanner keyboard  = new Scanner (System.in);
	if (keyboard.nextLine() == "13") {
		return;
}
}
static void getMultiplication() {
	try {
	Scanner readInput = new Scanner (System.in);
	
		System.out.println("Please enter two floats to multiply, separated by a space: ");
		
		float a = readInput.nextFloat();
		float b = readInput.nextFloat();
		float product = a * b;
		
	  System.out.printf("The result of multiplying %5.2f and %5.2f is: %5.2f", a, b, product); 
						
	  } 
	catch (Exception e) {
		System.out.print("You have entered invalid floats, please re-enter");

}

	System.out.println(" ");
	System.out.println("Press enter to continue");
	Scanner keyboard  = new Scanner (System.in);
	if (keyboard.nextLine() == "13") {
		return;
}	
	
		
}

static void getDivision() {
	try {
		
		Scanner readInput = new Scanner (System.in);
	
		System.out.println("Please enter two floats to divide, separated by a space: ");
	
		float a = readInput.nextFloat();
		float b = readInput.nextFloat();
		if (b == 0) {
			
			System.out.print("You can not divide by zero");
		}
		else {
		float answer = a / b;
		
	  System.out.printf("The result of dividing %5.2f and %5.2f is: %5.2f", a, b, answer); 
		}
						
	  } 
	catch (Exception e) {
		System.out.print("You have entered invalid floats, please re-enter");

}
	System.out.println(" ");
	System.out.println("Press enter to continue");
	Scanner keyboard  = new Scanner (System.in);
	if (keyboard.nextLine() == "13") {
		return;
}
	
}

static void getMenu() {
	System.out.println("Welcome to Jared's Handy Calculator");
	
	System.out.println("");
	
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	System.out.println("5. Exit");
	
	System.out.println("");
	
	System.out.println("What would you like to do? ");

}

static void getExit() {
	System.out.println(" ");
	System.out.println("Press enter to continue");
	Scanner keyboard  = new Scanner (System.in);
	if (keyboard.nextLine() == "13") {
		return;
}
}
}