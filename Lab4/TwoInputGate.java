public class TwoInputGate extends LogicGate
{
    // instance variables
    private GateTerminal in1,in2,out;

    /**
     * Constructor for objects of class OneInputGate
     */
    public TwoInputGate(String partReference)
    {
      super(partReference);
      in1= new GateTerminal("IN1",GateTerminal.INPUT,this);
      in2= new GateTerminal("IN2",GateTerminal.INPUT,this);
      out= new GateTerminal("OUT",GateTerminal.OUTPUT,this);
    }

    /**
     * getters
     */
    public GateTerminal getIn1()
    {
        return in1;
    }
    public GateTerminal getIn2()
    {
        return in2;
    }
    public GateTerminal getOut()
    {
        return out;
    }
    public boolean getIn1Value()
    {
        return in1.getTerminalValue();
    }
    public boolean getIn2Value()
    {
        return in2.getTerminalValue();
    }
    public boolean getOutValue()
    {
        return out.getTerminalValue();
    }
    
    
    /**
     * setters
     */
    public void setIn1Value(boolean value)
    {
        in1.setTerminalValue(value);
    }
    public void setIn2Value(boolean value)
    {
        in2.setTerminalValue(value);
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
