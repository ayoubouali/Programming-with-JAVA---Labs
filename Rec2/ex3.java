import java.util.Scanner;
public class ex3
{
    public static void main(String arg[]){
        System.out.println("Fisrt  matrix : \n*************");
        int[][] matrix1 = makeMat();
        System.out.println("Second matrix : \n*************");
        int[][] matrix2 = makeMat();
        
        if(matrix1[0].length==matrix2.length){
            System.out.println("The result : \n*************");
            showMat(multMat(matrix1,matrix2));
        }
        else{System.out.println("the multiplication of these two matrices is not defined!");}
        
    }
    
    public static int[][] makeMat(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of rows and number of colums : ");
        int n=input.nextInt(), m=input.nextInt();
        int[][] matrix = new int[n][m];
        
        for(int i=0; i<n; i++){
            System.out.print("Enter row number "+ i+1 +" : ");
            for(int j=0; j<m;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.println("");
        return matrix;
    }
    
    public static void showMat(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j] +",  ");
            }
            System.out.println("");
        }
    }
    
    public static int[][] multMat(int[][] mat1, int[][] mat2){
        int[][] product= new int[mat1.length][mat2[0].length];
        for(int i=0; i<product.length; i++){
            for(int j=0; j<product[0].length;j++){
                product[i][j]=0;
                for(int a=0;a<mat1[0].length;a++){
                    
                        product[i][j]+=(mat1[i][a]*mat2[a][j]);
                    
                }
            }
        }
        
        return product;
    }
}
