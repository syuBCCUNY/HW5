import java.util.*;

//http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/07/compute-pi.html information about monte carlo method from here

public class HW5{
	public static void main(String[] args){
		
	double radius = 10;
	long insidecirclecount = 0;
	long outsidecirclecount = 0;
	long totaldots = 4000000000L;
	double areaquadcircle = ((Math.PI * Math.pow(radius,2))/4);
	double areasquare = Math.pow(radius,2); 
	double randomdot = 0;
	
	for(long dot = 0; dot < totaldots; dot++){
		randomdot = (Math.random() * areaquadcircle + 1);
			if (randomdot <= areaquadcircle){
				insidecirclecount ++;
			}
			else 
				outsidecirclecount ++;
	
	}
	double ratio = insidecirclecount/totaldots;
	
	System.out.println("Number of dots inside circle: " + insidecirclecount);
	System.out.println("Number of dots outside circle: " + outsidecirclecount);
	System.out.println("Total number of dots: " + totaldots);
	System.out.println("Ratio of dots landed inside circle to total dots: " + ratio);	
	}
}