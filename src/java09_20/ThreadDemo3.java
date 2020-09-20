package java09_20;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-20
 * Time:20:48
 **/
public class ThreadDemo3 {
    static class Test{
        private Object o = new Object();
        public void method(){
            synchronized (o){
                System.out.println("hehe");
            }
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.method();
    }
}
