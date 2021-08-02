import java.util.Scanner;
public class BMI{
    public static void main(String args[]){
        Scanner keyboard= new Scanner(System.in);
        double w,h,BMI;
        System.out.println("Enter your weight in pounds: ");
        w=keyboard.nextDouble();
        System.out.println("Enter your height in inches: ");
        h=keyboard.nextDouble();
        
        BMI=(w*0.45359237)/((h*0.0254)*(h*0.0254));
        
        if(BMI<18.5){
            System.out.println("your BMI="+BMI+", You are Underweight.");
        }
        if(BMI>=18.5 && BMI<=24.9){
            System.out.println("your BMI="+BMI+", You are Normal.");
        }
        if(BMI>=25 && BMI<=29.9){
            System.out.println("your BMI="+BMI+", You are Overweight.");
        }
        if(BMI>30){
            System.out.println("your BMI="+BMI+", You are Obese.");
        }
        
    
    }
}