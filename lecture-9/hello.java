//package lecture-9;
class atm{
    private int totalbalance=500;
    public void getb(){
        System.out.println(totalbalance);
    }
    public void deposit(int amount){
        if(amount>0){
            totalbalance+=amount;
            System.out.println(totalbalance);
        }
    }
    public void withdraw(int amount){
        if(totalbalance>amount){
            totalbalance-=amount;
            System.out.println(totalbalance);
        }
    }
}
class hello{
    public static void main(String[] args){
        atm a1=new atm();
        a1.withdraw(100);
        a1.deposit(200);
    }
}

