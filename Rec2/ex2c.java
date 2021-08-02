import java.util.Scanner;
public class ex2c{
    public static void main (String arg[]){
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n= keyboard.nextInt();        
        System.out.print("Enter the digit : ");
        int d= keyboard.nextInt(); 
        
        System.out.println("the digit "+d+" occurres "+digitOccurrence(n,d)+" time(s)");
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
    public static int digitOccurrence(int n,int a){
        int[] array = convertToArray(n);
        int c=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==a){c++;}
        } 
        return c;
    }
}
    

