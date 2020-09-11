import java.util.*;
class Pattern2
{
    int n;
    Pattern2()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void pattern()
    {        
        int ch1=65,ch2=98;
        for(int i=1;i<=n;i++)
        {
            char ch;
            if(i%2!=0)
            {
                ch=(char)ch1;
                ch1+=2;
            }
            else
            {
                ch=(char)ch2;
                ch2+=2;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern2 obj=new Pattern2();
        obj.pattern();
    }
}