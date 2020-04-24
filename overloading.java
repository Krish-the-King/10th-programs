//WAP to demonstrate method overloading to accept values of differnt data types and output their squares
class overloading
{
    void prnsqr(int i)
    {
        System.out.println("the square of "+i+" is "+i*i);
    }
    void prnsqr(char c)
    {
        System.out.println(c+" is a charector\nthere is no square");
    }
    void prnsqr(float f)
    {
        System.out.println("the square of "+f+" is "+f*f);
    }
    void prnsqr(double d)
    {
        System.out.println("the square of "+d+" is "+d*d);
    }
    public static void main()
    {
        overloading obj=new overloading();
        obj.prnsqr(4);
        obj.prnsqr(3.6);
        obj.prnsqr(6.5f);
        obj.prnsqr('A');
    }
}
        