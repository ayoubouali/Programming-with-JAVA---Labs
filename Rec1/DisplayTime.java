public class DisplayTime{
    public static void main(String args[]){
        long time= System.currentTimeMillis()%86400000;
       
        long h=time/3600000;
        long m=(time%3600000)/60000;
        long s=((time%3600000)%60000)/1000;
        
        System.out.println(h+":"+m+":"+s);
        
        
        
    }

}