import java.util.Scanner;
public class ex2d{
    public static void main (String arg[]){
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n= keyboard.nextInt();        
        
        System.out.println("the sum of the square of the digits is:  "+addSqrDig(n));
    }
    public static int[] convertToArray(int n){
        int m=n,d,c=0;
        
        while(m>0){
            m/=10;
            c++;
        }
        
        int[] a =new int[c];
        
        for(int i=0; i<c;i++){
                d=n%10;
                a[i]=d;
                n/=10;
                
        }
        
        return a;
    
    }
    public static int addSqrDig(int n){
        int[] array = convertToArray(n);
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=(array[i]*array[i]);
        } 
        return sum;
    }
}
    

