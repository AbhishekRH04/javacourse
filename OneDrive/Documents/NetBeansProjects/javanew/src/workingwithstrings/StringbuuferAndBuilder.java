/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingwithstrings;

/**
 *
 * @author abhis
 */
public class StringbuuferAndBuilder {
    public static void main(String[] args) {
         StringBuffer sb = new StringBuffer("Java");

        // append()
        sb.append(" Programming");
        System.out.println("append(): " + sb);

        // insert()
        sb.insert(4, " Language");
        System.out.println("insert(): " + sb);

        // replace()
        sb.replace(0, 4, "Python");
        System.out.println("replace(): " + sb);

        // delete()
        sb.delete(6, 15);
        System.out.println("delete(): " + sb);

        // reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);

        // capacity()
        StringBuffer sbCap = new StringBuffer();
        System.out.println("Default capacity: " + sbCap.capacity());
        sbCap.append("Hello this is a capacity test example");
        System.out.println("After append capacity: " + sbCap.capacity());

        // setLength()
        sbCap.setLength(10);
        System.out.println("setLength(10): " + sbCap);

        // --------------------------------
        // 2. StringBuilder Examples
        // --------------------------------
        System.out.println(" --------StringBuilder Examples ------------");

        StringBuilder sbu = new StringBuilder("Hello");

        // append()
        sbu.append(" World");
        System.out.println("append(): " + sbu);

        // insert()
        sbu.insert(5, " Java");
        System.out.println("insert(): " + sbu);

        // replace()
        sbu.replace(0, 5, "Hi");
        System.out.println("replace(): " + sbu);

        // delete()
        sbu.delete(3, 8);
        System.out.println("delete(): " + sbu);

        // reverse()
        sbu.reverse();
        System.out.println("reverse(): " + sbu);

       

      
    }
    
}
