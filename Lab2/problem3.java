import java.util.Scanner;
public class problem3{
    public static void main(String args[]){
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter the length of the arrays: ");
        int n= keyboard.nextInt();
        int[] a=makeArray(n), b=makeArray(n);
        showArray(a);
        System.out.println("+");
        showArray(b);
        System.out.println("=");
        showArray(addArray(a,b));
        
        System.out.print("\nEnter the length of the array: ");
        int m= keyboard.nextInt();
        System.out.print("Enter the range max and min of: ");
        int max= keyboard.nextInt(),min= keyboard.nextInt();
        
        int[] d=makeArray(n,max,min);
        showArray(d);
        
    }
    
    public static int[] makeArray(int n){
        int[] array=new int[n];
        for(int i=0; i<array.length ;i++){
            array[i]=getRandom(10,1);
        }
        return array; 
    }
    
    public static int[] makeArray(int n,int max,int min){
        int[] array=new int[n];
        for(int i=0; i<array.length ;i++){
            array[i]=getRandom(max,min);
        }
        return array; 
    }
    
    public static void showArray(int[] myArray){ 
        System.out.print("{");
        for(int element: myArray){
                 System.out.print(element+", ");
        }
        System.out.println("}");
    }
    
    public static int[] addArray(int[] a , int[] b){
        int[] c=makeArray(a.length);
        for(int i=0;i<a.length;i++){
            c[i]=a[i]+b[i];
        }
        return c;
    }
    
    public static int getRandom(int max,int min){
        return (int)(Math.random()*((max-min)+1))+min;
    }
}