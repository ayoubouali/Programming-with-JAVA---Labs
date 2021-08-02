import java.util.Scanner;

public class SumOfDigits{
    public static void main(String args[]){
        Scanner keyboard= new Scanner(System.in);
        int n,m,sum=0;
        
        System.out.print("Enter a number: ");
        n= keyboard.nextInt();
        
        while(n>0){
            m=n%10;
            sum+=m;
            n/=10;
        }
        
        System.out.println("the sum of the digits is: "+sum);

        
        }
    }