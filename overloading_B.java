//design a class to overload a function num_cacl() so follows
//a) void num_calc(int num, char ch) with one integer argument and one charector argument, computes the square of integer arguement if choice is 's' otherwise finds its cube
//b) void num_cacl(int a, int b, char ch) with two integer arguements and one charector arguement it computes the profuct of the two integer arguments if ch is p' else adds the integers.
class overloading_B
{
    void num_calc(int num, char ch)
    {
        if(ch=='s')
        {
            System.out.println("The square of "+num+" is "+num*num);
        }
        else
        {
            System.out.println("The cube of "+num+" is "+num*num*num);
        }
    }
    void num_calc(int a, int b, char ch)
    {
        if (ch=='p')
        {
            System.out.println("The product of the integers is "+a*b);
        }
        else
        {
            System.out.println("The sum of the integers is "+(a+b));
        }
    }
    public static void main()
    {
        overloading_B obj=new overloading_B();
        obj.num_calc(1,2,'s');
        obj.num_calc(3,'s');
    }
}