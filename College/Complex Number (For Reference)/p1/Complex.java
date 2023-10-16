package p1;
public class Complex {
    private int real, imag;
    public Complex()
    {
        real=0;
        imag=0;
        
    }
    public Complex(int real, int imag)
    {
        this.real=real;
        this.imag=imag;
        
    }
    protected void setReal(int real)
    {
        this.real=real;
    }
    protected void setImag(int imag)
    {
        this.imag=imag;
        
    }
    protected int getReal()
    {
        return this.real;
    }
    protected int getImag()
    {
        return this.imag;
    }
    public Complex add(Complex c1)        
    {
        Complex retObj = new Complex();
        retObj.setReal(this.real+c1.real);
        retObj.setImag(this.imag+c1.imag);
        return retObj;
       
    }
    public void display()
    {
     //   System.out.println(System.getProperty("user.dir"));
        System.out.println(real+"+"+imag+"i");
    }
    public String toString()
    {
     return real+"+"+imag+"i";   
    }

}
class Main{
    public static void main(String args[])
    {
        Complex objComp=new Complex(4,5);
        objComp.display();
        String s="Hello"+objComp;
         System.out.println(objComp);
    }
}
