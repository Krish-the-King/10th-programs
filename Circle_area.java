class Circle_area
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