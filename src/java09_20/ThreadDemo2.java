package java09_20;

/**
 * Created With IntelliJ IDEA.
 * Description:线程不安全：多线程并发执行代码，与逻辑结果不相符
 * User:ZouSS
 * Date:2020-09-20
 * Time:9:59
 **/
public class ThreadDemo2 {

    static class Counter{
        public int count;
      synchronized   public void increase(){
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(){
          @Override
          public void run(){
              for (int i = 0; i < 50000; i++) {
                  counter.increase();
              }
          }
        };

        Thread thread2 = new Thread(){
          @Override
          public void run(){
              for (int i = 0; i < 50000; i++) {
                  counter.increase();
              }
          }
        };
        thread1.join();
        thread2.start();

        thread1.start();

        thread2.join();
        System.out.println(counter.count);
    }
}
