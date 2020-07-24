//WAP to make a calculator with methods to do basic calculations like 
//addition, subtraction, multiplication and division. 
//You have to accept two no. adn an operator. Make a calc method to call 
//the methods.
class Calculator2
{
    int ans;
    void add(int a,int b)
    {
        ans=a+b;
        System.out.println(ans);
    }
    void sub(int a,int b)
    {
        ans=a-b;
        System.out.println(ans);
    }
    void mul(int a,int b)
    {
        ans=a*b;
        System.out.println(ans);
    }
    void div(int a,int b)
    {
        ans=a/b;
        System.out.println(ans);
    }
    void calc(int a, int b,char ch)
    {
        if(ch=='+')
        {
            add(a,b);
        }
        else if(ch=='-')
        {
            sub(a,b);
        }
        else if(ch=='*')
        {
            mul(a,b);
        }
        else if(ch=='/')
        {
            div(a,b);
        }
        else
        {
            System.out.println("Please enter +,-,* or / only");
        }
    }
    public static void main(int a, int b, char ch)
    {
        Calculator2 obj=new Calculator2();
        obj.calc(a,b,ch);
    }
}
