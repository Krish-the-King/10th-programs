class Simple_Interest_C
{
    double p,r,t;
    int SI;
    Simple_Interest_C()
    {
        p=2000;
        r=2.5;
        t=2;
    }
    void calc()
    {
        SI=(int)((p*r*t)/100.0);
    }
    void disp()
    {
        System.out.println(SI);
    }
    public static void main()
    {
        Simple_Interest_C obj=new Simple_Interest_C();
        obj.calc();
        obj.disp();
    }
}
        