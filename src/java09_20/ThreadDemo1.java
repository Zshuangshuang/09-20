package java09_20;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-20
 * Time:9:50
 **/
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
          @Override
          public void run(){
              for (int i = 0; i < 10000_0000; i++) {

              }
          }
        };
        System.out.println("线程开始前： "+thread.getState());
        thread.start();
        while(thread.isAlive()){
            System.out.println("线程进行中： "+thread.getState());
        }
        System.out.println("线程结束: "+thread.getState());
    }
}
