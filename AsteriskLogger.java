package week05LoggerAssignment;

public class AsteriskLogger implements Logger { //AsteriskLogger that implements the parent Logger



@Override //overriding the parent method, inherits the method of the parent, has to override to do be "useful"
public void log(String log) { //log method 
	System.out.println("***" + log + "***"); //prints the String log with three *** on either side
} //end of log method 

@Override
public void error(String error) { //error method
	System.out.println("*******************"); //prints out asterisks 
	System.out.println("***Error: " + error + "***"); //prints the asterisks String error plus asterisks
	System.out.println("*******************"); //prints out asterisks
	
}//end of error method

} //end of public class

