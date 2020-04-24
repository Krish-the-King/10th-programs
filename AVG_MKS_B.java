//WAP to calculate average marks of three subjects of a student.
class AVG_MKS_B
{
    double chem,maths,comp;
    int avg;
    void init()
    {
        chem=100;
        maths=99;
        comp=100;
    }
    void calc()
    {
        avg=(int)Math.round((chem+maths+comp)/3);
    }
    void disp()
    {
        System.out.println(avg);
    }
    public static void main()
    {
        AVG_MKS_B obj=new AVG_MKS_B();
        obj.init();
        obj.calc();
        obj.disp();
    }
}