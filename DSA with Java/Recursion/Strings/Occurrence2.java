package Strings;
public class Occurrence2 {
    static StringBuilder x = new StringBuilder();

    public static void main(String[] args) {
        System.out.println( occurrence2("abbcad", 0, x));

    }

    static StringBuilder occurrence2(String s, int i, StringBuilder x) {
        if (s.length() == i) {
            return x;
        }

        if (s.charAt(i) != 'a') {
            x.append(s.charAt(i));
        }
        occurrence2(s, i + 1, x);
        return x;
    }
}
