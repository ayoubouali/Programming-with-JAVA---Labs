import java.util.Scanner;
public class ex2b{
    public static void main (String arg[]){
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n= keyboard.nextInt();        
        int[] a = convertToArray(n);
        
        System.out.print("the array is : ");
        
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+ ",\t");
        }
        
        System.out.println("");
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
}
