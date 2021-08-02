public class Example1
{
    public static void main(String[] args)
    {
        // create the required gates
        Buffer buf1 = new Buffer("BUF1");
        Buffer buf2 = new Buffer("BUF2");
        NotGate not1 = new NotGate("NOT1");
        NotGate not2 = new NotGate("NOT2");
        AndGate and1 = new AndGate("AND1");
        AndGate and2 = new AndGate("AND2");
        OrGate or1 = new OrGate("OR1");
        OrGate or2 = new OrGate("OR2");
        XorGate xor1 = new XorGate("XOR1");
        
        //make the connections
        buf1.connectTo(and1,1);
        buf1.connectTo(and2,1);
        buf1.connectTo(or1,1);
        buf1.connectTo(or2,1);
        buf1.connectTo(xor1,1);
        
        buf2.connectTo(and1,2);
        buf2.connectTo(and2,2);
        buf2.connectTo(or1,2);
        buf2.connectTo(or2,2);
        buf2.connectTo(xor1,2);
        
        and2.connectTo(not1);
        or2.connectTo(not2);
        
        //run the simulation
        boolean[] x1 = {false,true};
        boolean[] x2 = {false,true};
        
        System.out.println("X1\tX2\tY1\tY2\tY3\tY4\tY5");
        
        for(int i=0;i<x1.length;++i){
            for(int j=0;j<x2.length;++j){
                //set inputs
                buf1.setInValue(x1[i]);
                buf2.setInValue(x2[j]);
                
                //display the outputs
                System.out.print(buf1.getOutValue()+"\t"+buf2.getOutValue()+"\t");
                System.out.print(and1.getOutValue()+"\t"+or1.getOutValue()+"\t");
                System.out.print(xor1.getOutValue()+"\t");
                System.out.print(not1.getOutValue()+"\t"+not2.getOutValue()+"\n");
            }
        }
    }
}












