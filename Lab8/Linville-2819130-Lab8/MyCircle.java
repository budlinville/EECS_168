
public class MyCircle{
    //Define the constant PI.
    public static final double PI = 3.141592; //static variables are initialized outside of a constructor
    
    //The MyCircle class has one property: radius
    private double radius;
            


    //The MyCircle class has methods too.
    MyCircle(){
    	radius = 0.0;
    }
     
    public double diameter(){
    	double diameter = radius * 2;
    	return(diameter);
    }

    public double area(){
    	double area = PI * radius * radius;
    	return(area);
    } 
    
    public double circumference(){
    	double circumference = 2 * PI * radius;
    	return(circumference);
    }
    
    public double getRadius(){
    	return(radius);
    }
        
    public void setRadius(double r){
    	radius = r;
    }
}