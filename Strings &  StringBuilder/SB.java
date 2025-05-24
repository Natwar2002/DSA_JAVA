public class SB {
    public static void main(String[] args) {
        // This is less optimized coz line no. 7 creates a new string objects everytime
        // which results in n^2 TC
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }
        System.out.println(series);
    }

    static void string_builder() {
        // This is more optimized coz stringBuilder modifies the existing string object
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}