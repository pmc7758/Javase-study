public class TestDeadLock {
    public static void main(String[] args) {
        PlayGame playGame = new PlayGame();
        new Thread(playGame,"a").start();
        new Thread(playGame,"b").start();
    }
}

class Lol{

}

class Dnf{

}

class PlayGame implements Runnable{
    //可以理解为资源只有一份（只有一个游戏账户）
    static Lol lol = new Lol();
    static Dnf dnf = new Dnf();


    @Override
    public void run() {
        try {
            playGame();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private void playGame() throws InterruptedException {
        if(Thread.currentThread().getName()=="a"){
            synchronized (lol){
                System.out.println(Thread.currentThread().getName()+"获得LOL的锁");
                Thread.sleep(1000);
            }
            synchronized (dnf){
                System.out.println(Thread.currentThread().getName()+"获得DNF的锁");
            }
        }else {
            synchronized (dnf){
                System.out.println(Thread.currentThread().getName()+"获得DNF的锁");
                Thread.sleep(2000);
            }
            synchronized (lol){
                System.out.println(Thread.currentThread().getName()+"获得LOL的锁");
            }
        }
    }
}