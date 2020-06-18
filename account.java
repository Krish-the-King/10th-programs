class account
{
    double balance;
    account()
    {
        balance=0;
    }
    void start_account(double balance)
    {
        this.balance=balance;//this is pointer to instance variable
    }
    void deposit_money(double deposit)
    {
        balance+=deposit;
        System.out.println("The amt. deposited is "+deposit);//amt deposited by the user
    }
    void withdraw_money(double withdraw)
    {
        balance-=withdraw;
        System.out.println("The amt. withdrawn is "+withdraw);//amt withdrawn by the user
    }
    void current_balance_amt()
    {
        System.out.println("The current balance is "+balance);//print remaining balance
    }
    public static void main(double balance,double deposit,double withdraw)
    {
        account obj=new account();
        obj.start_account(balance);
        obj.deposit_money(deposit);
        obj.withdraw_money(withdraw);
        obj.current_balance_amt();
    }
}