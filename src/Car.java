
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/********************************************************************
 * Programmer:	Lauren
 * Class:  CS30S
 *
 * Assignment: A3 Q1
 *
 * Description: Car object
**************************************************************************/


// import libraries as needed here

public class Car {
    //*** Class Variables ***
    
        private double fuellevel = 0;  // amount of fuel in the tank
        private double lpk = 0;  // litres per 100 km
        
    //*** Instance Variables ***
    
    //*** Constructors ***
    
    /*****************************************
    * Description: default constructor: create a car object with fuellevel
    * and lpk set to 0.
    * 
    * ****************************************/
        
        public Car(){
            this.lpk = 0.0; 
            this.fuellevel = 0.0;
        } // end of default constructor
    
   /*****************************************
    * Description: initialized constructor: create a car object with the lpk
    * and fuellevel set from the client class.
    * 
    * Interface:
    * 
    * @param        lpk: int, liters per 100 km
    * @param        fuellevel: int, fuel in the tank
    * ****************************************/
        
        public Car(int lpk, int fuellevel){
            
            this.lpk = lpk;
            this.fuellevel = fuellevel;
            
        }// end initialized constructor   
    
    //*** Getters ***
    
    /*****************************************
    * Description: return the fuel level
    * 
    * Interface:
    * 
    * @return       fuellevel: double, liters of fuel in the tank
    * ****************************************/
        
        public double getFuelLevel(){
            
            return this.fuellevel;
        } // end getFuelLevel
        
    /*****************************************
    * Description: return liters per 100 km
    * 
    * Interface:
    * 
    * 
    * @return       lpk: double, liters per 100 km
    * ****************************************/
        
        public double getLPK(){
            
            return this.lpk;
        }  // end  getLPK
        
    /*****************************************
    * Description: return distance until empty
    * 
    * Interface:
    * 
    * 
    * @return       distance: double, distance until empty
    * ****************************************/
        
        public double getDistance(){
            double distance = this.fuellevel / this.lpk * 100;
            return distance;
        }  // end  getDistance
    //*** Setters ***
    
   /*****************************************
    * Description: add gas to the tank
    * 
    * Interface:
    * 
    * @param        liters: int, liters in tank
    * 
    * ****************************************/
        
        public  void gasUp(int liters){
            this.fuellevel += liters;
        } // end gasUp
        
    /*****************************************
    * Description: set liters per 100 km
    * 
    * Interface:
    * 
    * @param        newlpk: double, new value of lpk
    * 
    * ****************************************/
        
        public  void setLPK(double newlpk){
            this.lpk += newlpk;
        } // end setLPK
        
    /*****************************************
    * Description: Drive (fuel level decreases)
    * 
    * Interface:
    * 
    * @param        distancekm: double, distance traveled (km)
    * 
    * ****************************************/
        
        public void drive(double distancekm){
            this.fuellevel = this.fuellevel - (this.lpk / 100) * distancekm;
        } // end drive
        
} // end of public class
