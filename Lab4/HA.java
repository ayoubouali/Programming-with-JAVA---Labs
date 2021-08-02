public class HA extends LogicGate
{
    // instance variables
    private GateTerminal in1,in2,S,C;

    /**
     * Constructor for objects of class HA
     */
    public HA(String partReference)
    {
      super(partReference);
      in1= new GateTerminal("IN1",GateTerminal.INPUT,this);
      in2= new GateTerminal("IN2",GateTerminal.INPUT,this);
      S= new GateTerminal("S",GateTerminal.OUTPUT,this);
      C= new GateTerminal("C",GateTerminal.OUTPUT,this);
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
    public GateTerminal getS()
    {
        return S;
    }
    public GateTerminal getC()
    {
        return C;
    }
    public boolean getIn1Value()
    {
        return in1.getTerminalValue();
    }
    public boolean getIn2Value()
    {
        return in2.getTerminalValue();
    }
    public boolean getSValue()
    {
        return S.getTerminalValue();
    }
    public boolean getCValue()
    {
        return C.getTerminalValue();
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
    public void connectTo(int out,OneInputGate gate)
    {
        if(out==1){
        S.connect(gate.getIn());}
        if(out==2){
        C.connect(gate.getIn());}
    }
    public void connectTo(int out,TwoInputGate gate, int terminal)
    {if(out==1){
        if(terminal==1){
        S.connect(gate.getIn1());}
        if(terminal==2){
        S.connect(gate.getIn2());}}
     if(out==2){
        if(terminal==1){
        C.connect(gate.getIn1());}
        if(terminal==2){
        C.connect(gate.getIn2());}}
    }
    
    /**
     * evaluate methos
     */
    @Override
    public void evaluate()
    {
        this.getS().setTerminalValue(this.getIn1Value() ^ this.getIn2Value());
        this.getC().setTerminalValue(this.getIn1Value() && this.getIn2Value());
    }
}
