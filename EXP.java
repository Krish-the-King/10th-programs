import java.util.*;
class EXP
{
    int x, y,ans;
    EXP()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value for x");
        x=sc.nextInt();
        System.out.println("Enter a value for y");        
        y=sc.nextInt();
    }
    void calc()
    {
        ans=(int)((Math.pow((x+y),2))/(Math.sqrt(3)+y));
    }
    void disp()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        EXP obj=new EXP();
        obj.calc();
        obj.disp();
    }
}