import java.util.Scanner;
public class ex1{
    public static void main(String arg[]){
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n= keyboard.nextInt();
        int[] a = new int[n];
        
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<a.length;i++){
            a[i]=keyboard.nextInt();
        }
        
        System.out.println("The largest number is: "+ max(a));
        System.out.println("The smallest number is: "+ min(a));
        System.out.println("The average is: "+ avg(a));
    
    }
    
    public static int max(int array[]){ 
        int m=array[0];
        for(int i = 0; i<array.length;i++){
                if (array[i] > m) {
                    m= array[i];
                }
            }
        return m;
    }
    
    public static int min(int array[]){ 
        int n=array[0];
        for(int i = 0; i<array.length;i++){
                if (array[i] < n) {
                    n= array[i];
                }
            }
        return n;
    }
    
    public static double avg(int array[]){ 
        double sum=0;
        for(int i = 0; i<array.length;i++){
             sum+= array[i];
        }
        return sum/array.length;
    }
}