import java.util.Scanner;

public class OddEvenNumber{
    public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    int n,r;
    System.out.print("Enter the number:");
    n= keyboard.nextInt();
    r=n%2;
        if (r==1){
            System.out.println("the number "+n+" is odd");
    
        }   else{
            System.out.println("the number "+n+" is even");
    
        }
   
    } 
}
