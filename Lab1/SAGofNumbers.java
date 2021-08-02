import java.util.Scanner;
import java.util.Arrays;

public class SAGofNumbers{
    public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    int[] numbers= new int[3];
    System.out.print("Enter 1st number: ");
    numbers[0]= keyboard.nextInt();
    System.out.print("Enter 2nd number: ");
    numbers[1]= keyboard.nextInt();
    System.out.print("Enter 3rd number: ");
    numbers[2]= keyboard.nextInt();
    
    java.util.Arrays.sort(numbers);
    
    System.out.print("the greatest number is: "+numbers[2]);
    System.out.print("\nthe smallest number is: "+numbers[0]);
    System.out.print("\nthe average number is: "+numbers[1]);
    }
}