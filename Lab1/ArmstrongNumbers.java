public class ArmstrongNumbers{
    public static void main(String args[]){
    int n,m,sum=0;
    System.out.print("the Armstrong numbers are:");
    for(int i=100; i<=1000;++i){
        n=i;
        while(n>0){
            m=n%10;
            sum+=(m*m*m);
            n/=10;
        }
        if(sum==i){System.out.print(i+", ");}
        sum=0;
    }
    System.out.println(" ");
    }
}