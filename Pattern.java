import java.util.*;
class Pattern
{
    int n;
    Pattern()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void pattern()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<2*i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern obj=new Pattern();
        obj.pattern();
    }
}