public class $4BitAdder
{
    public static void main(String[] args)
    {
        // create the required gates
        FA fa1 = new FA("FA1");
        FA fa2 = new FA("FA2");
        FA fa3 = new FA("FA3");
        FA fa4 = new FA("FA4");
        
        
        
        //make the connections
        fa1.getCout().connect(fa2.getCin());
        fa2.getCout().connect(fa3.getCin());
        fa3.getCout().connect(fa4.getCin());
        
        
        
        //run the simulation
       
        boolean[] Cin = {false,true};
        boolean[] a = {false,true,true,false};
        boolean[] b = {false,true,false,true};
        
        
        for(int k=0;k<Cin.length;++k){
            fa1.setCinValue(Cin[k]);
             
                //set inputs
                fa1.setIn1Value(a[0]);
                fa1.setIn2Value(b[0]);
                fa2.setIn1Value(a[1]);
                fa2.setIn2Value(b[1]);
                fa3.setIn1Value(a[2]);
                fa3.setIn2Value(b[2]);
                fa4.setIn1Value(a[3]);
                fa4.setIn2Value(b[3]);
                
                //display the outputs
                System.out.println("a3\ta2\ta1\ta0\tCin");
                System.out.println(fa4.getIn1Value()+"\t"+fa3.getIn1Value()+"\t"+fa2.getIn1Value()+"\t"+fa1.getIn1Value()+"\t"+fa1.getCinValue()+"\n");
                System.out.println("b3\tb2\tb1\tb0");
                System.out.println(fa4.getIn2Value()+"\t"+fa3.getIn2Value()+"\t"+fa2.getIn2Value()+"\t"+fa1.getIn2Value()+"\n");
                
                System.out.println("S3\tS2\tS1\tS0\tCout");
                System.out.println(fa4.getSValue()+"\t"+fa3.getSValue()+"\t"+fa2.getSValue()+"\t"+fa1.getSValue()+"\t"+fa4.getCoutValue()+"\n");
                System.out.println("********************************************\n");
                
            
        }
    }
}