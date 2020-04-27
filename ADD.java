//WAP to add two numbers through method overloading.
class ADD
{
    void add(int i, int l)
    {
        System.out.println("Adding "+i+" and "+l+" will give "+(i+l));
    }
    void add(float i, float l)
    {
        System.out.println("Adding "+i+" and "+l+" will give "+(i+l));
    }
    void add(int i, float l)
    {
        System.out.println("Adding "+i+" and "+l+" will give "+(i+l));
    }
    void add(float i, int l)
    {
        System.out.println("Adding "+i+" and "+l+" will give "+(i+l));
    }
    public static void main()
    {
        ADD obj=new ADD();
        obj.add(10,20);
        obj.add(10.9F,19.1F);
        obj.add(10,20.0F);
        obj.add(10.0F,20);
    }
}