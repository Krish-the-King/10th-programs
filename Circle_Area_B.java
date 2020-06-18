class Circle_Area_B
{
    double r,area;
    final double pi=3.14;
    Circle_Area_B()
    {
        r=10.5;
    }
    void calc()
    {
        area=pi*r*r;
    }
    void disp()
    {
        System.out.println("The area of the circle is "+area);
    }
    public static void main()
    {
        Circle_Area_B obj=new Circle_Area_B();
        obj.calc();
        obj.disp();
    }
}