public class TwoInputMUX
{
    public static void main(String[] args)
    {
        // create the required gates
        Buffer buf1 = new Buffer("BUF1");
        NotGate not1 = new NotGate("NOT1");
        AndGate and1 = new AndGate("AND1");
        AndGate and2 = new AndGate("AND2");
        OrGate or1 = new OrGate("OR1");
        
        
        //make the connections
        buf1.connectTo(not1);
        buf1.connectTo(and2,1);
        and1.connectTo(or1,1);
        and2.connectTo(or1,2);
        not1.connectTo(and1,2);
        
        //run the simulation
        boolean[] i0 = {false,true};
        boolean[] i1 = {false,true};
        boolean[] c = {false,true};
        
        
        for(int k=0;k<c.length;++k){
            buf1.setInValue(c[k]);
            System.out.println("C= "+buf1.getInValue());
            System.out.println("i0\ti1\tQ");
        for(int i=0;i<i0.length;++i){
            for(int j=0;j<i1.length;++j){
                //set inputs
                and1.setIn1Value(i0[i]);
                and2.setIn2Value(i1[j]);
                
                //display the outputs
                System.out.print(and1.getIn1Value()+"\t"+and2.getIn2Value()+"\t"+or1.getOutValue()+"\n");
                
                
            }
        }}
    }
}