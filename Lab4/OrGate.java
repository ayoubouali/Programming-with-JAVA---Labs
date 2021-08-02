public class OrGate extends TwoInputGate
{
    /**
     * Constructor for objects of class OrGate
     */
    public OrGate(String partReference)
    {
        super(partReference);
    }

    /**
     * evaluate methos
     */
    @Override
    public void evaluate()
    {
        this.getOut().setTerminalValue(this.getIn1Value() || this.getIn2Value());
    }
}