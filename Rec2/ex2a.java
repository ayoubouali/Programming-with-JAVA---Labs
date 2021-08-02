import java.util.Scanner;
public class ex2a{
    public static void main (String arg[]){
        Scanner keyboard= new Scanner(System.in);
        int n,digit;
        
        System.out.print("Enter an integer number: ");
        n= keyboard.nextInt();
        System.out.print("the digits of the number: ");
        while(n>0){
            digit=n%10;
            System.out.print(digit +"\t");
            n/=10;
        }
        
    }
}