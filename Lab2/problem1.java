import java.util.Scanner;

public class problem1{
    public static void main(String args[]){
           Scanner keyboard = new Scanner(System.in);
           int n1,n2,n3;
           
           System.out.print("Enter 3 integer numbers: ");
           n1= keyboard.nextInt();
           n2= keyboard.nextInt();
           n3= keyboard.nextInt();
           System.out.println("the greatest number is: "+maxInt(maxInt(n1,n2),n3));
    }
    
    public static int maxInt(int a, int b){
           return (a>b) ? a:b;
    }
    
}
