public class TestLock {

    public static void main(String[] args) {
        User user = new User(1000,"小明");
        Bank bank = new Bank(user,300);
        new Thread(bank,"小明").start();
        new Thread(bank,"小明老婆").start();
        new Thread(bank,"小明妈妈").start();
        new Thread(bank,"小明爸爸").start();

    }
}


//个人账户
class User{
    //全部的钱和名字
    int totalMoney;
    String name;

    public User(int totalMoney, String name){
        this.totalMoney = totalMoney;
        this.name = name;
    }

}

//银行取款
class Bank implements Runnable{
    User user;
    //要取的钱和现金
    int getMoney;
    int money;

    public Bank(User user,int getMoney){
        this.user = user;
        this.getMoney = getMoney;
    }

/*    @Override
    public synchronized void run() {
        if(getMoney> user.totalMoney){
            System.out.println("卡里余额不足");
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        money = getMoney;
        user.totalMoney = user.totalMoney-getMoney;
        System.out.println(Thread.currentThread().getName()+"取了"+getMoney+"\n"+user.name+"的卡余额为："+user.totalMoney);
    }*/
    @Override
    public void run() {
        synchronized (user){
            if(getMoney> user.totalMoney){
                System.out.println("卡里余额不足");
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money = getMoney;
            user.totalMoney = user.totalMoney-getMoney;
            System.out.println(Thread.currentThread().getName()+"取了"+getMoney+"\n"+user.name+"的卡余额为："+user.totalMoney);
        }
    }

}