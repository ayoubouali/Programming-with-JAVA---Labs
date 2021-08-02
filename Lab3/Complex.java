public class Complex
{
    // instance variables
    private double R;
    private double Im;
    private double magnitude;
    private double phase;
    
    //Constructor for objects of class Complex
    public Complex(double r, double i)
    {
        R=r;
        Im=i;
        magnitude=Math.sqrt(Math.pow(r,2)+Math.pow(i,2));
        phase=Math.atan(i/r);
    }
    
    
    
    public void setReal(double r){
        R=r;
        magnitude=Math.sqrt(Math.pow(r,2)+Math.pow(Im,2));
        phase=Math.atan(Im/r);
    }
    public void setImg(double i){
        Im=i;
        magnitude=Math.sqrt(Math.pow(R,2)+Math.pow(i,2));
        phase=Math.atan(i/R);
    }
    
    public void setMagnitude(double m){
        magnitude=m;
        R=m*Math.cos(phase);
        Im=m*Math.sin(phase);
    }
    public void setPhase(double p){
        phase=p;
        R=magnitude*Math.cos(p);
        Im=magnitude*Math.sin(p);
    }
    
    public double getReal(){
        return R;
    }
    public double getImg(){
        return Im;
    }
    
    public double getMagnitude(){
        return magnitude;
    }
    public double getPhase(){
        return phase;
    }    
    
    
}
