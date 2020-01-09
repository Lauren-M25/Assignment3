/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: AxQy
 * Program Name:  name of public class
 *
 * Description: brief description of program
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class CS30SA3FuelEconomyClient {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
    	
    // ***** create objects *******

        Car car1 = new Car();

        // parameters for the inited constructor
        // are liters per 100k folowed by the amount of fuel in the tank
        Car car2 = new Car(9, 45);	    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        //ProgramInfo programInfo = new ProgramInfo("assignment name");
        
        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

// use your program info class from exercise 2.1 to print banners to the console
// window and to the output file.
	    	
    // ************************ get input **********************

    // ************************ processing ***************************
    
        System.out.println("Car 1");
        System.out.println("Car 1 fuel level: " + car1.getFuelLevel() + " litres");

        System.out.println("\n\nCar 2");
        System.out.println("Car 2 fuel Level: " + car2.getFuelLevel() + " litres");
        System.out.println("Car 2 fuel economy: " + car2.getLPK() + " l per 100 km");
        System.out.println("Car 2 distance to empty: " + car2.getDistance() + " kilometers");

// *** change the state of car 1 ***

        car1.gasUp(28);
        car1.setLPK(10.5);

        System.out.println("\n\nCar 1");
        System.out.println("Car 1 fuel level: " + car1.getFuelLevel() + " litres");
        System.out.println("Car 1 fuel economy: " + car1.getLPK() + " km per 100l");
        System.out.println("Car 1 distance to empty: " + car1.getDistance() + " kilometers");

        car1.drive(100);		// drive 100km in car 1

        System.out.println("\n\nCar 1 after driving 100km");
        System.out.println("Car 1 fuel level: " + (car1.getFuelLevel()) + " litres");
        System.out.println("Car 1 distance to empty: " + (car1.getDistance()) + " kilometers");



    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
// use your ProgramInfo class to print the closing messages

    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class
