package week05LoggerAssignment;

public class App { //class App

	public static void main(String[] args) { //main method
		
//AsteriskLogger
		AsteriskLogger aL = new AsteriskLogger(); //instantiating the implementation of AsteriskLogger, making an object of the class, aL is the object
		aL.log ("Gordon"); //passing the String into the asterisk logger, calling the log method passing in Gordon
		System.out.println(); 
		aL.error("Gordon"); //calling the error method 
		
System.out.println();//blank line to create a space in the console 
System.out.println();//blank line to create a space in the console 

//SpacedLogger
		SpacedLogger sL = new SpacedLogger(); //instantiating the implementation of SpacedLogger
		sL.log("Gordon"); //passing the String into the log spaced logger
		System.out.println(); //blank line to create a space in the console
		sL.error("Gordon"); //passing the String into the error spaced logger
	
		
	}
	

}
