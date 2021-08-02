import java.util.Scanner;
public class pascalsTriangle{
    public static void main(String args[]){
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter the number of rows for the pascal's triangle: ");
        int n= keyboard.nextInt();
        showPascalTriangle(pascalTriangle(n));
    }
    
    public static int[][] pascalTriangle(int nRows){
        int[][] raggedArray = new int[nRows][];
        
        for(int c=0;c<raggedArray.length;c++){
            raggedArray[c]= new int[c+1];
        }
        
        for(int i=0;i<raggedArray.length;i++){
            for(int j=0;j<=i;j++){
                 if(i==j || j==0)
                 raggedArray[i][j]=1;
                 else raggedArray[i][j]=raggedArray[i-1][j-1]+raggedArray[i-1][j];
            }
        }
        
        return raggedArray;
    }
    
    public static void showPascalTriangle(int[][] raggedArray){
        for(int i=0;i<raggedArray.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(raggedArray[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
      
}