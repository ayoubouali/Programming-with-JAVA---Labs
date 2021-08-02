import java.util.Scanner;
public class AreaAndCircumferenceOfACircleCalculator{
    public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    final double PI=3.14159;
    double r,a,c;
    System.out.print("Enter the diameter of the circle:");
    r=keyboard.nextDouble()/2;
    a=r*PI*PI;
    c=2*r*PI;
    
    System.out.println("The area of the circle is:"+ a);
    System.out.println("The circumference of the circle is:"+ c);
    
    }
}