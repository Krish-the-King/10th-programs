//WAP to calculate the SI if p=2000, r=3.5 and t=2 using non-interactive input
class Simple_Interest_A1
{
    double p,t,r,SI;
    void init()
    {
        p=2000;
        r=3.5;
        t=2;
    }
    void calc()
    {
        SI=(p*r*t)/100;
    }
    void disp()
    {
        System.out.println("The simple interest is " + SI);
    }
}