public class LogicGate
{
    // instance variables
    private String partReference;

    /**
     * Constructor for objects of class LogicGate
     */
    public LogicGate(String partReference)
    {
        this.partReference=partReference;
    }

    /**
     * Setter
     */
    public void setpartReference(String partReference)
    {
        this.partReference=partReference;
    }
    
    /**
     * Getter
     */
    public String getpartReference()
    {
        return partReference;
    }
    
    /**
     * evaluate methos
     */
    public void evaluate()
    {}
}
