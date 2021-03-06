//The purpose of this class is to model a television
//OUALI Ayoub /12/2019
public class Television
{
    //manufacturer holds the brand name               
    private final String manufacturer;
    //screenSize holds the size in inches of the television screen.            
    private final int screenSize;
    //powerOn holds the value true if the power is on else false 
    private boolean powerOn=false;
    //muteOn holds the value true if the volume level is not zero else false
    private boolean muteOn=false;
    //channel holds the value of the station that the television is showing
    private int channel=2;
    //volume holds a number value representing the volume of television
    private int volume=20;
    
    //temporary holds value of the volume before mute
    private int temporary=0;

    //Constructor for objects of class Television
    public Television(String brand,int size)
    {
        manufacturer=brand;
        screenSize=size;
        
    }

    //store the desired station in the channel field
    public void setChannel (int c)
    {
        channel = ((c>=1 && c<=500) ? c : channel);
    }
    
    //toggle the power between on and off
    public void togglePowerOnOff ()
    {
        powerOn=!powerOn;
    }
    
    //set volume to '0' or set it back to previous value
    public void toggleMuteOnOff ()
    {
        if(muteOn==false){
            temporary= volume;
            volume=0;
            muteOn=true;
        }
        else{
            volume=temporary;
            muteOn=false;
        }
    }
    
    //increase vomule by '1'
    public void increaseVolume ()
    {
        volume=((volume<100) ? ++volume : 100);
    }
    
    //decrease vomule by '1'
    public void decreaseVolume ()
    {
        volume=((volume>0) ? --volume : 0);
    }
    
    //return the value of channel
    public int getChannel ()
    {
        return channel;
    }
    
    //return the value of volume
    public int getVolume ()
    {
        return volume;
    }
    
    //return the value of manufacturer
    public String getManufacturer ()
    {
        return manufacturer;
    }
    
    //return the value of screenSize
    public int getScreenSize ()
    {
        return screenSize;
    }
    
    //print out the state of the television
    public void getState(){
        System.out.println("\nHere is the state of your TV now:");
        System.out.println("**********************************************");
        System.out.println("manufacturer : " +manufacturer);
        System.out.println("screen size  : " +screenSize);
        System.out.println((powerOn==true) ? "it is powerd on" : "it is powerd off");
        System.out.println((muteOn==true) ? "mute         : Yes" : "mute         : No");
        System.out.println("channel      : " +channel);
        System.out.println("volume       : " +volume);
        System.out.println("********************************************** \n \n");

    }
}
