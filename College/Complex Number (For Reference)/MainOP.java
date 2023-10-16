import p1.Complex;

public class MainOP extends Complex{

    MainOP()
    {
        //super();
    }
    MainOP(int r, int i)
    {
        super(r,i); 
        System.out.print("Child");
    }

    public MainOP sub(MainOP c1)        
    {
        MainOP retObj = new MainOP();
        retObj.setReal(this.getReal() - c1.getReal());
        retObj.setImag(this.getImag()-c1.getImag());
        return retObj;
       
    }
    
//     this.setReal(r);
//     this.setImag(i);
    
    public static void main(String args[])
    {
        MainOP objComp=new MainOP();
        objComp.setReal(10);
        objComp.display();
        int i = objComp.getReal();
        
    }
}
