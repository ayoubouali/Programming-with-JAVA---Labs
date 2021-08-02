public class FA extends LogicGate
{
    // instance variables
    private GateTerminal in1,in2,Cin,S,Cout;

    /**
     * Constructor for objects of class FA
     */
    public FA(String partReference)
    {
      super(partReference);
      in1= new GateTerminal("IN1",GateTerminal.INPUT,this);
      in2= new GateTerminal("IN2",GateTerminal.INPUT,this);
      Cin= new GateTerminal("CIN",GateTerminal.INPUT,this);
      S= new GateTerminal("S",GateTerminal.OUTPUT,this);
      Cout= new GateTerminal("COUT",GateTerminal.OUTPUT,this);
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
    public GateTerminal getCin()
    {
        return Cin;
    }
    public GateTerminal getS()
    {
        return S;
    }
    public GateTerminal getCout()
    {
        return Cout;
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
    public boolean getCinValue()
    {
        return Cin.getTerminalValue();
    }
    public boolean getCoutValue()
    {
        return Cout.getTerminalValue();
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
    public void setCinValue(boolean value)
    {
        Cin.setTerminalValue(value);
    }
    
    /**
     * connectTo methods
     */
    public void connectTo(int out,OneInputGate gate)
    {
        if(out==1){
        S.connect(gate.getIn());}
        if(out==2){
        Cout.connect(gate.getIn());}
    }
    public void connectTo(int out,TwoInputGate gate, int terminal)
    {if(out==1){
        if(terminal==1){
        S.connect(gate.getIn1());}
        if(terminal==2){
        S.connect(gate.getIn2());}}
     if(out==2){
        if(terminal==1){
        Cout.connect(gate.getIn1());}
        if(terminal==2){
        Cout.connect(gate.getIn2());}}
    }
    
    /**
     * evaluate methos
     */
    @Override
    public void evaluate()
    {
        this.getS().setTerminalValue(this.getIn1Value() ^ this.getIn2Value() ^ this.getCinValue());
        this.getCout().setTerminalValue((this.getIn1Value() && this.getIn2Value())||(this.getCinValue()&&(this.getIn1Value() ^ this.getIn2Value())));
    }
}
