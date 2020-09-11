import java.util.*;
class HCF
{
    int n1,n2,HCF=1;
    HCF()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no.");
        n1=sc.nextInt();
        System.out.println("Enter the second no.");
        n2=sc.nextInt();
    }
    void calc()
    {
        int n;
        if(n1>n2)
        n=n2;
        else
        n=n1;
        for(int i=1;i<=n;i++)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                HCF=i;
            }
        }
        System.out.println(HCF);
    }
    public static void main()
    {
        HCF obj=new HCF();
        obj.calc();
    }
}