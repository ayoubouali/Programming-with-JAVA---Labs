import java.util.Scanner;
public class problem4{
    public static void main(String args[]){
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n= keyboard.nextInt();
        int[] a = new int[n];
        
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<a.length;i++){
            a[i]=keyboard.nextInt();
        }
        System.out.print("The array: ");
        showArray(a);
        
        sortArray(a);
        System.out.print("The sorted array in an increasing order: ");
        showArray(a);
    }
    
    public static void sortArray(int[] array){
        int i=array.length-1;
        while(i > 0){
            for(int j=0 ;j<i;++j){
                if(array[j] > array[j+1]){
                    int a =array[j];
                    array[j]=array[j+1];
                    array[j+1]=a;
                }
            }
            i--;
        }
    }
   
    public static void showArray(int[] myArray){ 
        System.out.print("{");
        for(int element: myArray){
                 System.out.print(element+", ");
        }
        System.out.println("}");
    }
   
}