import java.util.Scanner;

public class A118 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'o' && ch != 'y' &&
                ch != 'e' && ch != 'u' && ch != 'i') {

                result.append('.');
                result.append(ch);
            }
        }

        System.out.println(result);

        sc.close();
    }
}