//WAP to calc area of circle if r=10.5cm,pi = 3.14 using non-interactive input
class Circle_Area_A1
{
    double r,area;
    final double pi=3.14;
    void init()
    {
        r=10.5;
    }
    void calc()
    {
        area=pi*r*r;
    }
    void disp()
    {
        System.out.print("The area of the circle is "+area);
    }
}