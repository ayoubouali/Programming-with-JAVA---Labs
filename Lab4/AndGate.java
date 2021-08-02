public class AndGate extends TwoInputGate
{
    /**
     * Constructor for objects of class AndGate
     */
    public AndGate(String partReference)
    {
        super(partReference);
    }

    /**
     * evaluate methos
     */
    @Override
    public void evaluate()
    {
        this.getOut().setTerminalValue(this.getIn1Value() && this.getIn2Value());
    }
}