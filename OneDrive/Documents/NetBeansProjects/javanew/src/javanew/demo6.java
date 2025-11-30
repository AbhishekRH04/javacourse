/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javanew;
import java.util.concurrent.*;

/**
 *
 * @author abhis
 */

public class demo6 {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newCachedThreadPool();
        Callable<String> callable=(()->{
            Thread.sleep(5000);
            return "returned result is "+Thread.currentThread().getName();
        });
        System.out.println("submiting callable");
        Future<String> future =  pool.submit(callable);
        
        System.out.println("some other tasks ");
        System.out.println("future result  "+future.get());
        
        System.out.println("shutting down the executor");
        pool.shutdown();
    }
}
