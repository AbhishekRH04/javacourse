
package javanew;


class Counter {
    private int count = 0;

    public synchronized void increment() {   
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SyncSimple  {
    public static void main(String[] args) throws Exception {
        Counter c=new Counter();
        
        Runnable r =new Runnable(){
            public void run(){
            for(int i=0;i<1000;i++)
            c.increment();
            }
        };
        Thread t1= new Thread(r);
        Thread t2= new Thread(r);
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Final Count = " + c.getCount());
    }
}
