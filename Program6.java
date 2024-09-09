//import stuff here!
import java.util.Scanner;
public class Program6 {
    public static void main(String[] agrs){
        //define vars
        final double pi = 3.14159;
        double radius = 0;
        
        
        //Create my scanner
        Scanner DScanner = new Scanner(System.in);
        
        //Ask for user input 
        System.out.println("Enter the radius: ");
        radius = DScanner.nextDouble();
        
        //define var
        double diameter = 2 * radius;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;
        
        //decimals gone
        diameter = ((int)((diameter*1000)+0.5))/1000.0;
        area = ((int)((area*1000)+0.5))/1000.0;
        circumference = ((int)((circumference*1000)+0.5))/1000.0;
        
        //print results
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circumference);
        
    }
}
//Your code here

//Paste console output below:
/*
Enter the radius: 
3.712
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.288
The Circumference of the circle = 23.323

*/

