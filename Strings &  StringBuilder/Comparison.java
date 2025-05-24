import java.util.ArrayList;

public class Comparison {
    public static void main(String[] args) {
        // String a = "Natwar";
        // String b = "Natwar";
        // System.out.println(a == b);
        prettyPrinting();
    }

    static void differentReference() {
        // Strings are immutable : for security reasons, coz...
        // By default two or more ref variables with same values of string refers to the
        // same String object in the string pool.
        // String pool is a memory storage area in the heap memory, where same values of
        // strings are stored and changes made to one could reflect to others also.

        // Check if a ref var is refering to the same value or different.
        String name = "Natwar";
        String name2 = "Natwar";
        // == checks if ref var is pointing to the same objects
        System.out.println(name == name2); // true: refering to the same string object

        // name3 is pointing to new object in the heap, outside of pool
        String name3 = new String("Natwar");
        System.out.println(name2 == name3); // false: name3 refers to the new string object

        // .equals checks if ref vars have same values
        System.out.println(name3.equals(name2)); // true: checks values

    }

    static void operators() {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);
        // Plus operator only works for premitive, it also works for other data types as
        // well but any of one operand must be a string.
        System.out.println("" + new ArrayList<>());
        System.out.println("Some" + new ArrayList<>());
    }

    static void prettyPrinting() {
        float a = 23.3953f;
        System.out.printf("Pretty print: %.2f", a); // Formats and round off also.
        String name = "Natwar";
        String cool = "cool";
        System.out.println();
        System.out.printf("My name is %s and I'm %s", name, cool);
    }
}