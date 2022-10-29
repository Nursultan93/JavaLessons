import java.sql.SQLOutput;

public class TestThread {

    public static void main(String[] args) {
        DemoRunnable d1 = new DemoRunnable( "Elcin");

        DemoRunnable d2 = new DemoRunnable( "Nursultan");

        Thread thread = new Thread(d1);
        thread.start();

        Thread thread2 = new Thread(d2);
        thread2.start();
    }


}


class DemoRunnable implements Runnable{

    private String threadName;

    DemoRunnable(String name){
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Running -> "+ threadName);

        try {
            for (int i=4; i>0; i--){
                System.out.println("Thread: "+threadName +", " +i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ex){
            System.out.println("Thread: "+threadName +" xeta!");
        }
        System.out.println("Thread: "+threadName+ " exiting");
    }
}