public class Buffer extends OneInputGate
{
    /**
     * Constructor for objects of class Buffer
     */
    public Buffer(String partReference)
    {
        super(partReference);
    }

    /**
     * evaluate methos
     */
    @Override
    public void evaluate()
    {
        this.getOut().setTerminalValue(this.getInValue());
    }
}
