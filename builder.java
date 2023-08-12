
import java.util.Scanner;

public class builder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");

        System.out.println(sb);

        for (int i = 0; i < sb.length(); i++) {

            System.out.println(sb.charAt(i));

        }

        sb.setCharAt(0, 'R');

        System.out.println(sb);

        // insertion

        StringBuilder name0 = sb.insert(0, 'T');

        System.out.println(name0);

        StringBuilder name1 = sb.delete(0, 2);

        System.out.println(name1);

        StringBuilder name2 = sb.insert(0, 'S');

        System.out.println(name2);

        StringBuilder sb1 = new StringBuilder("SUBH");

        sb1.append("A");

        sb1.append("M");

        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("ISSEM");

        for (int i = 0; i < sb2.length() / 2; i++) {

            int front = i;

            int back = sb2.length() - 1 - i;

            char frontChar = sb2.charAt(front);

            char backChar = sb2.charAt(back);

            sb2.setCharAt(front, backChar);

            sb2.setCharAt(back, frontChar);

        }
        System.out.println(sb2);

    }
}
