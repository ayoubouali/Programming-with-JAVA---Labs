public class FAusingHA
{
    public static void main(String[] args)
    {
        // create the required gates
        HA ha1 = new HA("HA1");
        HA ha2 = new HA("HA2");
        OrGate or1 = new OrGate("OR1");
        
        
        //make the connections
        ha1.connectTo(2,or1,1);
        ha2.connectTo(2,or1,2);
        ha2.getS().connect(ha1.getIn2());
        
        
        //run the simulation
        boolean[] a = {false,true};
        boolean[] b = {false,true};
        boolean[] Cin = {false,true};
        
        
        for(int k=0;k<Cin.length;++k){
            ha1.setIn1Value(Cin[k]);
            System.out.println("Cin= "+ha1.getIn1Value());
            System.out.println("a\tb\tS\tCout");
        for(int i=0;i<a.length;++i){
            for(int j=0;j<b.length;++j){
                //set inputs
                ha2.setIn1Value(a[i]);
                ha2.setIn2Value(b[j]);
                
                //display the outputs
                System.out.println(ha2.getIn1Value()+"\t"+ha2.getIn2Value()
                    +"\t"+ha1.getSValue()+"\t"+or1.getOutValue());
                
                
            }
        }}
    }
}