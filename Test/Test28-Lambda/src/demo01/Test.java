package demo01;

public class Test {
    public static void main(String[] args) {
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
             while (true){
                 try {
                     System.out.println(Thread.currentThread().getName()+"我是一个线程");
                     Thread.sleep(3000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
            }
        };
        new Thread(runnable).start();
    }
}
