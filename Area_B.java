class Area_B
{
    final float pi=3.14F;
    void area(int i)
    {
        System.out.println("The area of the square with side "+i+" will be "+i*i);
    }
    void area(float l, float b)
    {
        System.out.println("The area of the rectangle with length "+l+" and breadth "+b+" is "+l*b);
    }
    void area(int r,int d)
    {
        System.out.println("The are of the circle with radius "+r+" is "+pi*r*r);
    }
    public static void main()
    {
        Area_B obj=new Area_B();
        obj.area(10);
        obj.area(10.0F,20.0F);
        obj.area(2,4);
    }
}