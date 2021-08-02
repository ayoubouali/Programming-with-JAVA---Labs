import java.util.Scanner;
public class program{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Television Demo");
        System.out.println("***************");
        System.out.print("Enter the brand Name  :");
        String b= input.nextLine();
        System.out.print("Enter the size (inch) :");
        int s= input.nextInt();
        Television tv1 = new Television(b,s);
        
        String c="";
        System.out.print("Your Tv is off would you like to turn it on? (Y/N):");
        while(c.equals("Y")==false && c.equals("N")==false){c=input.nextLine();}
        
        if(c.equals("Y")){
            tv1.togglePowerOnOff();
            tv1.getState();
            
            System.out.print("Enter the desired channel number :");
            tv1.setChannel(input.nextInt());
            System.out.print("Enter the desired volume level   :");
            setVolume(tv1,input.nextInt());
            tv1.getState();
            
            if(tv1.getVolume()>=60){
                System.out.println("Too loud! I am lowering the volume.");
                setVolume(tv1,21);
                tv1.getState();
            }
            if(tv1.getVolume()<=5){
                System.out.println("Too low! I am raising the volume.");
                setVolume(tv1,11);
                tv1.getState();
            }
            
            System.out.println("The phone is ringing!! I am muting your TV.");
            tv1.toggleMuteOnOff();
            tv1.getState();
            
            System.out.println("Welcome back, I am resuming your sound level.");
            tv1.toggleMuteOnOff();
            tv1.getState();
            
            String d="";
            System.out.print("Watching time excceded 2 hours, turn your Tv off(Y/N): ");
            while(d.equals("Y")==false && d.equals("N")==false){d=input.nextLine();}
            if(d.equals("Y")){System.out.println("\nBye!");}
            if(d.equals("N")){System.out.println("\nOK, maybe later");}
            
            
        }
        if(c.equals("N")){
            System.out.println("\nOK, maybe later!");
        }
        
    }
   
    
    public static void setVolume(Television tv, int n ){
        int v=tv.getVolume();
        if(v<n){
            for(int i=0; i<(n-v);i++){tv.increaseVolume();}
        }
        else{
            for(int i=0; i<(v-n);i++){tv.decreaseVolume();}
        }
    
     }
    
}