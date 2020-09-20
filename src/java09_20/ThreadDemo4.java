package java09_20;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-20
 * Time:20:51
 **/
public class ThreadDemo4 {
    public static void main(String[] args) {
        Object locker = new Object();
        Thread thread1 = new Thread(){
          @Override
          public void run(){
              Scanner scanner = new Scanner(System.in);
              System.out.println("请输入一个整数:");
              synchronized (locker){
                  int num = scanner.nextInt();
                  System.out.println("num = " + num);
              }

          }
        };
        thread1.start();

        Thread thread2 = new Thread(){
          @Override
          public void run(){
             while (true){
                 synchronized (locker){
                     System.out.println("线程2获取到锁");
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             }
          }
        };
        thread2.start();
    }
}
