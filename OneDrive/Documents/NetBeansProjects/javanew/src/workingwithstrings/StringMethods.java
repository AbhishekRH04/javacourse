
package workingwithstrings;

class StringMethods {
    public static void main(String[] args) {
       

        // 1.Creating Strings
        String s1 = "Java Programming";
        String s2 = new String("Java Programming");

        // 2.Comparing Strings
        System.out.println("equals(): " + s1.equals(s2));        
        System.out.println("== operator: " + (s1 == s2));         

        // 3. Length of string
        System.out.println("Length: " + s1.length());               

        // 4. Character at index
        System.out.println("Char at index 5: " + s1.charAt(5));     

        // 5. Substring
        System.out.println("Substring: " + s1.substring(5));        
        System.out.println("Substring(0,4): " + s1.substring(0, 4));

        // 6. Case conversion
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        // 7. Searching
        System.out.println("indexOf('a'): " + s1.indexOf('a'));
        System.out.println("lastIndexOf('a'): " + s1.lastIndexOf('a'));
        System.out.println("Contains 'Java'? " + s1.contains("Java"));

        // 8. Replace
        System.out.println("Replace Java → Python: " + s1.replace("Java", "Python"));

        // 9. Trim
        String s3 = "   Hello World   ";
        System.out.println("Before trim: [" + s3 + "]");
        System.out.println("After trim: [" + s3.trim() + "]");

        // 10. Split
        String s4 = "Apple,Mango,Banana";
        String[] items = s4.split(",");
        System.out.println("After split:");
        for (String item : items) {
            System.out.println(item);
        }

        // 11. Concat
        System.out.println("Concat: " + s1.concat(" is powerful"));

        // 12. startsWith / endsWith
        System.out.println("Starts with 'Java'? " + s1.startsWith("Java"));
        System.out.println("Ends with 'ing'? " + s1.endsWith("ing"));

        // 13. toCharArray
        char[] chars = s1.toCharArray();
        System.out.println("Characters:");
        for (char c : chars) {
            System.out.print(c + " ");
        }

      

    }
    
}
