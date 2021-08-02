import java.util.Scanner;
import java.lang.Math;
public class problem2recursive{
    public static void main(String args[]){
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter x: ");
        double x= keyboard.nextDouble();
        
        System.out.println("the exponential of "+x+" is "+exp(x));
    }
    
    public static double exp(double x){
        double e=1;
        for(int i=1;i<100;i++){e+=(Math.pow(x,i)/fact(i));}
        return e;
    }
    
    public static double fact(int n){
        if(n==0){return 1;}
        if(n==1){return 1;}
        else {return (n*fact(n-1));}
    }
}
