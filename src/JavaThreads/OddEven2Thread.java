package JavaThreads;

class ODDEVEN {
    public static int i = 0;

    public synchronized void printeven() {

        for (; i < 10; i++) {
            if (i % 2 != 0)
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            System.out.println(i);
//	sleep(1000);
            notify();
        }
    }

    public synchronized void printodd() {
        for (; i < 10; i++) {
            if (i % 2 == 0)
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            System.out.println(i);
            notify();
        }
    }

}

public class OddEven2Thread {

    public static void main(String args[]) {

        ODDEVEN obj = new ODDEVEN();
        Thread t1 = new Thread(() -> obj.printeven());
        Thread t2 = new Thread(() -> obj.printodd());

        t1.start();
        t2.start();

    }
}
