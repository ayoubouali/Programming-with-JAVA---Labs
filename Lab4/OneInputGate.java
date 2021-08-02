public class OneInputGate extends LogicGate
{
    // instance variables
    private GateTerminal in,out;

    /**
     * Constructor for objects of class OneInputGate
     */
    public OneInputGate(String partReference)
    {
      super(partReference);
      in= new GateTerminal("IN",GateTerminal.INPUT,this);
      out= new GateTerminal("OUT",GateTerminal.OUTPUT,this);
    }

    /**
     * getters
     */
    public GateTerminal getIn()
    {
        return in;
    }
    public GateTerminal getOut()
    {
        return out;
    }
    public boolean getInValue()
    {
        return in.getTerminalValue();
    }
    public boolean getOutValue()
    {
        return out.getTerminalValue();
    }
    
    
    /**
     * setter
     */
    public void setInValue(boolean value)
    {
        in.setTerminalValue(value);
    }
    
    /**
     * connectTo methods
     */
    public void connectTo(OneInputGate gate)
    {
        out.connect(gate.getIn());
    }
    public void connectTo(TwoInputGate gate, int terminal)
    {
        if(terminal==1){
        out.connect(gate.getIn1());}
        if(terminal==2){
        out.connect(gate.getIn2());}
    }
    
    /**
     * evaluate methos
     */
    @Override
    public void evaluate()
    {}
}







