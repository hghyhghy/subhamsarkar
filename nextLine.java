import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("YOUR NAME IS :" + name);

        // concatenation
        String firstName = "SUBHAM";

        String lastName = "SARKAR";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        System.out.println(fullName.length());

        for (int i = 0; i < fullName.length(); i++) {

            System.out.println(fullName.charAt(i));
        }
        String name1 = "Subham";

        String name2 = "Sarkar";

        if (name1.compareTo(name2) == 0) {

            System.out.println("STRINGS ARE EQUAL:");

        } else {
            System.out.println("STRINGS ARE NOT EQUAL:");
        }
        // substring

        String sentence = "MY NAME IS SUBHAM:";

        String name0 = sentence.substring(11, sentence.length());

        System.out.println(name0);

    }
}