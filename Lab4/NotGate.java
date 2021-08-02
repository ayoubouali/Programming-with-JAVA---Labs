public class NotGate extends OneInputGate
{
    /**
     * Constructor for objects of class NotGate
     */
    public NotGate(String partReference)
    {
        super(partReference);
    }

    /**
     * evaluate methos
     */
    @Override
    public void evaluate()
    {
        this.getOut().setTerminalValue(!this.getInValue());
    }
}