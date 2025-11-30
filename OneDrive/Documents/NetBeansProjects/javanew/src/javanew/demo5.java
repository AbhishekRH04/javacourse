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
public class demo5 {
    public static void main(String[] args) {
        ExecutorService e=Executors.newFixedThreadPool(3);
        for(int i=0;i<10;i++)
        {
            int task=i;
            e.submit(()->{
                System.out.println("Task "+task+" executed by "+Thread.currentThread().getName());
                
            });
            
        }
        e.shutdown();
        
    }
}
