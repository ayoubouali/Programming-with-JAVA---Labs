public class XorGate extends TwoInputGate
{
    /**
     * Constructor for objects of class XorGate
     */
    public XorGate(String partReference)
    {
        super(partReference);
    }

    /**
     * evaluate methos
     */
    @Override
    public void evaluate()
    {
        this.getOut().setTerminalValue(this.getIn1Value() ^ this.getIn2Value());
    }
}