package Strings;
public class Occurrence3 {
   

    public static void main(String[] args) {
        System.out.println( occurrence3("abbcad", 0));

    }

    static StringBuilder occurrence3(String s, int i) {
        StringBuilder x = new StringBuilder();
        if (s.length() == i) {
            return x;
        }

        if (s.charAt(i) != 'a') {
            x.append(s.charAt(i));
        }
        x.append(occurrence3(s, i + 1));
        return x;
    }
}
