public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'k';
        System.out.println(SearchInStrings(name, target));
    }

    static boolean SearchInStrings(String str, char target) {
        if(str.length() == 0) return false;

        // for(int i = 0; i < str.length(); i++) {
        //     if(str.charAt(i) == target) return true;
        // }

        for(char ch : str.toCharArray()) {
            if(ch == target) return true;
        }

        return false;
    }
}