public class GateTerminal
{
    // instance variable
    private String terminalReference;
    private boolean terminalType;
    private boolean terminalValue;
    private LogicGate terminalOwner;
    private GateTerminal[] terminalConnections;
    
    //class constants
    static final boolean OUTPUT=false;
    static final boolean INPUT=true;
    

    /**
     * Constructor for objects of class GateTerminal
     */
    public GateTerminal(String terminalReference, boolean terminalType,LogicGate terminalOwner)
    {
        this.terminalReference=terminalReference;
        this.terminalType=terminalType;
        this.terminalOwner=terminalOwner;
    }

    /**
     * the setter method
     */
    public void setTerminalValue(boolean TerminalValue)
    {
        //Set
        this.terminalValue=TerminalValue;
        
        //
        if(terminalType==INPUT){  terminalOwner.evaluate(); }
        else{
            if(terminalConnections!=null)//connections exist
            {
                for(GateTerminal t: terminalConnections)
                {
                    t.setTerminalValue(terminalValue);
                }
            }
        }
    }
    
    /**
     * the getters methods
     */
    public boolean getTerminalValue()
    {
        return this.terminalValue;
    }
    public boolean getTerminalType()
    {
        return this.terminalType;
    }
    public String getTerminalReference()
    {
        return this.terminalReference;
    }
    public LogicGate getTerminalOwner()
    {
        return this.terminalOwner;
    }
    public GateTerminal[] getTerminalConnections()
    {
        return this.terminalConnections;
    }
    
    /**
     *the addTerminal method
     */
    private GateTerminal[] addTerminal(GateTerminal[] currentConnections, GateTerminal newConnection)
    {
        //create the array
        GateTerminal[] result= new GateTerminal[currentConnections.length+1];
        
        //make a copy
        for(int i=0; i<currentConnections.length;i++)
        {
            result[i]=currentConnections[i];
        }
        
        //add the newConnection
        result[currentConnections.length]=newConnection;
        
        return result;
        
    }
    
    /**
     * the connect method
     */
    public void connect(GateTerminal terminal)
    {
        
        if(terminalConnections !=null)
        {terminalConnections= addTerminal(terminalConnections, terminal);}
        else{
            terminalConnections= new GateTerminal[1];
            terminalConnections[0]=terminal;
        }
    }
    
}








