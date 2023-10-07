package week05LoggerAssignment;

public class SpacedLogger implements Logger { //SpacedLogger that implements the parent Logger

	@Override 
	public void log(String log) { //log method 

		for (int i = 0; i < log.length(); i++) { //for loop to loop through the length of the String error
			System.out.print(log.charAt(i) + " "); //prints the String with spaces in between each character
		
		}
		System.out.println(); // printing a line to drop down

	}

	@Override
	public void error(String error) {//error method
		System.out.print("ERROR: "); //prints out the "ERROR: "
		for (int i = 0; i < error.length(); i++) { //for loop to loop through the length of the String error. 
			System.out.print(error.charAt(i) + " "); //print the character and adds space in between each character/letter. Use the print w/o line to keep the name on one line.
		} //end of the for loop
	}//end of error method
	
}//end of public class SpaceLogger
