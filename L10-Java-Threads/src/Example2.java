public class Example2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Men Threadin run metodundan gelirem ve menim adim ");
    }

    public static void main(String[] args) {
        Example2 e2 = new Example2();

        Thread th = new Thread(e2);
        th.start();

    }
}
