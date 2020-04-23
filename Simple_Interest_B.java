class Simple_Interest_B
{
    double p,r,t,SI1;
    int SI;
    void init()
    {
        p=2000;
        r=2.5;
        t=2;
    }
    void calc()
    {
        SI1=(p*r*t)/100.0;
        SI=(int)(SI1);
    }
    void disp()
    {
        System.out.println(SI);
    }
    public static void main()
    {
        Simple_Interest_B obj=new Simple_Interest_B();
        obj.init();
        obj.calc();
        obj.disp();
    }
}
        