import java.util.Scanner;
public class program2
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Complex Arithmetic\n***************\n");
        System.out.print("Enter the first complex number (RelPart,ImgPart):");
        Complex n1 = new Complex(input.nextDouble(),input.nextDouble());
        System.out.print("Enter the second complex number (RelPart,ImgPart):");
        Complex n2 = new Complex(input.nextDouble(),input.nextDouble());
        
        System.out.println("\nSelect one Operation\n***************\n");
        System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Magnitude and Phase\n\nYour choice : ");
        int o= input.nextInt();
        
        switch(o){
            case 1:{System.out.println("\nAnswer : "+addition(n1,n2));break;}
                    
            case 2:{System.out.println("\nAnswer : "+subtraction(n1,n2));break;}
                    
            case 3:{System.out.println("\nAnswer : "+multiplication(n1,n2));break;}
                    
            case 4:{System.out.println("\nAnswer : "+division(n1,n2));break;}
                    
            case 5:{System.out.println("\nAnswer : \n\t*1st number: "+magnitudePhase(n1)+"\n\t*2nd number :"+magnitudePhase(n2));break;}
        }
        

    
    }
    
    public static String addition(Complex n1,Complex n2 ){
        double r=n1.getReal()+n2.getReal();
        double i=n1.getImg()+n2.getImg();
        return (r+" + j "+i);
    }
    
    public static String subtraction(Complex n1,Complex n2 ){
        double r=n1.getReal()-n2.getReal();
        double i=n1.getImg()-n2.getImg();
        return (r+" + j "+i);
    }
    
    public static String multiplication(Complex n1,Complex n2 ){
        Complex n = new Complex(1,1);
        n.setMagnitude(n1.getMagnitude()*n2.getMagnitude());
        n.setPhase(n1.getPhase()+n2.getPhase());
       
        return (n.getReal()+" + j "+n.getImg());
    }
    
    public static String division(Complex n1,Complex n2 ){
        Complex n = new Complex(1,1);
        n.setMagnitude(n1.getMagnitude()/n2.getMagnitude());
        n.setPhase(n1.getPhase()-n2.getPhase());
       
        return (n.getReal()+" + j "+n.getImg());
    }
    
    public static String magnitudePhase(Complex n){
        return (n.getMagnitude()+" ∠ "+n.getPhase());
    }
}
