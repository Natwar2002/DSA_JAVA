import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Natwar Patidar";
        // charAt(index);
        System.out.println(name.charAt(0));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println("    Natwar      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}